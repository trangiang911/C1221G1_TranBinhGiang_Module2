package ss2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Hình chử nhật\n" + "2.hình tam giác vuông xuôi\n" + "3.Hình tam giác vuông ngược");
        System.out.println("Nhập lựa chọn: ");
        int x = Integer.parseInt(scanner.nextLine());
        switch (x) {
            case 1:
                for (int i = 0; i < 3; i++) {
                    System.out.println("*******");
                }
                break;
            case 2:
                for (int i=0;i<=5;i++){
                    for (int j=0;j<i;j++){
                        System.out.print("*");
                    }
                    System.out.println("\n");
                }
                break;
            case 3:
                for (int i=0;i<5;i++){
                    for (int j=5;j>i;j--){
                        System.out.print("*");
                    }
                    System.out.println("\n");
                }
                break;
        }
    }
}