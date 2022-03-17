package case_study.models;

import java.util.Objects;

public abstract class Facility {
    private String maDichVu;
    private String tenDichVu;
    private int dienTichSuDung;
    private double giaThue;
    private int soLuongToiDa;
    private String kieuThue;

    public Facility(String maDichVu, String tenDichVu, int dienTichSuDung, double giaThue, int soLuongToiDa, String kieuThue) {
        this.maDichVu = maDichVu;
        this.tenDichVu = tenDichVu;
        this.dienTichSuDung = dienTichSuDung;
        this.giaThue = giaThue;
        this.soLuongToiDa = soLuongToiDa;
        this.kieuThue = kieuThue;
    }

    public Facility(String tenDichVu, int dienTichSuDung, double giaThue, int soLuongToiDa) {
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

    public void setDienTichSuDung(int dienTichSuDung) {
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

    public String getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(String maDichVu) {
        this.maDichVu = maDichVu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return maDichVu.equals(facility.maDichVu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maDichVu);
    }

    public String toStringRead() {
        return
                "maDichVu='" + maDichVu + '\'' +
                        ", tenDichVu='" + tenDichVu + '\'' +
                        ", dienTichSuDung=" + dienTichSuDung +
                        ", giaThue=" + giaThue +
                        ", soLuongToiDa=" + soLuongToiDa +
                        ", kieuThue='" + kieuThue + '\'';
    }

    @Override
    public String toString() {
        return maDichVu +
                "," + tenDichVu +
                "," + dienTichSuDung +
                "," + giaThue +
                "," + soLuongToiDa +
                "," + kieuThue;
    }
}
