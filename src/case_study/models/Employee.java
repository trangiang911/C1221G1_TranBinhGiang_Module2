package case_study.models;

import case_study.models.Person;

public class Employee extends Person{
    private String maNV;
    private String viTri;
    private String trinhDo;
    private double luong;

    public Employee(String name, String dateOfbirth, String gender, String identityCard, String email, String sĐT, String maNV, String viTri, String trinhDo, double luong) {
        super(name, dateOfbirth, gender, identityCard, email, sĐT);
        this.maNV = maNV;
        this.viTri = viTri;
        this.trinhDo = trinhDo;
        this.luong = luong;
    }

    public Employee(String maNV, String viTri, String trinhDo, double luong) {
        this.maNV = maNV;
        this.viTri = viTri;
        this.trinhDo = trinhDo;
        this.luong = luong;
    }
    public Employee(){
        super();
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString()+
                "maNV='" + maNV + '\'' +
                ", viTri='" + viTri + '\'' +
                ", trinhDo='" + trinhDo + '\'' +
                ", luong=" + luong +
                '}';
    }
}
