package service.graphservice;

import com.google.gson.Gson;
import graphjavabean.BugSearch.GraphBugInfo;
import graphjavabean.BugSearch.GraphBugSearch;
import graphjavabean.BugSearch.GraphPluginBug;
import graphjavabean.search.GraphSearchInfo;
import graphjavabean.search.GraphSearchResult;

import java.util.ArrayList;

public class SearchService {
    //根据关键词来查询结果然后返回Json数据
    public String getSearchInfoGraphFromKey(String keyWords) {
        String jsonString;
        GraphSearchInfo graphSearchInfo = new GraphSearchInfo();
        graphSearchInfo.setIp("70.35.195.129");
        graphSearchInfo.setDomain(null);
        graphSearchInfo.setPort("8182/http");
        graphSearchInfo.setIdc("IDC");
        graphSearchInfo.setCountry("United States,Lenexa");
        graphSearchInfo.setTime("2019-07-05 20:55");
        graphSearchInfo.setDetailedInfo("HTTP/1.1 200 OK\n" +
                "X-Powered-By: Express\n" +
                "Accept-Ranges: bytes\n" +
                "Cache-Control: public, max-age=0\n" +
                "Last-Modified: Mon, 13 Mar 2017 10:25:20 GMT\n" +
                "ETag: W/\"1618-15ac7336a80\"\n" +
                "Content-Type: text/html; charset=UTF-8\n" +
                "Content-Length: 5656\n" +
                "Date: Fri, 05 Jul 2019 12:55:53 GMT\n" +
                "Connection: close\n" +
                "\n" +
                "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "  <meta charset=\"UTF-8\" />\n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "  <title>Gimper Cloud - Admin Page</title>\n" +
                "  <link href=\"./bootstrap.min.css\" rel=\"stylesheet\">\n" +
                "  <!-- Website CSS style -->\n" +
                "  <link rel=\"stylesheet\" type=\"text/css\" href=\"main.css\">\n" +
                "  <!-- Website Font style -->\n" +
                "\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css\">\n" +
                "\t\n" +
                "\t<!-- Google Fonts -->\n" +
                "\t<link href='https://fonts.googleapis.com/css?family=Passion+One' rel='stylesheet' type='text/css'>\n" +
                "\t<link href='https://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'>\n" +
                "  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n" +
                "  <!-- Latest compiled and minified JavaScript -->\n" +
                "<script src=\"./bootstrap.min.js\"></script>\n" +
                "<!-- Latest compiled and minified CSS -->\n" +
                "<link rel=\"stylesheet\" href=\"./bootstrap-select.min.css\">\n" +
                "\n" +
                "<!-- Latest compiled and minified JavaScript -->\n" +
                "<script src=\"./bootstrap-select.min.js\"></script>\n" +
                "\n" +
                "<!-- (Optional) Latest compiled and minified JavaScript translation files -->\n" +
                "<script src=\"./i18n/defaults-en_US.min.js\"></script>\n" +
                "\n" +
                "  <script>\n" +
                "$(document).ready(function() {\n" +
                "\tfunction reloadTable(){\n" +
                "\t\tvar serviceList;\n" +
                "\t\t$(\"#service-table > tbody\").empty();\n" +
                "\t\t$.ajax({\n" +
                "\t\turl: 'get_services_list',\n" +
                "\t\ttype: 'GET',\n" +
                "\t\tsuccess: function(data) {\n" +
                "\t\t\t//console.log(data.msg);\n" +
                "\t\t\tif(data.success == false)\n" +
                "\t\t\t{\n" +
                "\t\t\t\t$(\"#message\").html(data.msg);\n" +
                "\t\t\t\treturn;\n" +
                "\t\t\t}\n" +
                "\t\t\tserviceList = data.msg;\n" +
                "\t\t\tfor(i = 0; i< data.msg.length; i++)\n" +
                "\t\t\t{\n" +
                "\t\t\t\t$(\"#service-table\").last().append('<tr><td>' + i + '</td>' +\n" +
                "\t\t\t\t'<td>' +serviceList[i].name + '</td>' +\n" +
                "\t\t\t\t'<td>' +serviceList[i].desc + '</td>' +\n" +
                "\t\t\t\t'<td>' +serviceList[i].pid + '</td>' +\n" +
                "\t\t\t\t'<td class=\".status\"> Off </td>' +\n" +
                "\t\t\t\t'<td><button class=\"btnStart\">Start</button></td>' +\n" +
                "\t\t\t\t'<td><button class=\"btnStop\">Stop</button></td>' +\n" +
                "\t\t\t\t'<td><button class=\"btnReStart\">ReStart</button></td>' +\n" +
                "\t\t\t\t'</tr>');\n" +
                "\t\t\t}\n" +
                "\t\t\treloadData();\n" +
                "\t\t}\n" +
                "\t\t});\n" +
                "\t}\n" +
                "\tfunction reloadData(){\n" +
                "\t\tvar serviceList;\n" +
                "\t\t\n" +
                "\t\t\t$.ajax({\n" +
                "\t\t\turl: 'get_services_status',\n" +
                "\t\t\ttype: 'GET',\n" +
                "\t\t\tsuccess: function(data) {\n" +
                "\t\t\t\tif(data.success == false)\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t$(\"#message\").html(data.msg);\n" +
                "\t\t\t\t\treturn;\n" +
                "\t\t\t\t}\n" +
                "\t\t\t\tfor(i = 0; i < data.msg.length; i++)\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t$('#service-table tr:nth-child('+ (i+1) +') td:nth-child(' + 5 + ')').html(data.msg[i]);\n" +
                "\t\t\t\t\tif(data.msg[i] === 'on')\n" +
                "\t\t\t\t\t\t$('#service-table tr:nth-child('+ (i+1) +') td:nth-child(' + 5 + ')').css(\"color\", \"green\");\n" +
                "\t\t\t\t\t\telse\n" +
                "\t\t\t\t\t\t$('#service-table tr:nth-child('+ (i+1) +') td:nth-child(' + 5 + ')').css(\"color\", \"red\");\n" +
                "\t\t\t\t}\n" +
                "\n" +
                "\t\t\t\t//reread to update PID\n" +
                "\t\t\t\t$.ajax({\n" +
                "\t\t\t\turl: 'get_services_list',\n" +
                "\t\t\t\ttype: 'GET',\n" +
                "\t\t\t\tsuccess: function(data) {\n" +
                "\t\t\t\t\t//console.log(data.msg);\n" +
                "\t\t\t\t\tif(data.success == false)\n" +
                "\t\t\t\t\t{\n" +
                "\t\t\t\t\t\t$(\"#message\").html(data.msg);\n" +
                "\t\t\t\t\t\treturn;\n" +
                "\t\t\t\t\t}\n" +
                "\t\t\t\t\tfor(i = 0; i< data.msg.length; i++)\n" +
                "\t\t\t\t\t{\n" +
                "\t\t\t\t\t\t$('#service-table tr:nth-child('+ (i+1) +') td:nth-child(' + 4 + ')').html(data.msg[i].pid);\n" +
                "\t\t\t\t\t\t//serviceList[i].name\n" +
                "\t\t\t\t\t}\n" +
                "\t\t\t\t}\n" +
                "\t\t\t\t});\n" +
                "\t\t\t}\n" +
                "\t\t});\n" +
                "\t\t\n" +
                "\t}\n" +
                "\twindow.setInterval(reloadData, 5000);\n" +
                "\n" +
                "\treloadTable();\n" +
                "\n" +
                "\t$(\"#service-table\").on('click','.btnStart',function(){\n" +
                "\t// get the current row\n" +
                "\tvar currentRow=$(this).closest(\"tr\"); \n" +
                "\tvar id =currentRow.find(\"td:eq(0)\").text();\n" +
                "\t$.ajax({\n" +
                "\t\t\turl: \"start\",\n" +
                "\t\t\ttype: 'GET',\n" +
                "\t\t\tdata: 'id=' + id,\n" +
                "\t\t\tsuccess: function(data) {\n" +
                "\t\t\t\t//location.reload();\n" +
                "\t\t\t\tif(data.success == false)\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t$(\"#message\").html(data.msg);\n" +
                "\t\t\t\t\treturn;\n" +
                "\t\t\t\t}\n" +
                "\t\t\t\treloadData();\n" +
                "\t\t\t}\n" +
                "\t\t});\n" +
                "\t});\n" +
                "\t$(\"#service-table\").on('click','.btnStop',function(){\n" +
                "\t\t// get the current row\n" +
                "\t\tvar currentRow=$(this).\n" +
                "\n");

        ArrayList<GraphSearchInfo> graphSearchInfos = new ArrayList<>();
        graphSearchInfos.add(graphSearchInfo);
        graphSearchInfos.add(graphSearchInfo);
        graphSearchInfos.add(graphSearchInfo);
        graphSearchInfos.add(graphSearchInfo);
        graphSearchInfos.add(graphSearchInfo);
        GraphSearchResult graphSearchResult = new GraphSearchResult();
        graphSearchResult.setSearchKey("google");
        graphSearchResult.setGraphSearchInfos(graphSearchInfos);
        Gson gson = new Gson();
        jsonString = gson.toJson(graphSearchResult);
        return jsonString;
    }

    public String getBugInfoGraphFormKey(String keyWords){
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

        return gson.toJson(graphBugSearch);
    }
}
