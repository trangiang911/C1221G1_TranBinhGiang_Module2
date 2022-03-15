package case_study.services;

import case_study.models.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    Scanner scanner = new Scanner(System.in);
    private static List<Employee> employeeList = new ArrayList<>();

//    static {
//
//    }

    @Override
    public void create() {
        System.out.println("Nhập tên nhân viên");
        String ten = scanner.nextLine();
        System.out.println("Nhập ngày tháng năm sinh nhân viên");
        String birth = scanner.nextLine();
        System.out.println("Nhập giới tính nhân viên");
        String gioiTinh = scanner.nextLine();
        System.out.println("Nhập số chứng minh nhân dân hoặc căn cước");
        String cmnd = scanner.nextLine();
        System.out.println("Nhập mã nhân viên");
        String maNV = scanner.nextLine();
        System.out.println("Nhập email nhân viên");
        String email = scanner.nextLine();
        System.out.println("Nhập số điện thoại nhân viên");
        String sdt = scanner.nextLine();
//        System.out.println("Nhập vị trí nhân viên");
        String viTri = viTri();
//        System.out.println("Nhập trình độ nhân viên");
        String trinhDo = trinhDo();
        System.out.println("Nhập lương của nhân viên");
        double luong = Double.parseDouble(scanner.nextLine());
        employeeList.add(new Employee(ten, birth, gioiTinh, cmnd, email, sdt, maNV, viTri, trinhDo, luong));
    }

    @Override
    public void display() {
        for (Employee element : employeeList) {
            System.out.println(element);
        }
    }

    @Override
    public void edit() {
        display();
        System.out.println("Nhập mã nhân viên cần chỉnh sửa thông tin");
        String idEdit = scanner.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            String choice1=null;
            do {
                if (employeeList.get(i).getMaNV().equals(idEdit)) {
                    System.out.println("Lựa chọn thông tin cần chỉnh sửa");
                    System.out.println("1. Chỉnh sửa tên\n" +
                            "2. Chỉnh ngày tháng năm sinh\n" +
                            "3. Chỉnh sửa giới tình\n" +
                            "4. Chỉnh sửa số cmnd (căn cước)\n" +
                            "5. Chỉnh sửa mã nhân viên\n" +
                            "6. Chỉnh sửa email nhân viên\n" +
                            "7. Chỉnh sửa số đt nhân viên\n" +
                            "8. Chỉnh sửa vị trí nhân viên\n" +
                            "9. Chỉnh sửa trình độ nhân viên\n" +
                            "10. Chỉnh sửa lương nhân viên");
                    System.out.println("Nhập Lựa chọn");
                    int choice = Integer.parseInt(scanner.nextLine());
                    switch (choice){
                        case 1:
                            System.out.println("Nhập tên mới của nhân viên");
                            String nameEdit=scanner.nextLine();
                            employeeList.get(i).setName(nameEdit);
                            break;
                        case 2:
                            System.out.println("Nhập ngày tháng năm sinh mới của nhân viên");
                            String birthEdit=scanner.nextLine();
                            employeeList.get(i).setDateOfbirth(birthEdit);
                            break;
                        case 3:
                            System.out.println("Nhập giới tính mới của nhân viên");
                            String genderEdit=scanner.nextLine();
                            employeeList.get(i).setGender(genderEdit);
                            break;
                        case 4:
                            System.out.println("Nhập số cmnd (hoặc căn cước) mới của nhân viên");
                            String cmndEdit=scanner.nextLine();
                            employeeList.get(i).setIdentityCard(cmndEdit);
                            break;
                        case 5:
                            System.out.println("Nhập mã nhân viên mới của nhân viên");
                            String maEdit=scanner.nextLine();
                            employeeList.get(i).setMaNV(maEdit);
                            break;
                        case 6:
                            System.out.println("Nhập email mới của nhân viên");
                            String emailEdit=scanner.nextLine();
                            employeeList.get(i).setEmail(emailEdit);
                            break;
                        case 7:
                            System.out.println("Nhập số điện thoai mới của nhân viên");
                            String sdtEdit=scanner.nextLine();
                            employeeList.get(i).setsĐT(sdtEdit);
                            break;
                        case 8:
                            System.out.println("Nhập vị trí mới của nhân viên");
                            String vitriEdit=viTri();
                            employeeList.get(i).setViTri(vitriEdit);
                            break;
                        case 9:
                            System.out.println("Nhập trình độ mới của nhân viên");
                            String trinhDoEdit=trinhDo();
                            employeeList.get(i).setTrinhDo(trinhDoEdit);
                            break;
                        case 10:
                            System.out.println("Nhập lương mới của nhân viên");
                            double luongEdit=Double.parseDouble(scanner.nextLine());
                            employeeList.get(i).setLuong(luongEdit);
                            break;
                        default:
                            System.out.println("Lựa chọn k đúng");
                            break;
                    }

                }
                System.out.println("Bạn có muốn tiếp tục chỉnh sửa nhân viên này (yes or no)");
                choice1=scanner.nextLine();
            } while ("yes".equals(choice1));
        }
    }

    @Override
    public void delete() {
        display();
        System.out.println("Nhập mã nhân vân cần xoá");
        String maDel=scanner.nextLine();
        for (int i = 0; i < employeeList.size() ; i++) {
            if(employeeList.get(i).getMaNV().equals(maDel)){
                System.out.println("Bạn có chắc xoá nhân viên này");
                String choice=scanner.nextLine();
                if("yes".equals(choice)){
                    employeeList.remove(i);
                    System.out.println("xoá thành công");
                }
            }
        }
    }

    @Override
    public String trinhDo() {
        List<String> stringList=new ArrayList<>();
        stringList.add("Trung cấp");
        stringList.add("Cao đẳng");
        stringList.add("Đại học");
        stringList.add("Sau đại học");
        System.out.println("Chọn trình độ của nhân viên");
        System.out.println("1. Trung cấp\n" +
                "2. Cao đẳng\n" +
                "3. Đại học\n" +
                "4. Sau đại học");
        System.out.println("Nhập lựa chọn");
        int choice=Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                return stringList.get(0);
            case 2:
                return stringList.get(1);
            case 3:
                return stringList.get(2);
            case 4:
                return stringList.get(3);
            default:
                System.out.println("Lựa chọn ko đúng");
                return null;

        }
    }

    @Override
    public String viTri() {
        List<String> stringList=new ArrayList<>();
        stringList.add("Lễ tân");
        stringList.add("Phục vụ");
        stringList.add("Chuyên viên");
        stringList.add("Giám sát");
        stringList.add("Quản lý");
        stringList.add("Giám đốc");
        System.out.println("Chọn vị trí của nhân viên");
        System.out.println("1. Lễ tân\n" +
                "2. Phục vụ\n" +
                "3. Chuyên viên\n" +
                "4. Giám sát\n" +
                "5. Quản lý\n" +
                "6. Giám đốc");
        System.out.println("Nhập lựa chọn");
        int choice=Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                return stringList.get(0);
            case 2:
                return stringList.get(1);
            case 3:
                return stringList.get(2);
            case 4:
                return stringList.get(3);
            case 5:
                return stringList.get(4);
            case 6:
                return stringList.get(5);
            default:
                System.out.println("Lựa chọn ko hợp lệ");
                return null;
        }
    }

    public static void main(String[] args) {
        EmployeeServiceImpl employeeService=new EmployeeServiceImpl();
        employeeService.create();
        employeeService.display();
        employeeService.edit();
    }
}
