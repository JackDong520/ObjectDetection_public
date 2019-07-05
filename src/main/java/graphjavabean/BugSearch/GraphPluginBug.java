package graphjavabean.BugSearch;

import java.util.ArrayList;

public class GraphPluginBug {
    private String pluginName;
    ArrayList<GraphBugInfo>graphBugInfos;

    public GraphPluginBug(String pluginName, ArrayList<GraphBugInfo> graphBugInfos) {
        this.pluginName = pluginName;
        this.graphBugInfos = graphBugInfos;
    }

    public GraphPluginBug() {
    }

    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    public ArrayList<GraphBugInfo> getGraphBugInfos() {
        return graphBugInfos;
    }

    public void setGraphBugInfos(ArrayList<GraphBugInfo> graphBugInfos) {
        this.graphBugInfos = graphBugInfos;
    }
}
