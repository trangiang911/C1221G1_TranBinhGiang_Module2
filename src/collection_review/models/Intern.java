package collection_review.models;

public class Intern extends Candidate {
    private String major;
    private String semester;
    private String edu;

    public Intern(String id, String name, int birth, String address, String phone, String type, String major, String semester, String edu) {
        super(id, name, birth, address, phone, type);
        this.major = major;
        this.semester = semester;
        this.edu = edu;
    }

    public Intern(String major, String semester, String edu) {
        this.major = major;
        this.semester = semester;
        this.edu = edu;
    }

    public Intern() {
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

    @Override
    public String toString() {
        return "Intern{" + super.toString()+
                "major='" + major + '\'' +
                ", semester='" + semester + '\'' +
                ", edu='" + edu + '\'' +
                '}';
    }
}
