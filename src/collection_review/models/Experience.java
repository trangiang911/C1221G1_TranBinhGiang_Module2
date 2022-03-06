package collection_review.models;

public class Experience extends Candidate {
    private int exp;
    private String skill;

    public Experience(String id, String name, int birth, String address, String phone, String type, int exp, String skill) {
        super(id, name, birth, address, phone, type);
        this.exp = exp;
        this.skill = skill;
    }

    public Experience(int exp, String skill) {
        this.exp = exp;
        this.skill = skill;
    }

    public Experience() {
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Experience{" + super.toString()+
                "exp=" + exp +
                ", skill='" + skill + '\'' +
                '}';
    }
}
