package luyen_tap_de_3.controllers;

import luyen_tap_de_3.service.SanPhamService;
import luyen_tap_de_3.utils.NotFoundProductException;

import java.util.Scanner;

public class SanPhamControllers {
        Scanner scanner=new Scanner(System.in);
        SanPhamService sanPhamService=new SanPhamService();
        public void displayMainMenu(){
            System.out.println("-- CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM---");
            System.out.println("Chọn chức năng theo số (tiếp tục)");
            String choice;
            do {
                System.out.println("1. Thêm mới\n" +
                        "2. Xoá\n" +
                        "3. Xem danh sách\n" +
                        "4. Tìm kiếm\n" +
                        "5. Thoát\n" +
                        "Chọn chức năng");
                choice=scanner.nextLine();
                switch (choice){
                    case "1":
                        sanPhamService.creat();
                        break;
                    case "2":
                        String maSPDel;
                        int cont=0;
                        do {
                            System.out.println("Nhập mã sản phẩm cần xoá");
                            maSPDel=scanner.nextLine();
                            if("".equals(maSPDel)){
                                break;
                            }try {
                            sanPhamService.delete(maSPDel);
                            cont++;
                            }catch (NotFoundProductException e){
                                e.printStackTrace();
                            }
                        }while (cont==0);
                        break;
                    case "3":
                        sanPhamService.display();
                        break;
                    case "4":
                        sanPhamService.find();
                        break;
                    case "5":
                        System.exit(5);
                    default:
                        System.out.println("Lựa chọn k hợp lệ mời nhập lại");
                }
            }while (true);
        }
}
