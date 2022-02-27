package bai_tap_lam_them_1.xuat_nhap_thong_tin_xe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        List<Vehicle> list = new ArrayList<>();
        do {
            System.out.println("");
            System.out.println("Main menu:\n" +
                    "1. Tạo đối tuọng xe mới và nhập thông tin \n" +
                    "2. Xuất bảo kê khai thuế \n" +
                    "3. Thoát menu \n");
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Nhập giá trị xe");
                    double giaTri = Double.parseDouble(scanner.nextLine());
                    System.out.println("Nhập dung tích xylanh");
                    int xilanh = Integer.parseInt(scanner.nextLine());
                    list.add(new Vehicle(giaTri, xilanh));
                    for (Vehicle element : list) {
                        System.out.println(element);
                    }
                    break;
                case 2:
                    for (Vehicle element : list) {
                        System.out.println(element.HienThiThueCuaTungXe());
                    }
                    break;
                default:
                    flag = false;
                    break;
            }


        } while (flag);

    }
}
