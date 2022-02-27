package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int m = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[m];
        System.out.println("Nhập phần tử của mảng");
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhập phần tử cần xóa");
        int x = Integer.parseInt(scanner.nextLine());

        for (int j = 0; j < arr.length; j++) {
            if(arr[arr.length-1]==x){
                arr[arr.length-1]=0;
            }
            else if (arr[j] == x) {
                for(int k=j;k<arr.length-1;k++){
                    arr[k]=arr[k+1];
                }
                j--;
                arr[arr.length-1]=0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
