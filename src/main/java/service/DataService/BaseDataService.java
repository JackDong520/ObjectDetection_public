package service.DataService;

import Dao.HttpInfoDao.HttpEmailDao;
import Dao.HttpInfoDao.HttpEmailDataDao;
import Dao.HttpInfoDao.HttpEmailSourceDao;
import HttpUtils.EmailInfoHttp;
import HttpUtils.saveHttpInfo.SaveHttpEmailInfo;
import com.google.gson.Gson;
import org.omg.CORBA.PUBLIC_MEMBER;

public class BaseDataService {
    static HttpEmailSourceDao httpEmailSourceDao;
    static HttpEmailDao httpEmailDao;
    static HttpEmailDataDao httpEmailDataDao;
    static EmailInfoHttp emailInfoHttp;
    static SaveHttpEmailInfo saveHttpEmailInfo;
    public static Gson gson;

    static {
        httpEmailSourceDao = new HttpEmailSourceDao();
        httpEmailDao = new HttpEmailDao();
        httpEmailDataDao = new HttpEmailDataDao();
        emailInfoHttp= new EmailInfoHttp();
        saveHttpEmailInfo = new SaveHttpEmailInfo();
        gson = new Gson();
    }
}
