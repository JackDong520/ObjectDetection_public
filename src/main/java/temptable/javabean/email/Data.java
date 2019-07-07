/**
  * Copyright 2019 bejson.com 
  */
package temptable.javabean.email;
import java.util.List;

/**
 * Auto-generated: 2019-07-07 19:27:41
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Data {

    private String domain;
    private boolean disposable;
    private boolean webmail;
    private String pattern;
    private String organization;
    private List<Emails> emails;
    public void setDomain(String domain) {
         this.domain = domain;
     }
     public String getDomain() {
         return domain;
     }

    public void setDisposable(boolean disposable) {
         this.disposable = disposable;
     }
     public boolean getDisposable() {
         return disposable;
     }

    public void setWebmail(boolean webmail) {
         this.webmail = webmail;
     }
     public boolean getWebmail() {
         return webmail;
     }

    public void setPattern(String pattern) {
         this.pattern = pattern;
     }
     public String getPattern() {
         return pattern;
     }

    public void setOrganization(String organization) {
         this.organization = organization;
     }
     public String getOrganization() {
         return organization;
     }

    public void setEmails(List<Emails> emails) {
         this.emails = emails;
     }
     public List<Emails> getEmails() {
         return emails;
     }

}