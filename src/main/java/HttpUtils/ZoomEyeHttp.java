package HttpUtils;

import com.google.gson.Gson;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.testng.annotations.Test;

import java.io.IOException;

public class ZoomEyeHttp {
    public String getZoomEyeJsonFromHttp() {
        String jsonString = new String();
        OkHttpClient client = new OkHttpClient();
        Request.Builder reqBuild = new Request.Builder();
        HttpUrl.Builder urlBuilder = HttpUrl.parse("https://api.zoomeye.org/web/search")
                .newBuilder();
        urlBuilder.addQueryParameter("query", "ip:23.230.118.232");
        Request request = reqBuild.url(urlBuilder.build()).addHeader("Authorization", "JWT eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZGVudGl0eSI6IjExMDk2NDgxMzlAcXEuY29tIiwiaWF0IjoxNTYyNTA4MDY3LCJuYmYiOjE1NjI1MDgwNjcsImV4cCI6MTU2MjU1MTI2N30.bkP2vY7wF1tmCrPxzo-I5ZY5iR9zn3uZYwIicUQr1VI").build();

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
        System.out.println(new ZoomEyeHttp().getZoomEyeJsonFromHttp());
        Gson gson = new Gson();
    }
}
