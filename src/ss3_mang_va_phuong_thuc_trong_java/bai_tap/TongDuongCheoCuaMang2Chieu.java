package ss3_mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Scanner;
public class TongDuongCheoCuaMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng");
        int h = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số cột");
        int c;
        do {
            c=Integer.parseInt(scanner.nextLine());
            if(c!=h){
                System.out.println("Số cột phải bằng số hàng, nhập lại số cốt");
            }
        }while (c!=h);
        int[][] arr = new int[h][c];
        System.out.println("Nhập phần tử mảng 2 chiều:");
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("Mảng 2 chiều là : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.print("\n");
        }
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i][i];
        }
        System.out.println("Tổng đường chéo của mảng này là "+sum);
    }
}
