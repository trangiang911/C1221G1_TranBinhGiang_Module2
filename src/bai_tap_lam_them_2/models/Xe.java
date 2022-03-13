package bai_tap_lam_them_2.models;

import bai_tap_lam_them_1.chuong_trinh_quan_ly_phuong_tien.HangXe;

public abstract class Xe {
    private String bienKiemSoat;
    private String hangXe;
    private int namSanXuat;
    private String chuSoHuu;
    private int soCho;

    public Xe() {
    }

    public Xe(String bienKiemSoat, String hangXe, int namSanXuat, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.hangXe = hangXe;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;

    }

    public Xe(String bienKiemSoat, int namSanXuat, String chuSoHuu, int soCho) {
        this.bienKiemSoat = bienKiemSoat;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
        this.soCho = soCho;
    }

    public Xe(String bienKiemSoat, int namSanXuat, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }

    @Override
    public String toString() {
        return
                 bienKiemSoat + "," +
                        hangXe + "," +
                        namSanXuat+"," +
                        chuSoHuu + ","
                ;
    }

}
