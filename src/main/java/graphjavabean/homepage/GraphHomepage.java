package graphjavabean.homepage;

import com.google.gson.Gson;
import org.testng.annotations.Test;

public class GraphHomepage {
    private GraphNumOfBug graphNumOfBug;
    private GraphNumOfEmail graphNumOfEmail;
    private GraphNumOfTerminal graphNumOfTerminal;
    private GraphNumOfUnderMoniter graphNumOfUnderMoniter;
    private GraphNumOfSocailApp graphNumOfSocailApp;
    private GraphNumOfWebCotent graphNumOfWebCotent;


    public GraphHomepage() {
    }

    public GraphHomepage(GraphNumOfBug graphNumOfBug, GraphNumOfEmail graphNumOfEmail, GraphNumOfTerminal graphNumOfTerminal, GraphNumOfUnderMoniter graphNumOfUnderMoniter, GraphNumOfSocailApp graphNumOfSocailApp, GraphNumOfWebCotent graphNumOfWebCotent) {
        this.graphNumOfBug = graphNumOfBug;
        this.graphNumOfEmail = graphNumOfEmail;
        this.graphNumOfTerminal = graphNumOfTerminal;
        this.graphNumOfUnderMoniter = graphNumOfUnderMoniter;
        this.graphNumOfSocailApp = graphNumOfSocailApp;
        this.graphNumOfWebCotent = graphNumOfWebCotent;
    }

    public GraphNumOfBug getGraphNumOfBug() {
        return graphNumOfBug;
    }

    public void setGraphNumOfBug(GraphNumOfBug graphNumOfBug) {
        this.graphNumOfBug = graphNumOfBug;
    }

    public GraphNumOfEmail getGraphNumOfEmail() {
        return graphNumOfEmail;
    }

    public void setGraphNumOfEmail(GraphNumOfEmail graphNumOfEmail) {
        this.graphNumOfEmail = graphNumOfEmail;
    }

    public GraphNumOfTerminal getGraphNumOfTerminal() {
        return graphNumOfTerminal;
    }

    public void setGraphNumOfTerminal(GraphNumOfTerminal graphNumOfTerminal) {
        this.graphNumOfTerminal = graphNumOfTerminal;
    }

    public GraphNumOfUnderMoniter getGraphNumOfUnderMoniter() {
        return graphNumOfUnderMoniter;
    }

    public void setGraphNumOfUnderMoniter(GraphNumOfUnderMoniter graphNumOfUnderMoniter) {
        this.graphNumOfUnderMoniter = graphNumOfUnderMoniter;
    }

    public GraphNumOfSocailApp getGraphNumOfSocailApp() {
        return graphNumOfSocailApp;
    }

    public void setGraphNumOfSocailApp(GraphNumOfSocailApp graphNumOfSocailApp) {
        this.graphNumOfSocailApp = graphNumOfSocailApp;
    }

    public GraphNumOfWebCotent getGraphNumOfWebCotent() {
        return graphNumOfWebCotent;
    }

    public void setGraphNumOfWebCotent(GraphNumOfWebCotent graphNumOfWebCotent) {
        this.graphNumOfWebCotent = graphNumOfWebCotent;
    }
    @Test
    public void test(){
        GraphNumOfBug graphNumOfBug = new GraphNumOfBug(1,2,3);
        GraphNumOfEmail graphNumOfEmail = new GraphNumOfEmail(5,6,9,8,4);
        GraphNumOfTerminal graphNumOfTerminal = new GraphNumOfTerminal(9,5,8,3,1);
        GraphNumOfUnderMoniter graphNumOfUnderMoniter = new GraphNumOfUnderMoniter(6,9,5);
        GraphNumOfSocailApp graphNumOfSocailApp = new GraphNumOfSocailApp(8,9,6,1);
        GraphNumOfWebCotent graphNumOfWebCotent = new GraphNumOfWebCotent(8,9,6,3,2,1,5);

        System.out.println(new Gson().toJson(new GraphHomepage(graphNumOfBug,graphNumOfEmail,graphNumOfTerminal,graphNumOfUnderMoniter,graphNumOfSocailApp,graphNumOfWebCotent)));
    }
}
