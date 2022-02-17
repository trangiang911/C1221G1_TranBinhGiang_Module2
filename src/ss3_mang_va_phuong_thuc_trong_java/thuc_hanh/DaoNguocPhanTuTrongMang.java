package ss3_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DaoNguocPhanTuTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        int size;
        do {
            System.out.println("Nhập độ lớn mảng");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 20) {
                System.out.println("Độ lớn mảng ko vượt quá 20:");
            }
        } while (size > 20);
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ " + i + " của mảng");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng ban đầu");
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length / 2; j++) {
            int temp = arr[j];
            arr[j] = arr[size - 1 - j];
            arr[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
