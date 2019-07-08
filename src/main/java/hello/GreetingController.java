package hello;

import java.util.concurrent.atomic.AtomicLong;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.graphSerice.BugInfoGraphService;
import service.graphSerice.DomainGraphService;
import service.graphSerice.IpinfoGraphService;
import service.graphSerice.SearchService;

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

    @RequestMapping("/getSearchInfoGraphFromKey")
    public String getSearchInfoGraphFromKey(@RequestParam(value="Keywords", defaultValue="google") String Keywords) {
        return new SearchService().getSearchInfoGraphFromKey(Keywords);
    }

    @RequestMapping("/getBugInfoGraphFormKey")
    public String getBugInfoGraphFormKey(@RequestParam(value="Keywords", defaultValue="google") String Keywords) {
        return new SearchService().getBugInfoGraphFormKey(Keywords);
    }

    @RequestMapping("/getDoaminGraphFromDomain")
    public String getDoaminGraphFromDomain(@RequestParam(defaultValue="taobao.com") String domain) {
        System.out.println(domain);
        return new DomainGraphService().getDoaminGraphFromDomain(domain);
    }

    @RequestMapping("/getIpGraphFromIp")
    public String getIpGraphFromIp(@RequestParam( defaultValue="127.0.0.1") String ip) {
        System.out.println(ip);
        return new IpinfoGraphService().getIpGraphFromIp(ip);
    }

    @RequestMapping("/getBugInfoGraphFromIp")
    public String getBugInfoGraphFromIp(@RequestParam(value="ip" ,defaultValue="127.0.0.1") String ip) {
        System.out.println(ip);
        return new BugInfoGraphService().getBugInfoGraphFromIp(ip);
    }











}