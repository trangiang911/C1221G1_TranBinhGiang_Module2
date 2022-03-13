package bai_tap_lam_them_2.models;

import bai_tap_lam_them_2.utils.ReadAndWriter;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class HangSanXuat {
    private String maSX;
    private String hangXe;
    private String NuocSX;

    public HangSanXuat(String maSX, String hangXe, String nuocSX) {
        this.maSX = maSX;
        this.hangXe = hangXe;
        this.NuocSX = nuocSX;
    }

    public HangSanXuat() {
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
        return NuocSX;
    }

    public void setNuocSX(String nuocSX) {
        NuocSX = nuocSX;
    }

    @Override
    public String toString() {
        return "HangSanXuat{" +
                "maSX='" + maSX + '\'' +
                ", hangXe='" + hangXe + '\'' +
                ", NuocSX='" + NuocSX + '\'' +
                '}';
    }

    public static String chonHangSanXuat() {
        Scanner scanner=new Scanner(System.in);
        List<String> stringList = ReadAndWriter.read("src\\bai_tap_lam_them_2\\data\\hangSanXuat.csv");
        String[] arr;
        List<HangSanXuat> hangSanXuatList = new ArrayList<>();
            for (int i = 0; i < stringList.size(); i++) {
                arr = stringList.get(i).split(",");
                hangSanXuatList.add(new HangSanXuat(arr[0], arr[1], arr[2]));
            }
        System.out.println("");
        System.out.println("-----BẢNG CÁC HÃNG XE-----");
        System.out.println("1.HSX-001,Yamaha,Nhật Bản\n"+
                "2.HSX-002,Honda,Nhật Bản\n"+
                "3.HSX-003,DongFeng,Trung Quốc\n"+
                "4.HSX-004,HuynDai,Hàn Quốc\n"+
                "5.HSX-005,Ford,Mỹ\n"+
                "6.HSX-006,Toyota,Nhật bản\n"+
                "7.HSX-007,Hino,Nhật bản");
        System.out.println("");
        System.out.println("chọn hãng xe (1-7)");
        int choice=Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                return hangSanXuatList.get(0).getHangXe();
            case 2:
                return hangSanXuatList.get(1).getHangXe();
            case 3:
                return hangSanXuatList.get(2).getHangXe();
            case 4:
                return hangSanXuatList.get(3).getHangXe();
            case 5:
                return hangSanXuatList.get(4).getHangXe();
            case 6:
                return hangSanXuatList.get(5).getHangXe();
            case 7:
                return hangSanXuatList.get(6).getHangXe();
            default:
                return null;
        }
    }

}
