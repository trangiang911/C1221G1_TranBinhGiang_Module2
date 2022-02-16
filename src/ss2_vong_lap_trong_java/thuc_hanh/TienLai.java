package ss2_vong_lap_trong_java.thuc_hanh;
import java.util.Scanner;
public class TienLai {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập tiền");
        double money=Double.parseDouble(sc.nextLine());
        System.out.println("Nhập tháng");
        double month=Double.parseDouble(sc.nextLine());
        System.out.println("Nhập lãi");
        double rate=Double.parseDouble(sc.nextLine());
        double total=0;
        for (int i=0;i<month;i++){
            total+=money*(rate/100)/12*month;
        }
        System.out.println("Tiền lãi là"+total);
    }
}

