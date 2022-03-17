package case_study.models;

public abstract class Person {
    private String name;
    private String dateOfbirth;
    private String gender;
    private String identityCard;
    private String email;
    private String sĐT;

    public Person(String name, String dateOfbirth, String gender, String identityCard, String email,String sĐT) {
        this.name = name;
        this.dateOfbirth = dateOfbirth;
        this.gender = gender;
        this.identityCard = identityCard;
        this.email = email;
        this.sĐT=sĐT;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfbirth() {
        return dateOfbirth;
    }

    public void setDateOfbirth(String dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getsĐT() {
        return sĐT;
    }

    public void setsĐT(String sĐT) {
        this.sĐT = sĐT;
    }
@Override
    public String toString() {
        return name +
                "," + dateOfbirth +
                "," + gender +
                "," + identityCard +
                "," + email +
                "," + sĐT;
    }

    public String toStringRead() {
        return
                "name='" + name + '\'' +
                ", dateOfbirth='" + dateOfbirth + '\'' +
                ", gender='" + gender + '\'' +
                ", identityCard='" + identityCard + '\'' +
                ", email='" + email + '\'' +
                ", sĐT='" + sĐT + '\'' ;
    }
}
