package ss17_io_binary_file_serialization.bai_tap.controller;

import ss17_io_binary_file_serialization.bai_tap.services.Service;

import java.util.Scanner;

public class ControllerSanPham {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        Service service = new Service();
        do {
            System.out.println("====Menu Thao tác====");
            System.out.println("1.Thêm sản phẩm\n" +
                    "2.Hiển thị sản phẩm\n" +
                    "3.tìm kiếm sản phẩm\n" +
                    "4.thoát");
            choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    service.add();
                    break;
                case 2:
                    service.display();
                    break;
                case 3:
                    service.find();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Lựa chọn k hợp lệ");
            }
        }while(choice!=4);
    }
}
