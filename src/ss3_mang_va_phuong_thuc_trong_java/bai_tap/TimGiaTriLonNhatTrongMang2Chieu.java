package ss3_mang_va_phuong_thuc_trong_java.bai_tap;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class TimGiaTriLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số hàng");
        int h=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số cột");
        int c=Integer.parseInt(scanner.nextLine());
        int[][] arr=new  int[h][c];
        System.out.println("Nhập phần tử cho mảng 2 chiều");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("Mảng 2 chiều là : ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.print("\n");
        }
        System.out.println("");
        int hang = 0;
        int cot=0;
        int max=arr[0][0];
        for (int i=1;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                    hang=i+1;
                    cot=j+1;
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng 2 chiều là "+max+" tại vị trí hàng "+hang+" vị trí cột "+cot);
    }
}

