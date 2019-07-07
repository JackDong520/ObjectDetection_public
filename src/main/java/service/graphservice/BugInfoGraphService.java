package service.graphservice;


import com.google.gson.Gson;
import graphjavabean.BugSearch.GraphBugInfo;
import graphjavabean.BugSearch.GraphBugSearch;
import graphjavabean.BugSearch.GraphPluginBug;
import temptable.javabean.BuginfoEntity;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class BugInfoGraphService extends BaseService {


    public String getBugInfoGraphFromIp(String ip) {

        ArrayList<BuginfoEntity> buginfoEntities = getBugInfoFromIp(ip);
        ArrayList<GraphBugInfo> bugInfos_a = new ArrayList<>();
        ArrayList<GraphBugInfo> bugInfos_b = new ArrayList<>();
        ArrayList<GraphBugInfo> bugInfos_c = new ArrayList<>();
        ArrayList<GraphBugInfo> bugInfos_d = new ArrayList<>();
        for (int i = 0; i < buginfoEntities.size(); i++) {
            if (buginfoEntities.get(i).getPlugin().equals("wordpress") ) {
                bugInfos_a.add(bugInfoToGraphInfo(buginfoEntities.get(i)));
            }
            if (buginfoEntities.get(i).getPlugin().equals("apache httpd")) {
                bugInfos_b.add(bugInfoToGraphInfo(buginfoEntities.get(i)));
            }
            if (buginfoEntities.get(i).getPlugin().equals("microsoft iis httpd")) {
                bugInfos_c.add(bugInfoToGraphInfo(buginfoEntities.get(i)));
            }
            if (buginfoEntities.get(i).getPlugin().equals("nginx")) {
                bugInfos_d.add(bugInfoToGraphInfo(buginfoEntities.get(i)));
            }
        }
        ArrayList<GraphPluginBug> graphPluginBugs = new ArrayList<>();
        graphPluginBugs.add(new GraphPluginBug("wordpress", bugInfos_a));
        graphPluginBugs.add(new GraphPluginBug("apache httpd", bugInfos_b));
        graphPluginBugs.add(new GraphPluginBug("microsoft iis httpd", bugInfos_c));
        graphPluginBugs.add(new GraphPluginBug("nginx", bugInfos_d));


        GraphBugSearch graphBugSearch = new GraphBugSearch(ip, graphPluginBugs);

        return new Gson().toJson(graphBugSearch);
    }

    public ArrayList<BuginfoEntity> getBugInfoFromIp(String ip) {
        return bugInfoDao.selectDomainInfoFromIp(ip);
    }

    public GraphBugInfo bugInfoToGraphInfo(BuginfoEntity buginfoEntity) {
        GraphBugInfo graphBugInfo = new GraphBugInfo();
        graphBugInfo.setBugLevel(buginfoEntity.getBuglevel());
        graphBugInfo.setBugName(buginfoEntity.getBugname());
        graphBugInfo.setBugStatus(buginfoEntity.getBugstatus());
        graphBugInfo.setSSVID(buginfoEntity.getSsvid());
        graphBugInfo.setSubmitTime(buginfoEntity.getSubmittime());
        return graphBugInfo;
    }
    @Test
    public void test(){

        System.out.println(new BugInfoGraphService().getBugInfoGraphFromIp("127.0.0.1"));
    }

}


