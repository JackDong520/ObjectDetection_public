package graphjavabean.BugSearch;

import com.google.gson.Gson;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class GraphBugSearch {

    private String searchKey;//搜索该漏洞的关键词
    private ArrayList<GraphPluginBug> graphPluginBugs;

    public GraphBugSearch(ArrayList<GraphPluginBug> graphPluginBugs) {
        this.graphPluginBugs = graphPluginBugs;
    }

    public GraphBugSearch() {
    }

    public ArrayList<GraphPluginBug> getGraphPluginBugs() {
        return graphPluginBugs;
    }

    public GraphBugSearch(String searchKey, ArrayList<GraphPluginBug> graphPluginBugs) {
        this.searchKey = searchKey;
        this.graphPluginBugs = graphPluginBugs;
    }

    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    public void setGraphPluginBugs(ArrayList<GraphPluginBug> graphPluginBugs) {
        this.graphPluginBugs = graphPluginBugs;
    }

    @Test
    public void test() {
        GraphBugInfo graphBugInfo = new GraphBugInfo();
        graphBugInfo.setSSVID("SSV-98004");
        graphBugInfo.setSubmitTime("2019-06-12");
        graphBugInfo.setBugLevel("中危");
        graphBugInfo.setBugName("WordPress 5.x 某页面存在暴力破解漏洞");
        graphBugInfo.setBugStatus("有详细信息");

        ArrayList<GraphBugInfo> graphBugInfos = new ArrayList<>();
        graphBugInfos.add(graphBugInfo);
        graphBugInfos.add(graphBugInfo);
        graphBugInfos.add(graphBugInfo);
        graphBugInfos.add(graphBugInfo);

        GraphPluginBug graphPluginBug = new GraphPluginBug();
        graphPluginBug.setGraphBugInfos(graphBugInfos);
        graphPluginBug.setPluginName("WordPress");

        ArrayList<GraphPluginBug>graphPluginBugs = new ArrayList<>();
        graphPluginBugs.add(graphPluginBug);
        graphPluginBugs.add(graphPluginBug);
        graphPluginBugs.add(graphPluginBug);

        GraphBugSearch graphBugSearch = new GraphBugSearch();
        graphBugSearch.setGraphPluginBugs(graphPluginBugs);
        graphBugSearch.setSearchKey("google");
        Gson gson = new Gson();
        System.out.println(gson.toJson(graphBugSearch));
    }
}
