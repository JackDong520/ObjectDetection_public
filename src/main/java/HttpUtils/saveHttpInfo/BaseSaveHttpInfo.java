package HttpUtils.saveHttpInfo;

import Dao.HttpInfoDao.HttpEmailDao;
import Dao.HttpInfoDao.HttpEmailDataDao;
import Dao.HttpInfoDao.HttpEmailSourceDao;
import com.google.gson.Gson;

public class BaseSaveHttpInfo {
    static protected HttpEmailDataDao httpEmailDataDao;
    static protected HttpEmailDao httpEmailDao;
    static protected HttpEmailSourceDao httpEmailSourceDao;
    static protected Gson gson ;

    static {
        httpEmailDataDao = new HttpEmailDataDao();
        httpEmailDao = new HttpEmailDao();
        httpEmailSourceDao = new HttpEmailSourceDao();
        gson = new Gson();
    }
}
