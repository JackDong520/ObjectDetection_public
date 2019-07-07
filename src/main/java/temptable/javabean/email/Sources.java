/**
  * Copyright 2019 bejson.com 
  */
package temptable.javabean.email;
import java.util.Date;

/**
 * Auto-generated: 2019-07-07 19:27:41
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Sources {

    private String domain;
    private String uri;
    private Date extracted_on;
    private Date last_seen_on;
    private boolean still_on_page;
    public void setDomain(String domain) {
         this.domain = domain;
     }
     public String getDomain() {
         return domain;
     }

    public void setUri(String uri) {
         this.uri = uri;
     }
     public String getUri() {
         return uri;
     }

    public void setExtracted_on(Date extracted_on) {
         this.extracted_on = extracted_on;
     }
     public Date getExtracted_on() {
         return extracted_on;
     }

    public void setLast_seen_on(Date last_seen_on) {
         this.last_seen_on = last_seen_on;
     }
     public Date getLast_seen_on() {
         return last_seen_on;
     }

    public void setStill_on_page(boolean still_on_page) {
         this.still_on_page = still_on_page;
     }
     public boolean getStill_on_page() {
         return still_on_page;
     }

}