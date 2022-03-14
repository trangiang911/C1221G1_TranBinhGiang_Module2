package bai_tap_lam_them_2.services;

import bai_tap_lam_them_2.models.*;
import bai_tap_lam_them_2.utils.ReadAndWriter;
import ss16_io_text_file.bai_tap.copy_file_text.ReadAndWrite;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ServiceXe {
    Scanner scanner = new Scanner(System.in);
    private static List<XeTai> xeTaiList = new ArrayList<>();
    private static List<XeMay> xeMayList = new ArrayList<>();
    private static List<Oto> otoList = new ArrayList<>();

    static {
        List<String> stringList1 = ReadAndWriter.read("src\\bai_tap_lam_them_2\\data\\xeTai.csv");
        List<String> stringList2 = ReadAndWriter.read("src\\bai_tap_lam_them_2\\data\\oto.csv");
        List<String> stringList3 = ReadAndWriter.read("src\\bai_tap_lam_them_2\\data\\xeMay.csv");
        String[] arr1;
        String[] arr2;
        String[] arr3;
        for (int i = 0; i < stringList1.size(); i++) {
            arr1 = stringList1.get(i).split(",");
            XeTai xeTai = new XeTai(arr1[0], arr1[1], Integer.parseInt(arr1[2]), arr1[3], Double.parseDouble(arr1[4]));
            xeTaiList.add(xeTai);
        }
        for (int i = 0; i < stringList2.size(); i++) {
            arr2 = stringList2.get(i).split(",");
            Oto oto = new Oto(arr2[0], arr2[1], Integer.parseInt(arr2[2]), arr2[3], arr2[4], Integer.parseInt(arr2[5]));
            otoList.add(oto);
        }
        for (int i = 0; i < stringList3.size(); i++) {
            arr3 = stringList3.get(i).split(",");
            XeMay xeMay = new XeMay(arr3[0], arr3[1], Integer.parseInt(arr3[2]), arr3[3], Double.parseDouble(arr3[4]));
            xeMayList.add(xeMay);
        }
    }

    public void addXe() {
        System.out.println("1. Thêm xe tải\n" +
                "2. Thêm xe ô tô\n" +
                "3. Thêm xe máy\n" +
                "4. Quay lại menu chính");
        System.out.println("Nhập lựa chọn loại xe cần thêm");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.println("Nhập biển số xe");
                String bienXeTai = scanner.nextLine();
                while (!Pattern.matches("^[0-9]{2}C-[0-9]{3}\\.[0-9]{2}$", bienXeTai)) {
                    System.out.println("Biển số xe ko hợp lệ, mời nhập lại");
                    bienXeTai = scanner.nextLine();
                }
                while (!ServiceBienSoXe.kiemTra(bienXeTai,xeTaiList,xeMayList,otoList)){
                    System.out.println("Biển số xe đã tồn tại, mời nhập lại");
                    bienXeTai=scanner.nextLine();
                }
                System.out.println("Nhập năm sản xuất của xe");
                int namXeTai = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập chủ sở hữu của xe");
                String nameXeTai = scanner.nextLine();
                System.out.println("Nhập trọng tải của xe");
                double trongTai = Double.parseDouble(scanner.nextLine());
                String string1 = HangSanXuat.chonHangSanXuat();
                xeTaiList.add(new XeTai(bienXeTai, string1, namXeTai, nameXeTai, trongTai));
                ReadAndWriter.write("src\\bai_tap_lam_them_2\\data\\xeTai.csv", xeTaiList, false);
                break;
            case 2:
                System.out.println("Nhập kiểu xe (du lịch hoặc khách)");
                String kieuOto = scanner.nextLine();
                System.out.println("Nhập biển số xe");
                String bienOto = scanner.nextLine();
                if ("Du lịch".toLowerCase().equals(kieuOto)) {
                    while (!Pattern.matches("^[0-9]{2}A-[0-9]{3}\\.[0-9]{2}$", bienOto)) {
                        System.out.println("Biển số xe ko hợp lệ, mời nhập lại");
                        bienOto = scanner.nextLine();
                    }
                } else if ("Khách".toLowerCase().equals(kieuOto)) {
                    while (!Pattern.matches("^[0-9]{2}B-[0-9]{3}\\.[0-9]{2}$", bienOto)) {
                        System.out.println("Biển số xe ko hợp lệ, mời nhập lại");
                        bienOto = scanner.nextLine();
                    }
                }
                while (!ServiceBienSoXe.kiemTra(bienOto,xeTaiList,xeMayList,otoList)){
                    System.out.println("Biển số xe đã tồn tại, mời nhập lại");
                    bienOto=scanner.nextLine();
                }
                System.out.println("Nhập năm sản xuất của xe");
                int namOto = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập chủ sở hữu của xe");
                String nameOto = scanner.nextLine();
                System.out.println("Nhập số chỗ của xe");
                String string2 = HangSanXuat.chonHangSanXuat();
                int soCho = Integer.parseInt(scanner.nextLine());
                otoList.add(new Oto(bienOto, string2, namOto, nameOto, kieuOto, soCho));
                ReadAndWriter.write("src\\bai_tap_lam_them_2\\data\\oto.csv", otoList, false);
                break;
            case 3:
                System.out.println("Nhập biển số xe");
                String bienXeMay = scanner.nextLine();
                while (!Pattern.matches("^[0-9]{2}-[A-Z]{1}[a-zA-Z_0-9]-[0-9]{3}[0-9]{2}", bienXeMay)) {
                    System.out.println("Biển số xe ko hợp lệ, mời nhập lại");
                    bienXeMay = scanner.nextLine();
                }
                while (!ServiceBienSoXe.kiemTra(bienXeMay,xeTaiList,xeMayList,otoList)) {
                    System.out.println("Biển số xe đã tồn tại, mời nhập lại");
                    bienXeMay=scanner.nextLine();
                }
                System.out.println("Nhập năm sản xuất của xe");
                int namXeMay = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập chủ sở hữu của xe");
                String nameXeMay = scanner.nextLine();
                System.out.println("Nhập công suất xe");
                double congSuat = Double.parseDouble(scanner.nextLine());
                String string3 = HangSanXuat.chonHangSanXuat();
                xeMayList.add(new XeMay(bienXeMay, string3, namXeMay, nameXeMay, congSuat));
                ReadAndWriter.write("src\\bai_tap_lam_them_2\\data\\xeMay.csv", xeMayList, false);
                break;
            case 4:
                break;
            default:
                System.out.println("Lựa chọn ko hợp lệ");
                break;
        }
    }

    public void display() {
        System.out.println("1. Hiển thị danh sách xe tải\n" +
                "2. Hiển thị danh sách xe ô tô\n" +
                "3. Hiển thị danh sách xe máy\n" +
                "4. Quay lại menu chính");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                for (XeTai element : xeTaiList) {
                    System.out.println(element);
                }
                break;
            case 2:
                for (Oto elemnent : otoList) {
                    System.out.println(elemnent);
                }
                break;
            case 3:
                for (XeMay element : xeMayList) {
                    System.out.println(element);
                }
                break;
            case 4:
                break;
            default:
                System.out.println("lựa chọn k hợp lệ");
                break;
        }
    }

    public void delete(String bienSoDel) throws NotFoundVehicelException {
//        display();
        int cont = 0;
        for (int i = 0; i < xeTaiList.size(); i++) {
            if (xeTaiList.get(i).getBienKiemSoat().equals(bienSoDel)) {
                System.out.println("Bạn có chắc muốn xoá xe này (Nhập yes or no)");
                String choice = scanner.nextLine();
                if (choice.toLowerCase().equals("yes")) {
                    xeTaiList.remove(i);
                    System.out.println("Xoá thành công");
                    ReadAndWriter.write("src\\bai_tap_lam_them_2\\data\\xeTai.csv", xeTaiList, false);
                    cont++;
                    choice = scanner.nextLine();
                    if (choice.equals("")) {
                        break;
                    }
                } else {
                    break;
                }
            } else if ("".equals(bienSoDel)) {
                break;
            }
        }
        for (int i = 0; i < otoList.size(); i++) {
            if (bienSoDel.equals(otoList.get(i).getBienKiemSoat())) {
                System.out.println("Bạn có chắc muốn xoá xe này (Nhập yes or no)");
                String choice = scanner.nextLine();
                if ("yes".equals(choice.toLowerCase())) {
                    otoList.remove(i);
                    System.out.println("Xoá thành công");
                    ReadAndWriter.write("src\\bai_tap_lam_them_2\\data\\oto.csv", otoList, false);
                    cont++;
                    choice = scanner.nextLine();
                    if (choice.equals("")) {
                        break;
                    }
                } else {
                    break;
                }
            } else if ("".equals(bienSoDel)) {
                break;
            }
        }
        for (int i = 0; i < xeMayList.size(); i++) {
            if (bienSoDel.equals(xeMayList.get(i).getBienKiemSoat())) {
                System.out.println("Bạn có chắc muốn xoá xe này (Nhập yes or no");
                String choice = scanner.nextLine();
                if ("yes".equals(choice.toLowerCase())) {
                    xeMayList.remove(i);
                    System.out.println("Xoá thành công");
                    ReadAndWriter.write("src\\bai_tap_lam_them_2\\data\\xeMay.csv", xeMayList, false);
                    cont++;
                    choice = scanner.nextLine();
                    if (choice.equals("")) {
                        break;
                    }
                } else {
                    break;
                }
            } else if ("".equals(bienSoDel)) {
                break;
            }
        }
        if (cont == 0) {
            throw new NotFoundVehicelException("Ko tồn tại biển số xe này");
        }
    }
}
