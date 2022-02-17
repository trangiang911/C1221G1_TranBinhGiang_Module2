package ss2_vong_lap_trong_java.bai_tap;
import java.util.Scanner;
public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (n < 100) {
            boolean flag = true;
            if (n < 2) {
                flag = false;
            } else {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag == true) {
                System.out.print(n + " ");
            }
            n++;
        }
    }
}

