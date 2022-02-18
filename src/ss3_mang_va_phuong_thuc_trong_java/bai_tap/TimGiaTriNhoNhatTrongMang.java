package ss3_mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Arrays;
import java.util.Scanner;
public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int m=Integer.parseInt(scanner.nextLine());
        int[] arr=new int[m];
        System.out.println("Nhập phần tử mảng:");
        for(int i=0;i<m;i++){
            arr[i]=Integer.parseInt(scanner.nextLine());
        }
        int min=arr[0];
        int index=0;
        System.out.println(Arrays.toString(arr));
        for (int i=1;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
                index=i;
            }
        }
        System.out.println("Giá trị bé nhất trong mảng là: "+min+" tại vị trí index là "+index);

    }
}
