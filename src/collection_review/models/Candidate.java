package collection_review.models;

public abstract class Candidate {
    private String id;
    private String name;
    private int birth;
    private String address;
    private String phone;
    private String type;

    public Candidate(String id, String name, int birth, String address, String phone, String type) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.address = address;
        this.phone = phone;
        this.type = type;
    }

    public Candidate() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", type='" + type + '\''+" ";
    }
}
