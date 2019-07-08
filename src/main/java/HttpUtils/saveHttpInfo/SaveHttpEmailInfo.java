package HttpUtils.saveHttpInfo;

import HttpUtils.EmailInfoHttp;


import org.testng.annotations.Test;
import temptable.javabean.email.EmailInfo;
import temptable.temp.HttpEmailEntity;
import temptable.temp.HttpEmaildataEntity;
import temptable.temp.HttpEmailsourceEntity;

import java.util.ArrayList;

public class SaveHttpEmailInfo extends BaseSaveHttpInfo {
    public void saveHttpEmailInfo(String domain) {
        EmailInfoHttp emailInfoHttp = new EmailInfoHttp();
        String jsonstring = emailInfoHttp.getEmailInfoJsonFromHttp(domain);
        EmailInfo emailInfo;
        emailInfo = gson.fromJson(jsonstring, EmailInfo.class);
        //System.out.println(emailInfo.toString());
        ArrayList<HttpEmaildataEntity> datatables = new ArrayList<>();
        ArrayList<HttpEmailEntity> emailtables = new ArrayList<>();
        ArrayList<HttpEmailsourceEntity> emailsourcetalbes = new ArrayList<>();
        //HttpEmaildataEntity
        for (int i = 0; i < emailInfo.getData().getEmails().size(); i++) {
            HttpEmaildataEntity data = new HttpEmaildataEntity();
            data.setDomain(emailInfo.getData().getDomain());
            data.setOrganization(emailInfo.getData().getOrganization());
            data.setEmails(emailInfo.getData().getEmails().get(i).getValue());
            datatables.add(data);//插入
            /**
             *
             */
            httpEmailDataDao.saveHttpEmailDataInfo(data);


            //HttpEmailEntity
            HttpEmailEntity emailtable = new HttpEmailEntity();
            emailtable.setEmail(emailInfo.getData().getEmails().get(i).getValue());
            emailtable.setDepartment(emailInfo.getData().getEmails().get(i).getDepartment());

            emailtable.setFirstName(emailInfo.getData().getEmails().get(i).getFirst_name());
            emailtable.setLastName(emailInfo.getData().getEmails().get(i).getLast_name());
            emailtable.setLinkedin(emailInfo.getData().getEmails().get(i).getLinkedin());
            emailtable.setPhoneNumber(emailInfo.getData().getEmails().get(i).getPhone_number());
            emailtable.setPosition(emailInfo.getData().getEmails().get(i).getPosition());
            emailtable.setSeniority(emailInfo.getData().getEmails().get(i).getSeniority());
            emailtable.setTwitter(emailInfo.getData().getEmails().get(i).getTwitter());
            emailtable.setType(emailInfo.getData().getEmails().get(i).getType());
            emailtables.add(emailtable);//插入
            /**
             *
             */
            httpEmailDao.saveHttpEmailInfo(emailtable);

            //EmailSourceTable
            for (int j = 0; j < emailInfo.getData().getEmails().get(i).getSources().size(); j++) {
                HttpEmailsourceEntity emailsourcetable = new HttpEmailsourceEntity();
                emailsourcetable.setEmail(emailInfo.getData().getEmails().get(i).getValue());
                emailsourcetable.setDomain(emailInfo.getData().getEmails().get(i).getSources().get(j).getDomain());
                emailsourcetable.setStillOnPage(emailInfo.getData().getEmails().get(i).getSources().get(j).getStill_on_page() ? 1 : 0);
                emailsourcetable.setUri(emailInfo.getData().getEmails().get(i).getSources().get(j).getUri());
                emailsourcetalbes.add(emailsourcetable);//插入
                /**
                 *
                 */
                httpEmailSourceDao.saveHttpEmailSourceInfo(emailsourcetable);
            }

        }

    }
    @Test
    public void test(){
        new SaveHttpEmailInfo().saveHttpEmailInfo("");
    }
}
