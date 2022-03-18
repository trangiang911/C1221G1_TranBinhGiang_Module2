package case_study.models;

import java.util.Objects;

public class Customer extends Person {
    private String loaiKhach;
    private String maKhachHang;
    private String diaChi;

    public Customer(String name, String dateOfbirth, String gender, String identityCard, String email, String sĐT, String loaiKhach, String maKhachHang, String diaChi) {
        super(name, dateOfbirth, gender, identityCard, email, sĐT);
        this.loaiKhach = loaiKhach;
        this.maKhachHang = maKhachHang;
        this.diaChi=diaChi;
    }

    public Customer(String loaiKhach, String maKhachHang, String diaChi) {
        this.loaiKhach = loaiKhach;
        this.maKhachHang = maKhachHang;
        this.diaChi= diaChi;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return maKhachHang.equals(customer.maKhachHang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maKhachHang);
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString()+
                "loaiKhach='" + loaiKhach + '\'' +
                ", maKhachHang='" + maKhachHang + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }

    @Override
    public String toCSV() {
        return super.toCSV()+","+loaiKhach+","+maKhachHang+","+diaChi;
    }
}
