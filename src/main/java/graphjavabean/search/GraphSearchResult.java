package graphjavabean.search;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class GraphSearchResult {
    private String searchKey;//查询数据的关键词
    private ArrayList<GraphSearchInfo> graphSearchInfos;//每条查询结果的具体信息

    public GraphSearchResult(String searchKey, ArrayList<GraphSearchInfo> graphSearchInfos) {
        this.searchKey = searchKey;
        this.graphSearchInfos = graphSearchInfos;
    }

    public GraphSearchResult() {
    }

    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    public ArrayList<GraphSearchInfo> getGraphSearchInfos() {
        return graphSearchInfos;
    }

    public void setGraphSearchInfos(ArrayList<GraphSearchInfo> graphSearchInfos) {
        this.graphSearchInfos = graphSearchInfos;
    }

    @Test
    public void test() {

    }
}
