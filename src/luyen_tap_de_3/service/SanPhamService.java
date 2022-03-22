package luyen_tap_de_3.service;

import luyen_tap_de_3.models.NhapKhau;
import luyen_tap_de_3.models.SanPham;
import luyen_tap_de_3.models.XuatKhau;
import luyen_tap_de_3.utils.NotFoundProductException;
import luyen_tap_de_3.utils.ReadAndWriter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class SanPhamService implements IService {
    Scanner scanner = new Scanner(System.in);
    private static final List<NhapKhau> NHAP_KHAU_LIST = new ArrayList<>();
    private static final List<XuatKhau> XUAT_KHAU_LIST = new ArrayList<>();

    static {
        List<Integer> arr = new ArrayList<>();
        List<String> stringList1 = ReadAndWriter.read("src\\luyen_tap_de_3\\data\\nhapKhau.csv");
        List<String> stringList2 = ReadAndWriter.read("src\\luyen_tap_de_3\\data\\xuatKhau.csv");
        String[] arr1;
        String[] arr2;
        for (String s : stringList1) {
            if (!s.isEmpty()) {
                arr1 = s.split(",");
                NhapKhau nhapKhau = new NhapKhau(Integer.parseInt(arr1[0]), arr1[1], arr1[2], Double.parseDouble(arr1[3]),
                        Integer.parseInt(arr1[4]), arr1[5], Double.parseDouble(arr1[6]), arr1[7], Double.parseDouble(arr1[8]));
                NHAP_KHAU_LIST.add(nhapKhau);
                arr.add(Integer.parseInt(arr1[0]));
            }
        }
        for (String s : stringList2) {
            if (!s.isEmpty()) {
                arr2 = s.split(",");
                XuatKhau xuatKhau = new XuatKhau(Integer.parseInt(arr2[0]), arr2[1], arr2[2], Double.parseDouble(arr2[3]),
                        Integer.parseInt(arr2[4]), arr2[5], Double.parseDouble(arr2[6]), arr2[7]);
                XUAT_KHAU_LIST.add(xuatKhau);
                arr.add(Integer.parseInt(arr2[0]));
            }
        }
        for (Integer num : arr) {
            int max = arr.get(0);
            if (max < num) {
                max = num;
                SanPham.setIdTemp(max + 1);
            }
        }
    }

    @Override
    public void creat() {
        System.out.println("1. Thêm mới sản phẩm nhập khẩu\n" +
                "2. Thêm mới sản phẩm xuất khẩu");
        System.out.println("Nhập lựa chọn");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                System.out.println("Nhập mã sản phẩm");
                String maSP = scanner.nextLine();
                System.out.println("Nhập tên sản phẩm");
                String name = scanner.nextLine();
                System.out.println("Nhập giá sản phẩm");
                String str1 = scanner.nextLine();
                while (!Pattern.matches("^[0-9]+$", str1)) {
                    System.out.println("Giá sản phẩm yêu cầu nhập số dương");
                    str1 = scanner.nextLine();
                }
                double price = Double.parseDouble(str1);
                System.out.println("Nhập số lượng sản phẩm");
                String str2 = scanner.nextLine();
                while (!Pattern.matches("^[0-9]+$", str2)) {
                    System.out.println("Số lương  yêu cầu nhập số dương");
                    str2 = scanner.nextLine();
                }
                int sl = Integer.parseInt(str2);
                System.out.println("Nhập nhà sản xuất");
                String nsx = scanner.nextLine();
                System.out.println("Nhập giá nhập khẩu");
                String str3 = scanner.nextLine();
                while (!Pattern.matches("^[0-9]+$", str3)) {
                    System.out.println("Giá xuất khẩu phải là số dương");
                    str3 = scanner.nextLine();
                }
                double priceNK = Double.parseDouble(str3);
                System.out.println("Nhập tỉnh nhập khẩu");
                String conscious = scanner.nextLine();
                System.out.println("Nhập thuế nhập khẩu");
                String str4 = scanner.nextLine();
                while (!Pattern.matches("^[0-9]+$", str4)) {
                    System.out.println("Thuế phải là số dương");
                    str4 = scanner.nextLine();
                }
                double tax = Double.parseDouble(str4);
                NHAP_KHAU_LIST.add(new NhapKhau(maSP, name, price, sl, nsx, priceNK, conscious, tax));
                ReadAndWriter.write("src\\luyen_tap_de_3\\data\\nhapKhau.csv", NHAP_KHAU_LIST, false);
                break;
            case "2":
                System.out.println("Nhập mã sản phẩm");
                String maSPXK = scanner.nextLine();
                System.out.println("Nhập tên sản phẩm");
                String nameXK = scanner.nextLine();
                System.out.println("Nhập giá sản phẩm");
                String str5 = scanner.nextLine();
                while (!Pattern.matches("^[0-9]+$", str5)) {
                    System.out.println("Giá sản phẩm yêu cầu nhập số dương");
                    str5 = scanner.nextLine();
                }
                double priceXK = Double.parseDouble(str5);
                System.out.println("Nhập số lượng sản phẩm");
                String str6 = scanner.nextLine();
                while (!Pattern.matches("^[0-9]+$", str6)) {
                    System.out.println("Số lương  yêu cầu nhập số dương");
                    str6 = scanner.nextLine();
                }
                int slXK = Integer.parseInt(str6);
                System.out.println("Nhập nhà sản xuất");
                String nsxXK = scanner.nextLine();
                System.out.println("Nhập giá xuất khẩu");
                String str7 = scanner.nextLine();
                while (!Pattern.matches("^[0-9]+$", str7)) {
                    System.out.println("Giá xuất khẩu phải là số dương");
                    str7 = scanner.nextLine();
                }
                double priceXK1 = Double.parseDouble(str7);
                System.out.println("Nhập quốc gia xuất khẩu");
                String nation = scanner.nextLine();
                XUAT_KHAU_LIST.add(new XuatKhau(maSPXK, nameXK, priceXK, slXK, nsxXK, priceXK1, nation));
                ReadAndWriter.write("src\\luyen_tap_de_3\\data\\xuatKhau.csv", XUAT_KHAU_LIST, false);
                break;
            default:
                System.out.println("Lựa chọn k đúng");
                break;
        }
    }

    @Override
    public void delete(String maSPDel) throws NotFoundProductException {
        int cont = 0;
        ReadAndWriter.read("src\\luyen_tap_de_3\\data\\nhapKhau.csv");
        ReadAndWriter.read("src\\luyen_tap_de_3\\data\\xuatKhau.csv");
        for (int i = 0; i < NHAP_KHAU_LIST.size(); i++) {
            if (NHAP_KHAU_LIST.get(i).getMaSP().equals(maSPDel)) {
                cont++;
                System.out.println("bạn có chắc xoá sản phẩm (y/n)");
                String choice = scanner.nextLine();
                if ("y".equals(choice)) {
                    NHAP_KHAU_LIST.remove(i);
                    System.out.println("Xoá thành công");
                    break;
                }
            }
        }
        for (int i = 0; i < XUAT_KHAU_LIST.size(); i++) {
            if (XUAT_KHAU_LIST.get(i).getMaSP().equals(maSPDel)) {
                cont++;
                System.out.println("Bạn có chắc muốn xoá sản phẩm này (y/n)");
                String choice = scanner.nextLine();
                if ("y".equals(choice)) {
                    XUAT_KHAU_LIST.remove(i);
                    System.out.println("xoá thành công");
                    break;
                }
            }
        }
//        List<Integer> arr3 = new ArrayList<>();
//        for (NhapKhau nhapKhau : NHAP_KHAU_LIST) {
//            arr3.add(nhapKhau.getId());
//        }
//        for (XuatKhau xuatKhau : XUAT_KHAU_LIST) {
//            arr3.add(xuatKhau.getId());
//        }
//        for (Integer num1 : arr3) {
//            int max1 = arr3.get(0);
//            if (max1 < num1) {
//                max1 = num1;
//                SanPham.setIdTemp(max1 + 1);
//            }
//        }
        ReadAndWriter.write("src\\luyen_tap_de_3\\data\\nhapKhau.csv", NHAP_KHAU_LIST, false);
        ReadAndWriter.write("src\\luyen_tap_de_3\\data\\xuatKhau.csv", XUAT_KHAU_LIST, false);
        if (cont == 0) {
            throw new NotFoundProductException("Ko tìm thấy mã sản phẩm");
        }
    }

    @Override
    public void find() {
        System.out.println("Nhập mã sản phẩm hoặc tên sản phẩm muốn tìm");
        String str = scanner.nextLine();
        for (NhapKhau nhapKhau : NHAP_KHAU_LIST) {
            if (nhapKhau.getMaSP().contains(str) || nhapKhau.getNameSP().contains(str)) {
                System.out.println(nhapKhau);
            }
        }
        for (XuatKhau xuatKhau : XUAT_KHAU_LIST) {
            if (xuatKhau.getNameSP().contains(str) || xuatKhau.getMaSP().contains(str)) {
                System.out.println(xuatKhau);
            }
        }
    }

    @Override
    public void display() {
        System.out.println("====Sản phẩm nhập khẩu====\n");
        for (NhapKhau nhapKhau : NHAP_KHAU_LIST) {
            System.out.println(nhapKhau);
        }
        System.out.println("====Sản phẩm xuất khẩu====\n");
        for (XuatKhau xuatKhau : XUAT_KHAU_LIST) {
            System.out.println(xuatKhau);
        }
    }
}
