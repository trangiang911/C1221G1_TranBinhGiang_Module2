package case_study.services;

import case_study.models.Employee;
import case_study.utils.ReadAndWrite;
import case_study.utils.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeServiceImpl implements IEmployeeService {
    Scanner scanner = new Scanner(System.in);
    private static final List<Employee> EMPLOYEE_LIST = new ArrayList<>();

    static {
        List<String> employeeList1 = ReadAndWrite.read("src\\case_study\\data\\employee.csv");
        String[] arr;
        if (employeeList1.size() > 0) {
            for (String s : employeeList1) {
                if (!s.isEmpty()) {
                    arr = s.split(",");
                    Employee employee = new Employee(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], Double.parseDouble(arr[9]));
                    EMPLOYEE_LIST.add(employee);
                }
            }
        }
    }

    @Override
    public void create() {
        System.out.println("Nhập tên nhân viên");
        String ten = scanner.nextLine();
        while (!Regex.checkTen(ten)){
            System.out.println("Tên ko đúng format mời nhập lại");
            ten=scanner.nextLine();
        }
        System.out.println("Nhập ngày tháng năm sinh nhân viên");
        String birth = scanner.nextLine();
        while (!Regex.checkNgaySinh(birth)){
            System.out.println("Ngày thnags năm sinh phải theo format dd/mm/yyyy");
            birth=scanner.nextLine();
        }
        System.out.println("Nhập giới tính nhân viên");
        String gioiTinh = scanner.nextLine();
        System.out.println("Nhập số chứng minh nhân dân hoặc căn cước");
        String cmnd = scanner.nextLine();
        while (!Pattern.matches("^[0-9]{9,12}",cmnd)){
            System.out.println("Cmnd ko đúng format mời nhập lại");
            cmnd = scanner.nextLine();
        }
        System.out.println("Nhập mã nhân viên");
        String maNV = scanner.nextLine();
        System.out.println("Nhập email nhân viên");
        String email = scanner.nextLine();
        while (!Regex.checkMail(email)){
            System.out.println("Email ko đúng format, mời nhập lại");
            email=scanner.nextLine();
        }
        System.out.println("Nhập số điện thoại nhân viên");
        String sdt = scanner.nextLine();
        while (!Regex.checkSDT(sdt)){
            System.out.println("Số điện thoại ko đúng format mời nhập lại");
            sdt=scanner.nextLine();
        }
        String viTri = viTri();
        String trinhDo = trinhDo();
        System.out.println("Nhập lương của nhân viên");
        String str=scanner.nextLine();
        while (!Pattern.matches("^[0-9]+$",str)){
            System.out.println("Lương ko hợp lệ mời nhập lại");
            str=scanner.nextLine();
        }
        double luong = Double.parseDouble(str);
        EMPLOYEE_LIST.add(new Employee(ten, birth, gioiTinh, cmnd, email, sdt, maNV, viTri, trinhDo, luong));
        ReadAndWrite.writeForPerson("src\\case_study\\data\\employee.csv", EMPLOYEE_LIST, false);
    }

    @Override
    public void display() {
        for (Employee element : EMPLOYEE_LIST) {
            System.out.println(element.toString());
        }
    }

    @Override
    public void edit() {
        display();
        System.out.println("Nhập mã nhân viên cần chỉnh sửa thông tin");
        String idEdit = scanner.nextLine();
        for (Employee employee : EMPLOYEE_LIST) {
            String choice1;
            do {
                if (employee.getMaNV().equals(idEdit)) {
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
                    String str = scanner.nextLine();
                    while (!Pattern.matches("^[0-9]{1,2}$", str)) {
                        System.out.println("Lựa chọn phải là số (1-10)");
                        str = scanner.nextLine();
                    }
                    int choice = Integer.parseInt(str);
                    boolean flag;
                    do {
                        flag = false;
                        try {
                            switch (choice) {
                                case 1:
                                    System.out.println("Nhập tên mới của nhân viên");
                                    String nameEdit = scanner.nextLine();
                                    employee.setName(nameEdit);
                                    break;
                                case 2:
                                    System.out.println("Nhập ngày tháng năm sinh mới của nhân viên");
                                    String birthEdit = scanner.nextLine();
                                    employee.setDateOfbirth(birthEdit);
                                    break;
                                case 3:
                                    System.out.println("Nhập giới tính mới của nhân viên");
                                    String genderEdit = scanner.nextLine();
                                    employee.setGender(genderEdit);
                                    break;
                                case 4:
                                    System.out.println("Nhập số cmnd (hoặc căn cước) mới của nhân viên");
                                    String cmndEdit = scanner.nextLine();
                                    employee.setIdentityCard(cmndEdit);
                                    break;
                                case 5:
                                    System.out.println("Nhập mã nhân viên mới của nhân viên");
                                    String maEdit = scanner.nextLine();
                                    employee.setMaNV(maEdit);
                                    break;
                                case 6:
                                    System.out.println("Nhập email mới của nhân viên");
                                    String emailEdit = scanner.nextLine();
                                    employee.setEmail(emailEdit);
                                    break;
                                case 7:
                                    System.out.println("Nhập số điện thoai mới của nhân viên");
                                    String sdtEdit = scanner.nextLine();
                                    employee.setsĐT(sdtEdit);
                                    break;
                                case 8:
                                    System.out.println("Nhập vị trí mới của nhân viên");
                                    String vitriEdit = viTri();
                                    employee.setViTri(vitriEdit);
                                    break;
                                case 9:
                                    System.out.println("Nhập trình độ mới của nhân viên");
                                    String trinhDoEdit = trinhDo();
                                    employee.setTrinhDo(trinhDoEdit);
                                    break;
                                case 10:
                                    System.out.println("Nhập lương mới của nhân viên");
                                    double luongEdit = Double.parseDouble(scanner.nextLine());
                                    employee.setLuong(luongEdit);
                                    break;
                                default:
                                    System.out.println("Lựa chọn k đúng");
                                    break;
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                            flag = true;
                        }
                    } while (flag);

                }
                System.out.println("Bạn có muốn tiếp tục chỉnh sửa nhân viên này (yes or no)");
                choice1 = scanner.nextLine();
            } while ("yes".equals(choice1));
        }
    }

    @Override
    public String trinhDo() {
        List<String> stringList = new ArrayList<>();
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
        String str = scanner.nextLine();
        while (!Pattern.matches("^[0-9]$", str)) {
            System.out.println("Ko đúng mời nhập lại");
            str = scanner.nextLine();
        }
        int choice = Integer.parseInt(str);
        switch (choice) {
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
        List<String> stringList = new ArrayList<>();
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
        String str = scanner.nextLine();
        while (!Pattern.matches("^[0-9]$", str)) {
            System.out.println("Lựa chọn k hợp lệ mời nhập lại");
            str = scanner.nextLine();
        }
        int choice = Integer.parseInt(str);
        switch (choice) {
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

}
