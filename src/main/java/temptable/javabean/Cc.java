package temptable.javabean;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class Cc {
    private String name;
    private String age;

    public Cc() {
    }

    public Cc(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Test
    public void test(){
        Cb cb =new Cb("s");
        Cb cb1 =new Cb("s");
        ArrayList<Cb> cbs = new ArrayList<>();
        cbs.add(cb);
        cbs.add(cb1);


        Ca ca = new Ca("s","s",cbs);
        Cc cc =new Cc(ca.getName(),ca.getAges().get(0).getAge());
    }
}
