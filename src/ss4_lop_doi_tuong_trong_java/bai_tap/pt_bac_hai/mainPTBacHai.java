package ss4_lop_doi_tuong_trong_java.bai_tap.pt_bac_hai;
import java.util.Scanner;
public class mainPTBacHai {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập a:");
        double a=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập b:");
        double b=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập c");
        double c=Double.parseDouble(scanner.nextLine());
        PTBacHai pt1= new PTBacHai(a,b,c);
        System.out.println(pt1.getDelta());
        if(pt1.getDelta()>0){
            System.out.println("PT có 2 nghiệm phân biệt x1= "+pt1.getRoot1()+" và x2= "+pt1.getRoot2());
        }
        else if(pt1.getDelta()==0){
            System.out.println("PT có 1 nghiệm x= "+pt1.getRoot1());
        }
        else {
            System.out.println("PT vô nghiệm");
        }
    }
}
