package graphjavabean.homepage;

public class GraphNumOfSocailApp {
    private int numOfFacebook;
    private int numOfTwitter;
    private int numOfWeibo;
    private int numOfOtherSocialApp;

    public GraphNumOfSocailApp(int numOfFacebook, int numOfTwitter, int numOfWeibo, int numOfOtherSocialApp) {
        this.numOfFacebook = numOfFacebook;
        this.numOfTwitter = numOfTwitter;
        this.numOfWeibo = numOfWeibo;
        this.numOfOtherSocialApp = numOfOtherSocialApp;
    }

    public int getNumOfFacebook() {
        return numOfFacebook;
    }

    public void setNumOfFacebook(int numOfFacebook) {
        this.numOfFacebook = numOfFacebook;
    }

    public int getNumOfTwitter() {
        return numOfTwitter;
    }

    public void setNumOfTwitter(int numOfTwitter) {
        this.numOfTwitter = numOfTwitter;
    }

    public int getNumOfWeibo() {
        return numOfWeibo;
    }

    public void setNumOfWeibo(int numOfWeibo) {
        this.numOfWeibo = numOfWeibo;
    }

    public int getNumOfOtherSocialApp() {
        return numOfOtherSocialApp;
    }

    public void setNumOfOtherSocialApp(int numOfOtherSocialApp) {
        this.numOfOtherSocialApp = numOfOtherSocialApp;
    }
}
