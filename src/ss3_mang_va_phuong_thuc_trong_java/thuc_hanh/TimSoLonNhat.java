package ss3_mang_va_phuong_thuc_trong_java.thuc_hanh;
import java.util.Arrays;
import java.util.Scanner;
public class TimSoLonNhat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int x=Integer.parseInt(scanner.nextLine());
        int[] arr;
        arr=new int[x];
        System.out.println("Nhập phần tử của mảng");
        for(int i=0;i<x;i++){
            arr[i]=Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        int max=arr[0];
        int index = 0;
        for (int j=1;j<arr.length;j++){
            if(arr[j]>max){
                max=arr[j];
                index=j+1;
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là "+max+" tại vị trí "+index);
    }
}
