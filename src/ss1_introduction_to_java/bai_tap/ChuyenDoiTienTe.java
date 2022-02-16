package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền cần chuyển đổi");
        double money = Double.parseDouble(scanner.nextLine());
        final double TI_GIA = 23000;
        double doLa = money * TI_GIA;
        System.out.println("Số tiền bạn cần chuyển là " + doLa);
    }
}
