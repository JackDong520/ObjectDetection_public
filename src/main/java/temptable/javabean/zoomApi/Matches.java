/**
  * Copyright 2019 bejson.com 
  */
package temptable.javabean.zoomApi;
import java.util.List;

/**
 * Auto-generated: 2019-07-07 17:50:20
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Matches {

    private Geoinfo geoinfo;
    private String description;
    private List<String> language;
    private String title;
    private List<String> ip;
    private List<String> waf;
    private List<String> component;
    private List<String> system;
    private String site;
    private List<Db> db;
    private String headers;
    private List<String> framework;
    private String timestamp;
    private String keywords;
    private List<Webapp> webapp;
    private List<Server> server;
    private List<String> domains;

    public Matches(Geoinfo geoinfo, String description, List<String> language, String title, List<String> ip, List<String> waf, List<String> component, List<String> system, String site, List<Db> db, String headers, List<String> framework, String timestamp, String keywords, List<Webapp> webapp, List<Server> server, List<String> domains) {
        this.geoinfo = geoinfo;
        this.description = description;
        this.language = language;
        this.title = title;
        this.ip = ip;
        this.waf = waf;
        this.component = component;
        this.system = system;
        this.site = site;
        this.db = db;
        this.headers = headers;
        this.framework = framework;
        this.timestamp = timestamp;
        this.keywords = keywords;
        this.webapp = webapp;
        this.server = server;
        this.domains = domains;
    }


    public Matches() {
    }

    public Geoinfo getGeoinfo() {
        return geoinfo;
    }

    public void setGeoinfo(Geoinfo geoinfo) {
        this.geoinfo = geoinfo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getLanguage() {
        return language;
    }

    public void setLanguage(List<String> language) {
        this.language = language;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getIp() {
        return ip;
    }

    public void setIp(List<String> ip) {
        this.ip = ip;
    }

    public List<String> getWaf() {
        return waf;
    }

    public void setWaf(List<String> waf) {
        this.waf = waf;
    }

    public List<String> getComponent() {
        return component;
    }

    public void setComponent(List<String> component) {
        this.component = component;
    }

    public List<String> getSystem() {
        return system;
    }

    public void setSystem(List<String> system) {
        this.system = system;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public List<Db> getDb() {
        return db;
    }

    public void setDb(List<Db> db) {
        this.db = db;
    }

    public String getHeaders() {
        return headers;
    }

    public void setHeaders(String headers) {
        this.headers = headers;
    }

    public List<String> getFramework() {
        return framework;
    }

    public void setFramework(List<String> framework) {
        this.framework = framework;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public List<Webapp> getWebapp() {
        return webapp;
    }

    public void setWebapp(List<Webapp> webapp) {
        this.webapp = webapp;
    }

    public List<Server> getServer() {
        return server;
    }

    public void setServer(List<Server> server) {
        this.server = server;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }
}