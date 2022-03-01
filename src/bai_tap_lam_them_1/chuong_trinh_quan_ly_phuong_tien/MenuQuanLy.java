package bai_tap_lam_them_1.chuong_trinh_quan_ly_phuong_tien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuQuanLy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Oto> list = new ArrayList<>();
        List<XeTai> list1 = new ArrayList<>();
        List<XeMay> list2 = new ArrayList<>();
        boolean flag = true;
        do {
            System.out.println("");
            System.out.println("Chương trình quản lý phương tiện giao thông");
            System.out.println("1. thêm mới phương tiện\n" +
                    "2.Hiện thị Phương tiện\n" +
                    "3.Xoá phương tiện\n" +
                    "4.Thoát");
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("1.Thêm xe tải\n" +
                            "2.Thêm Ô tô\n" +
                            "3.Thêm xe máy\n");
                    System.out.println("Chọn chức năng");
                    int choose1 = Integer.parseInt(scanner.nextLine());
                    switch (choose1) {
                        case 1:
                            System.out.println("Nhập biển kiểm soát");
                            String bienKS = scanner.nextLine();
                            System.out.println("Nhập năm sản xuất");
                            int namSX = Integer.parseInt(scanner.nextLine());
                            System.out.println("Chủ phương tiện");
                            String name = scanner.nextLine();
                            System.out.println("Nhập trọng tải xe");
                            double trongTai = Double.parseDouble(scanner.nextLine());
                            list1.add(new XeTai(bienKS, namSX, name, trongTai));
                            break;
                        case 2:
                            System.out.println("Nhập biển kiểm soát");
                            String bienKSOTO = scanner.nextLine();
                            System.out.println("Nhập năm sản xuất");
                            int namSXOTO = Integer.parseInt(scanner.nextLine());
                            System.out.println("Chủ phương tiện");
                            String nameOTO = scanner.nextLine();
                            System.out.println("Nhập số chỗ");
                            int soChoOTO = Integer.parseInt(scanner.nextLine());
                            System.out.println("Nhập Kiểu xe ô tô");
                            String kieuOTO = scanner.nextLine();
                            list.add(new Oto(bienKSOTO, namSXOTO, nameOTO, kieuOTO, soChoOTO));
                            break;
                        case 3:
                            System.out.println("Nhập biển kiểm soát");
                            String bienKSXeMay = scanner.nextLine();
                            System.out.println("Nhập năm sản xuất");
                            int namSXXeMay = Integer.parseInt(scanner.nextLine());
                            System.out.println("Chủ phương tiện");
                            String nameXeMay = scanner.nextLine();
                            System.out.println("Nhập công suất xe máy");
                            double congSuatXeMay = Double.parseDouble(scanner.nextLine());
                            list2.add(new XeMay(bienKSXeMay, namSXXeMay, nameXeMay, congSuatXeMay));
                            break;
                        default:
                            System.out.println("Lựa chọn sai");

                    }
                    break;
                case 2:
                    System.out.println("1.Hiển thị danh sách xe tải\n" +
                            "2.Hiển thị danh sách xe ô tô\n" +
                            "3.Hiển thị danh sách xe máy\n");
                    System.out.println("Chọn chức năng");
                    int choose2 = Integer.parseInt(scanner.nextLine());
                    switch (choose2) {
                        case 1:
                            for (XeTai element : list1) {
                                System.out.println(element);
                            }
                            break;
                        case 2:
                            for (Oto element : list) {
                                System.out.println(element);
                            }
                            break;
                        case 3:
                            for (XeMay element : list2) {
                                System.out.println(element);
                            }
                            break;
                        default:
                            System.out.println("Lựa chọn ko đúng");
                            break;
                    }
                    break;
                case 3:
                    int cont = 0;
                    System.out.println("Nhập biển số xe tải cần xoá");
                    String bienSoXeXoa = scanner.nextLine();
                    for (int i = 0; i < list.size(); i++) {
                        if (bienSoXeXoa.equals(list.get(i).getBienKiemSoat())) {
                            System.out.println("Muốn xoá chắc chưa (yes or no)");
                            String xacNhan = scanner.nextLine();
                            if (xacNhan.equals("yes")) {
                                list.remove(i);
                                System.out.println("Xoá thành công\n");
                                cont++;
                                break;
                            } else {
                                System.out.println("Vậy là ko xoá");
                            }
                        }
                    }
                    for (int j = 0; j < list1.size(); j++) {
                        if (bienSoXeXoa.equals(list1.get(j).getBienKiemSoat())) {
                            System.out.println("Muốn xoá chắc chưa (yes or no)");
                            String xacNhan = scanner.nextLine();
                            if (xacNhan.equals("yes")) {
                                list1.remove(j);
                                System.out.println("Xoá thành công\n");
                                cont++;
                                break;
                            } else {
                                System.out.println("Vậy là ko xoá");
                            }
                        }
                    }
                    for (int k = 0; k < list2.size(); k++) {
                        if (bienSoXeXoa.equals(list2.get(k).getBienKiemSoat())) {
                            System.out.println("Muốn xoá chắc chưa (yes or no)");
                            String xacNhan = scanner.nextLine();
                            if (xacNhan.equals("yes")) {
                                list2.remove(k);
                                System.out.println("Xoá thành công\n");
                                cont++;
                                break;
                            } else {
                                System.out.println("Vậy là ko xoá");
                            }
                        }
                    }
                    if (cont == 0) {
                        System.out.println("Ko có xe cần xoá");
                        System.out.println("");
                    }
                    break;
                default:
                    flag = false;
            }

        } while (flag);
    }
}
