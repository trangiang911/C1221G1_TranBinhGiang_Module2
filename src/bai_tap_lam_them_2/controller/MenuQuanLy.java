package bai_tap_lam_them_2.controller;

import bai_tap_lam_them_2.services.NotFoundVehicelException;
import bai_tap_lam_them_2.services.ServiceXe;

import java.util.Scanner;

public class MenuQuanLy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        ServiceXe serviceXe = new ServiceXe();
        do {
            System.out.println("Menu quản lý");
            System.out.println("1. Thêm mới xe\n" +
                    "2. Hiển thị xe\n" +
                    "3. Xoá xe\n" +
                    "4. Thoát");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    serviceXe.addXe();
                    break;
                case 2:
                    serviceXe.display();
                    break;
                case 3:
                    String bienSoXoa;
                    int cont=0;
                    do {
                        System.out.println("Nhập biển số xe cần xoá");
                        bienSoXoa=scanner.nextLine();
                        if("".equals(bienSoXoa)){
                            break;
                        }
                        try {
                            serviceXe.delete(bienSoXoa);
                            cont++;
                        } catch (NotFoundVehicelException e) {
                            e.printStackTrace();
                        }
                    } while (cont==0);
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("Lựa chọn k đúng");
                    break;
            }
        } while (choice != 4);
    }
}
