package HttpUtils.saveHttpInfo;

import Dao.HttpEmailDao;
import Dao.HttpEmailDataDao;
import Dao.HttpEmailSourceDao;
import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;

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
