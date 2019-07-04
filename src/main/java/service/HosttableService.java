package service;

import Dao.HosttableDao;
import com.google.gson.Gson;
import javabean.HosttableEntity;
import org.testng.annotations.Test;

public class HosttableService {
    static private HosttableDao hosttableDao;
    static private Gson gson;
    static {
        hosttableDao = new HosttableDao();
        gson = new Gson();
    }
    public String getHosttableInfo(int time){
        HosttableEntity hosttableEntity = hosttableDao.selectSingleUser(time);
        System.out.println(hosttableEntity);
        System.out.println(hosttableEntity.getBroadbandRouter());
        String jsonString = gson.toJson(hosttableEntity);
        return jsonString;
    }

    @Test
    public void test(){
        System.out.println(new HosttableService().getHosttableInfo(1));
    }
}
