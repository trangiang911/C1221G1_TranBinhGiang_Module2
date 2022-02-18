package ss3_mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Scanner;
public class DemSoKyTu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String str=scanner.nextLine();
        System.out.println("Nhập ký tự cần tìm");
        char x=scanner.nextLine().charAt(0);
        char[] arr=str.toCharArray();
        int cont=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                cont++;
            }
        }
        System.out.println("Số lần "+x+" xuất hiện là "+cont);
    }
}
