package graphjavabean.homepage;

public class GraphNumOfTerminal {
    private int numOfUnknown;
    private int numOfWap;
    private int numOfWapOfWeb;
    private int numOfWebCam;
    private int numOfRouter;

    public GraphNumOfTerminal(int numOfUnknown, int numOfWap, int numOfWapOfWeb, int numOfWebCam, int numOfRouter) {
        this.numOfUnknown = numOfUnknown;
        this.numOfWap = numOfWap;
        this.numOfWapOfWeb = numOfWapOfWeb;
        this.numOfWebCam = numOfWebCam;
        this.numOfRouter = numOfRouter;
    }

    public int getNumOfUnknown() {
        return numOfUnknown;
    }

    public void setNumOfUnknown(int numOfUnknown) {
        this.numOfUnknown = numOfUnknown;
    }

    public int getNumOfWap() {
        return numOfWap;
    }

    public void setNumOfWap(int numOfWap) {
        this.numOfWap = numOfWap;
    }

    public int getNumOfWapOfWeb() {
        return numOfWapOfWeb;
    }

    public void setNumOfWapOfWeb(int numOfWapOfWeb) {
        this.numOfWapOfWeb = numOfWapOfWeb;
    }

    public int getNumOfWebCam() {
        return numOfWebCam;
    }

    public void setNumOfWebCam(int numOfWebCam) {
        this.numOfWebCam = numOfWebCam;
    }

    public int getNumOfRouter() {
        return numOfRouter;
    }

    public void setNumOfRouter(int numOfRouter) {
        this.numOfRouter = numOfRouter;
    }
}
