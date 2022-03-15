package models;

public class Customer extends Person {
    private String loaiKhach;
    private String maKhachHang;

    public Customer(String name, String dateOfbirth, String gender, String identityCard, String email, String loaiKhach, String maKhachHang, String sĐT) {
        super(name, dateOfbirth, gender, identityCard, email, sĐT);
        this.loaiKhach = loaiKhach;
        this.maKhachHang = maKhachHang;
    }

    public Customer(String loaiKhach, String maKhachHang) {
        this.loaiKhach = loaiKhach;
        this.maKhachHang = maKhachHang;
    }

    public Customer() {

    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString()+
                "loaiKhach='" + loaiKhach + '\'' +
                ", maKhachHang='" + maKhachHang + '\'' +
                '}';
    }
}
