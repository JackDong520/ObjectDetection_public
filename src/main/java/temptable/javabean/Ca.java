package temptable.javabean;

import java.util.List;

public class Ca {
    private String name;
    private String name1;


    private List<Cb> ages;

    public Ca(String name, String name1, List<Cb> ages) {
        this.name = name;
        this.name1 = name1;
        this.ages = ages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public List<Cb> getAges() {
        return ages;
    }

    public void setAges(List<Cb> ages) {
        this.ages = ages;
    }
}
