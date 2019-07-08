package service.DataService;

import graphjavabean.EmailDetailed.EmailDetailed;
import graphjavabean.EmailDetailed.EmailInfoList;
import org.testng.annotations.Test;
import temptable.temp.HttpEmailEntity;
import temptable.temp.HttpEmaildataEntity;
import temptable.temp.HttpEmailsourceEntity;

import java.util.ArrayList;

public class EmailDataService extends BaseDataService {


    public String getDetailedEmailInfoFromEmail(String email) {
        return gson.toJson(getSingleEmailDetailedInfoFromEmail(email));
    }


    public String getEmailInfoListFromDomain(String domain) {
        String JsonStirng = getEmailInfoListFromDomainFrDB(domain);
        if (JsonStirng != null)
            return JsonStirng;
        return getEmailInfoListFromDomainFrApi(domain);
    }

    /**
     * 可能需要让线程休息一会 然数据库存储数据
     * @param domain
     * @return
     */
    public String getEmailInfoListFromDomainFrApi(String domain) {
        saveHttpEmailInfo.saveHttpEmailInfo(domain);
        //
        System.out.println("get info from internet");
        return getEmailInfoListFromDomainFrDB(domain);
    }

    /**
     * 在数据库中请求数据
     *
     * @param domain
     * @return
     */
    public String getEmailInfoListFromDomainFrDB(String domain) {
        EmailInfoList emailInfoList = new EmailInfoList(domain,"DB", getEmailDetailedListFromHttpEmaildatalist(getHttpEmaildataListFromDomain(domain)));
        if (emailInfoList.getEmailDetaileds()==null)
            return null;
        return gson.toJson(emailInfoList);
    }

    private EmailDetailed getSingleEmailDetailedInfoFromEmail(String email) {
        HttpEmailEntity httpEmailEntity;
        HttpEmailsourceEntity httpEmailsourceEntity;
        EmailDetailed emailDetailed = new EmailDetailed();
        httpEmailsourceEntity = httpEmailSourceDao.selectSingleHttpEmailInfoFromEmail(email);
        httpEmailEntity = httpEmailDao.selectSingleHttpEmailInfoFromEmail(email);
        if (httpEmailEntity == null || httpEmailsourceEntity == null)
            return null;
        emailDetailed.setDepartment(httpEmailEntity.getDepartment());
        emailDetailed.setFirst_name(httpEmailEntity.getFirstName());
        emailDetailed.setLast_name(httpEmailEntity.getLastName());
        emailDetailed.setPosition(httpEmailEntity.getPosition());
        emailDetailed.setSeniority(httpEmailEntity.getSeniority());
        emailDetailed.setLinkedin(httpEmailEntity.getLinkedin());
        emailDetailed.setDomain(httpEmailsourceEntity.getDomain());
        emailDetailed.setUri(httpEmailsourceEntity.getUri());
        return emailDetailed;
    }

    private ArrayList<HttpEmaildataEntity> getHttpEmaildataListFromDomain(String domain) {
        return httpEmailDataDao.selectHttpEmailDataInfoFromDomain(domain);
    }

    private ArrayList<EmailDetailed> getEmailDetailedListFromHttpEmaildatalist(ArrayList<HttpEmaildataEntity> httpEmaildataEntities) {
        if (httpEmaildataEntities == null)
            return null;
        ArrayList<EmailDetailed> emailDetaileds = new ArrayList<>();
        for (int i = 0; i < httpEmaildataEntities.size(); i++) {
            emailDetaileds.add(getSingleEmailDetailedInfoFromEmail(httpEmaildataEntities.get(i).getEmails()));
        }
        return emailDetaileds;
    }

    @Test
    public void test() {
        System.out.println(new EmailDataService().getEmailInfoListFromDomain("stipe.com"));
    }

}
