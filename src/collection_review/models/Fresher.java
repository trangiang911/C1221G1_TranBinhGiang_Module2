package collection_review.models;

public class Fresher extends Candidate {
    private String graTime;
    private String graRank;
    private String edu;

    public Fresher(String id, String name, int birth, String address, String phone, String type, String graTime, String graRank, String edu) {
        super(id, name, birth, address, phone, type);
        this.graTime = graTime;
        this.graRank = graRank;
        this.edu = edu;
    }

    public Fresher(String graTime, String graRank, String edu) {
        this.graTime = graTime;
        this.graRank = graRank;
        this.edu = edu;
    }

    public Fresher() {
    }

    public String getGraTime() {
        return graTime;
    }

    public void setGraTime(String graTime) {
        this.graTime = graTime;
    }

    public String getGraRank() {
        return graRank;
    }

    public void setGraRank(String graRank) {
        this.graRank = graRank;
    }

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

    @Override
    public String toString() {
        return "Fresher{" + super.toString()+
                "graTime='" + graTime + '\'' +
                ", graRank='" + graRank + '\'' +
                ", edu='" + edu + '\'' +
                '}';
    }
}
