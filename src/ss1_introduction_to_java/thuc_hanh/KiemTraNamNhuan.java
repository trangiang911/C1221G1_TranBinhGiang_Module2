package ss1_introduction_to_java.thuc_hanh;
import java.util.Scanner;
public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner((System.in));
        System.out.println("Nhập năm: ");
        int year=Integer.parseInt(scanner.nextLine());
        boolean flag=false;
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    flag=true;
                }
                else {
                    flag=false;
                }
            }else {
                flag=true;
            }
        }else {
            flag=false;
        }
    if(flag){
        System.out.printf("%d là năm nhuận",year);
    }
    else {
        System.out.printf("%d ko là năm nhuận",year);
    }
    }
}
