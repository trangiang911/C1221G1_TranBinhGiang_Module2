package models;

public abstract class Facility {
    private String tenDichVu;
    private double dienTichSuDung;
    private double giaThue;
    private int soLuongToiDa;
    private String kieuThue;

    public Facility(String tenDichVu, double dienTichSuDung, double giaThue, int soLuongToiDa, String kieuThue) {
        this.tenDichVu = tenDichVu;
        this.dienTichSuDung = dienTichSuDung;
        this.giaThue = giaThue;
        this.soLuongToiDa = soLuongToiDa;
        this.kieuThue = kieuThue;
    }

    public Facility(String tenDichVu, double dienTichSuDung, double giaThue, int soLuongToiDa) {
        this.tenDichVu = tenDichVu;
        this.dienTichSuDung = dienTichSuDung;
        this.giaThue = giaThue;
        this.soLuongToiDa = soLuongToiDa;
    }

    public Facility() {
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public double getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(double dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public double getGiaThue() {
        return giaThue;
    }

    public void setGiaThue(double giaThue) {
        this.giaThue = giaThue;
    }

    public int getSoLuongToiDa() {
        return soLuongToiDa;
    }

    public void setSoLuongToiDa(int soLuongToiDa) {
        this.soLuongToiDa = soLuongToiDa;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "tenDichVu='" + tenDichVu + '\'' +
                ", dienTichSuDung=" + dienTichSuDung +
                ", giaThue=" + giaThue +
                ", soLuongToiDa=" + soLuongToiDa +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }
}
