package hello;

import java.util.concurrent.atomic.AtomicLong;

import com.google.gson.Gson;
import javabean.TestEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    static Gson gson = new Gson();//json处理工具，处理给前端返回的json数据

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {

        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping("/getHomePageInfo")
    public String getHomePageInfo() {

        return "";
    }
    @RequestMapping("/testjson")
    public String testjson() {
        TestEntity testEntity = new TestEntity();
        testEntity.setNum(20);
        testEntity.setName("jack");
        String jsonString = gson.toJson(testEntity);
        return jsonString;
    }

}