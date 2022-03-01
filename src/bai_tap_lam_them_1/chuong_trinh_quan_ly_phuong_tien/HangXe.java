package bai_tap_lam_them_1.chuong_trinh_quan_ly_phuong_tien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class HangXe {
    private String maSX;
    private String hangXe;
    private String nuocSX;

    public HangXe(String maSX, String hangXe, String nuocSX) {
        this.maSX = maSX;
        this.hangXe = hangXe;
        this.nuocSX = nuocSX;
    }

    public String getMaSX() {
        return maSX;
    }

    public void setMaSX(String maSX) {
        this.maSX = maSX;
    }

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public String getNuocSX() {
        return nuocSX;
    }

    public void setNuocSX(String nuocSX) {
        this.nuocSX = nuocSX;
    }
    static HangXe yamaha=new HangXe("HSX-001","Yamaha","Nhật Bản");
    static HangXe honda=new HangXe("HSX-002","Honda","Nhật Bản");
    static HangXe dongfeng=new HangXe("HSX-003","DongFeng","Trung Quốc");
    static HangXe huyndai=new HangXe("HSX-004","HuynDai","Hàn Quốc");
    static HangXe ford=new HangXe("HSX-005","Ford","Mỹ");
    static HangXe toyota=new HangXe("HSX-006","Toyota","Nhật Bản");
    static HangXe hino=new HangXe("HSX-007","Hino","Nhật Bản");
    static HangXe[] list={yamaha,honda,dongfeng,huyndai,ford,toyota,hino};
    public static String chonHangXe1(){
        System.out.println("");
        System.out.println("-----BẢNG CÁC HÃNG XE-----");
        System.out.println("1.HSX-001,Yamaha,Nhật Bản\n"+
                "2.HSX-002,Honda,Nhật Bản\n"+
                "3.HSX-003,DongFeng,Trung Quốc\n"+
                "4.HSX-004,HuynDai,Hàn Quốc\n"+
                "5.HSX-005,Ford,Mỹ\n"+
                "6.HSX-006,Toyota,Nhật bản\n"+
                "7.HSX-007,Hino,Nhật bản");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập tên hãng xe");
        int sTTXe=Integer.parseInt(scanner.nextLine());
        switch (sTTXe){
            case 1:
                return yamaha.getHangXe();
            case 2:
                return honda.getHangXe();
            case 3:
                return dongfeng.getHangXe();
            case 4:
                return huyndai.getHangXe();
            case 5:
                return ford.getHangXe();
            case 6:
                return toyota.getHangXe();
            case 7:
                return hino.getHangXe();
            default:
                System.out.println("lỰa chọn của bạn ko đúng");
                return null;
        }
    }
}

