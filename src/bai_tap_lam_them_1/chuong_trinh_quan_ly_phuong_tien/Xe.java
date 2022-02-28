package bai_tap_lam_them_1.chuong_trinh_quan_ly_phuong_tien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    public String chonHangXe() {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        list.add("Honda");
        list.add("hyundai");
        list.add("hitachi");
        System.out.println("1.Honda\n" +
                "2.hyundai\n" +
                "3.hitachi\n");
        System.out.println("Nhập lựa chọn");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                return "Honda";
            case 2:
                return "huyndai";
            case 3:
                return "hitachi";
            default:
                return "Không có lựa chọn";

        }
    }

    @Override
    public String toString() {
        return "Xe{" +
                "bienKiemSoat='" + bienKiemSoat + '\'' +
                ", hangXe='" + hangXe + '\'' +
                ", namSanXuat=" + namSanXuat +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                '}';
    }
}
