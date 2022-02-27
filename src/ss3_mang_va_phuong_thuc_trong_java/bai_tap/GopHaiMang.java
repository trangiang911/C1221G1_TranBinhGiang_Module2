package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class GopHaiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng 1:");
        int m = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập phần tử mảng 1");
        int[] arr1 = new int[m];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println("Nhập độ dài mảng 2:");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập phần tử mảng 2");
        int[] arr2 = new int[n];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = new int[m + n];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr2.length+i]=arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
