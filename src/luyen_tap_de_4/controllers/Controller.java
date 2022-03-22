package luyen_tap_de_4.controllers;

import luyen_tap_de_4.services.TaiKhoanService;
import luyen_tap_de_4.utils.NotFoundBankAccountException;

import java.util.Scanner;

public class Controller {
    public void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        TaiKhoanService taiKhoanService = new TaiKhoanService();
        System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ TÀI KHOẢN NGÂN HÀNG –-");
        String choice;
        do {
            System.out.println("\nChọn chức năng theo số (để tiếp tục):\n" +
                    "1. Thêm mới\n" +
                    "2. Xóa\n" +
                    "3. Xem danh sách các tài khoản ngân hàng\n" +
                    "4. Tìm kiếm\n" +
                    "5. Thoát\n");
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    taiKhoanService.creat();
                    break;
                case "2":
                    String codeDel;
                    int cont = 0;
                    do {
                        System.out.println("Nhập mã tài khoản cần xoá");
                        codeDel = scanner.nextLine();
                        if ("".equals(codeDel)){
                            break;
                        }try {
                            taiKhoanService.delete(codeDel);
                            cont++;
                        }catch (NotFoundBankAccountException e){
                            e.printStackTrace();
                        }
                    }while (cont==0);
                    break;
                case "3":
                    taiKhoanService.display();
                    break;
                case "4":
                    taiKhoanService.find();
                    break;
                case "5":
                    System.exit(5);
                default:
                    System.out.println("lựa chọn k hợp lệ");
                    break;
            }
        } while (true);
    }
}
