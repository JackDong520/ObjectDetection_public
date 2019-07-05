package hello;

import java.util.concurrent.atomic.AtomicLong;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.graphservice.DomainGraph;
import service.graphservice.SearchService;

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

    @RequestMapping("/getGraphFromDomain")
    public String getGraphFromDomain(@RequestParam(value="domain", defaultValue="com") String domain) {
        return new DomainGraph().getGraphFromDomain(domain);
    }

    @RequestMapping("/getSearchInfoGraphFromKey")
    public String getSearchInfoGraphFromKey(@RequestParam(value="Keywords", defaultValue="google") String Keywords) {
        return new SearchService().getSearchInfoGraphFromKey(Keywords);
    }

    @RequestMapping("/getBugInfoGraphFormKey")
    public String getBugInfoGraphFormKey(@RequestParam(value="Keywords", defaultValue="google") String Keywords) {
        return new SearchService().getBugInfoGraphFormKey(Keywords);
    }






}