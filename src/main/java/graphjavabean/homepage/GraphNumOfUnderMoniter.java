package graphjavabean.homepage;

public class GraphNumOfUnderMoniter {
    private int numOfInstitution;
    private int numOfCompany;
    private int numOforganization;

    public GraphNumOfUnderMoniter(int numOfInstitution, int numOfCompany, int numOforganization) {
        this.numOfInstitution = numOfInstitution;
        this.numOfCompany = numOfCompany;
        this.numOforganization = numOforganization;
    }

    public int getNumOfInstitution() {
        return numOfInstitution;
    }

    public void setNumOfInstitution(int numOfInstitution) {
        this.numOfInstitution = numOfInstitution;
    }

    public int getNumOfCompany() {
        return numOfCompany;
    }

    public void setNumOfCompany(int numOfCompany) {
        this.numOfCompany = numOfCompany;
    }

    public int getNumOforganization() {
        return numOforganization;
    }

    public void setNumOforganization(int numOforganization) {
        this.numOforganization = numOforganization;
    }
}
