package luyen_tap_de.controllers;

import luyen_tap_de.models.DienThoaiChinhHang;
import luyen_tap_de.services.DienThoaiService;
import luyen_tap_de.utils.NotFoundProductException;

import java.util.Scanner;

public class MobileControllers {
    Scanner scanner=new Scanner(System.in);
    DienThoaiService dienThoaiService=new DienThoaiService();
    public void displayMainMenu(){
        System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI--");
        System.out.println("Chọn chức năng theo số (để tiếp tục)");
        String choice;
        do {
        System.out.println("1. Thêm mới\n" +
                "2. Xoá\n" +
                "3. Xem danh sách điện thoại\n" +
                "4. Tìm kiếm\n" +
                "5. Thoát");
        System.out.println("Nhập lụa chọn");
        choice=scanner.nextLine();
        switch (choice){
            case "1":
                dienThoaiService.creat();
                break;
            case "2":
//                System.out.println("Nhập id điện thoại cần xoá");
                String idDel;
                int cont=0;
                do {
                    System.out.println("Nhập id điện thoại cần xoá");
                    idDel=scanner.nextLine();
                    if("".equals(idDel)){
                        break;
                    }try{
                        dienThoaiService.delete(idDel);
                        cont++;
                    }catch (NotFoundProductException e){
                        e.printStackTrace();
                    }
                }while (cont==0);
                break;
            case "3":
                dienThoaiService.display();
                break;
            case "4":
                dienThoaiService.find();
                break;
            case "5":
                System.exit(4);
            default:
                System.out.println("Lựa chọn ko hợp lệ");
                break;
        }
    }while (!choice.equals("5"));
    }
}
