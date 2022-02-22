package ss2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Hình chử nhật\n" + "2.hình tam giác vuông xuôi\n" + "3.Hình tam giác vuông ngược\n"+"4.Hình tam giác cân\n"+"5.Hình tam giác vuông trên phải\n"+"6.Hình tam giác vuông dưới phải\n");
        System.out.println("Nhập lựa chọn: ");
        int x = Integer.parseInt(scanner.nextLine());
        switch (x) {
            case 1:
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 2:
                for (int i = 0; i <= 5; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("\n");
                }
                break;
            case 3:
                for (int i = 0; i < 5; i++) {
                    for (int j = 5; j > i; j--) {
                        System.out.print("*");
                    }
                    System.out.println("\n");
                }
                break;
            case 4:
                for (int i = 1; i < 6; i++) {
                    for (int j = 6; j >= i; j--) {
                        System.out.print(" ");
                    }
                    for (int q = 1; q <= i * 2 - 1; q++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                break;
            case 5:
                for (int i = 5; i >=1 ; i--) {
                    for (int j = 5; j >=i ; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k <i ; k++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 6:
                for (int i = 5; i >=1 ; i--) {
                    for (int j = 1; j <=(i-1) ; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <=(5-(i-1)) ; k++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
        }
    }
}