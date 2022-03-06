package collection_review.services;

import collection_review.models.Candidate;
import collection_review.models.Experience;
import collection_review.models.Fresher;
import collection_review.models.Intern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandidateManager {
    Scanner scanner = new Scanner(System.in);
    private List<Candidate> candidateList = new ArrayList<>();
    int choice;
    public void display(){
        for (Candidate element: candidateList){
            System.out.println(element);
        }
    }
    public void add() {
        System.out.println("Lựa chọn loại ứng viên thêm mới");
        System.out.println("1.Experience\n" +
                "2.Fresher\n" +
                "3.Intern");

        choice=Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                System.out.println("Nhập id ứng viên");
                String id=scanner.nextLine();
                System.out.println("Nhập tên ứng viên");
                String name=scanner.nextLine();
                System.out.println("Nhập Năm sinh ứng viên");
                int birth=Integer.parseInt(scanner.nextLine());
                while (birth<1900 || String.valueOf(birth).length()!=4){
                    System.out.println("Năm sinh ứng viên không hợp lệ, mời nhập lại");
                    birth = Integer.parseInt(scanner.nextLine());
                }
                System.out.println("Nhập địa chỉ ứng viên");
                String addres=scanner.nextLine();
                System.out.println("Nhập số điện thoại ứng viên");
                String phone=scanner.nextLine();
                while (phone.length()!=10 ){
                    System.out.println("Số điện thoại không hợp lệ, mời nhập lại");
                    phone = scanner.nextLine();
                }
                String type="Experience";
                System.out.println("Nhập kinh nghiệm của ứng viên");
                int exp=Integer.parseInt(scanner.nextLine());
                while (exp<0 || exp>100){
                    System.out.println("Kinh nghiệm ứng viên k hợp lệ, mời nhập lại");
                    exp=Integer.parseInt(scanner.nextLine());
                }
                System.out.println("Nhập cách ký năng thành thục của ứng viên");
                String skill=scanner.nextLine();
                candidateList.add(new Experience(id,name,birth,addres,phone,type,exp,skill));
                System.out.println("Bạn muốn tiếp tục thê mới ứng viên không (yes or no)");
                String isYes=scanner.nextLine();
                if("yes".equals(isYes)){
                    add();
                }
                else {
                    break;
                }
                break;
            case 2:
                System.out.println("Nhập id ứng viên");
                String idFres=scanner.nextLine();
                System.out.println("Nhập tên ứng viên");
                String nameFres=scanner.nextLine();
                System.out.println("Nhập Năm sinh ứng viên");
                int birthFres=Integer.parseInt(scanner.nextLine());
                while (birthFres<1900 || String.valueOf(birthFres).length()!=4){
                    System.out.println("Năm sinh ứng viên không hợp lệ, mời nhập lại");
                    birthFres = Integer.parseInt(scanner.nextLine());
                }
                System.out.println("Nhập địa chỉ ứng viên");
                String addresFres=scanner.nextLine();
                System.out.println("Nhập số điện thoại ứng viên");
                String phoneFres=scanner.nextLine();
                while (phoneFres.length()!=10 ){
                    System.out.println("Số điện thoại không hợp lệ, mời nhập lại");
                    phoneFres = scanner.nextLine();
                }
                String typeFres="Fresher";
                System.out.println("Nhập thời gian tốt nghiệm của ứng viên");
                String graTime=scanner.nextLine();
                System.out.println("Chọn loại tốt nghiệp");
                System.out.println("1.Xuất sắc\n" +
                        "2.tốt\n" +
                        "3.trung bình\n" +
                        "3.kém");
                String graRank = null;
                int choice1=Integer.parseInt(scanner.nextLine());
                switch (choice1){
                    case 1:
                        graRank="xuất sắc";
                        break;
                    case 2:
                        graRank="tốt";
                        break;
                    case 3:
                        graRank="Trung bình";
                        break;
                    case 4:
                        graRank="yếu";
                        break;
                    default:
                        System.out.println("Lựa chọn k đúng loại tốt nghiệp");
                        break;
                }
                System.out.println("Nhập trường tốt nghiệp");
                String eduFres=scanner.nextLine();
                candidateList.add(new Fresher(idFres,nameFres,birthFres,addresFres,phoneFres,typeFres,graTime,graRank,eduFres));
                System.out.println("Bạn muốn tiếp tục thê mới ứng viên không (yes or no)");
                String isYes2=scanner.nextLine();
                if("yes".equals(isYes2)){
                    add();
                }
                else {
                    break;
                }
                break;
            case 3:
                System.out.println("Nhập id ứng viên");
                String idInter=scanner.nextLine();
                System.out.println("Nhập tên ứng viên");
                String nameInter=scanner.nextLine();
                System.out.println("Nhập Năm sinh ứng viên");
                int birthInter=Integer.parseInt(scanner.nextLine());
                while (birthInter<1900 || String.valueOf(birthInter).length()!=4){
                    System.out.println("Năm sinh ứng viên không hợp lệ");
                    birthInter = Integer.parseInt(scanner.nextLine());
                }
                System.out.println("Nhập địa chỉ ứng viên");
                String addresInter=scanner.nextLine();
                System.out.println("Nhập số điện thoại ứng viên");
                String phoneInter=scanner.nextLine();
                while (phoneInter.length()!=10 ){
                    System.out.println("Số điện thoại không hợp lệ");
                    phoneInter = scanner.nextLine();
                }
                String typeInter="Intern";
                System.out.println("Nhập chuyên ngành ứng viên");
                String major=scanner.nextLine();
                System.out.println("Loại của ứng viên trong học kỳ vừa rồi");
                String semeter=scanner.nextLine();
                System.out.println("Nhập tên trường đang theo học");
                String eduInter=scanner.nextLine();
                candidateList.add(new Intern(idInter,nameInter,birthInter,addresInter,phoneInter,typeInter,major,semeter,eduInter));
                System.out.println("Bạn muốn tiếp tục thê mới ứng viên không (yes or no)");
                String isYes3=scanner.nextLine();
                if("yes".equals(isYes3)){
                    add();
                }
                else {
                    break;
                }
                break;
        }
    }
    public void find(){
        display();
        int cont=0;
        System.out.println("Nhập dấu hiệu tìm kiếm ứng viên");
        String nameFind=scanner.nextLine();
        for (int i=0;i<candidateList.size();i++){
            if(candidateList.get(i).getName().contains(nameFind)){
                System.out.println(candidateList.get(i));
                cont++;
            }
        }
        if(cont==0){
            System.out.println("Ko tìm thấy ứng viên tương ứng");
        }
    }
}
