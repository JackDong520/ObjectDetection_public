package HttpUtils;

import com.google.gson.Gson;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.testng.annotations.Test;
import temptable.javabean.zoomApi.ZoomEyeInfo;

import java.io.IOException;

public class ZoomEyeHttp {
    public String getZoomEyeJsonFromHttp() {
        String jsonString = new String();
        OkHttpClient client = new OkHttpClient();
        Request.Builder reqBuild = new Request.Builder();
        HttpUrl.Builder urlBuilder = HttpUrl.parse("https://api.zoomeye.org/web/search")
                .newBuilder();
        urlBuilder.addQueryParameter("query", "ip:23.230.118.232");
        Request request = reqBuild.url(urlBuilder.build()).addHeader("Authorization", "JWT eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZGVudGl0eSI6InNfeF96aGFuZ0AxNjMuY29tIiwiaWF0IjoxNTYyNTYwODMyLCJuYmYiOjE1NjI1NjA4MzIsImV4cCI6MTU2MjYwNDAzMn0.ysc4ErbUnLP5jBovwZp_DM1FQQjkMB3BciKoxSUoju8").build();

        try (Response response = client.newCall(request).execute()) {
            jsonString = response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        jsonString.replace("-", "_");
        //System.out.println(jsonString);
        return jsonString;
    }
    @Test
    public void test(){

        Gson gson = new Gson();
        String jsonString = new ZoomEyeHttp().getZoomEyeJsonFromHttp();
        System.out.println(jsonString);
        ZoomEyeInfo zoomEyeInfo =gson.fromJson(jsonString , ZoomEyeInfo.class);
        Gson gson1 = new Gson();
    }
}
