package ss3_mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Arrays;
import java.util.Scanner;
public class ThemPhanTuMang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập độ dài mảng:");
        int m=Integer.parseInt(scanner.nextLine());
        int[] arr=new int[m+1];
        arr[0]=0;
        System.out.println("Nhập phần tử của mảng:");
        for (int i=0;i<arr.length-1;i++){
            arr[i]=Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhập số cần thêm");
        int a=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vị trí cần thêm");
        int index=Integer.parseInt(scanner.nextLine());
        for (int i=0;i<arr.length;i++){
            if(i==index){
                for (int j=i+1;j<arr.length;j++){
                    arr[arr.length-1]=arr[arr.length-2];
                }
                arr[i]=a;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
