package HttpUtils;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.testng.annotations.Test;

import java.io.IOException;

public class EmailInfoHttp {
    public String getEmailInfoJsonFromHttp(String domain) {
        String jsonString = new String();
        OkHttpClient client = new OkHttpClient();
        Request.Builder reqBuild = new Request.Builder();
        HttpUrl.Builder urlBuilder = HttpUrl.parse("https://api.hunter.io/v2/domain-search")
                .newBuilder();
        urlBuilder.addQueryParameter("domain", "stripe.com");
        urlBuilder.addQueryParameter("api_key", "15cd617b726788a9de2fc54d874b703a5922ef96");
        //Request request = reqBuild.url(urlBuilder.build()).addHeader("Authorization", "JWT eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZGVudGl0eSI6IjExMDk2NDgxMzlAcXEuY29tIiwiaWF0IjoxNTYyNDkyMjI5LCJuYmYiOjE1NjI0OTIyMjksImV4cCI6MTU2MjUzNTQyOX0.-C3jv2zFy0akFrHUUntuHVPa7DDgIYzYeeSmdwi1HTw").build();
        Request request = reqBuild.url(urlBuilder.build()).build();
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
        System.out.println(new EmailInfoHttp().getEmailInfoJsonFromHttp("00"));
    }
}
