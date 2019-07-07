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
public class ZoomEyeInfo {

    private int total;
    private int available;
    private List<Matches> matches;
    private Facets facets;
    public void setTotal(int total) {
         this.total = total;
     }
     public int getTotal() {
         return total;
     }

    public void setAvailable(int available) {
         this.available = available;
     }
     public int getAvailable() {
         return available;
     }

    public void setMatches(List<Matches> matches) {
         this.matches = matches;
     }
     public List<Matches> getMatches() {
         return matches;
     }

    public void setFacets(Facets facets) {
         this.facets = facets;
     }
     public Facets getFacets() {
         return facets;
     }

}