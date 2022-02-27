package ss3_mang_va_phuong_thuc_trong_java.thuc_hanh;
import java.util.Scanner;
public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] students={"giang","tin","khoa","huu"};
        System.out.println("Nhập tên sinh viên cần tìm kiếm");
        String student=scanner.nextLine();
        boolean flag=false;
        for(int i=0;i<students.length;i++){
            if(students[i].equals(student)){
                System.out.println("Sinh viên "+student+" có trong danh sách, số thứ tự "+i+1);
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println("Ko tìm thấy sinh viên");
        }
    }
}
