package luyen_tap_de_4.services;

import luyen_tap_de_3.models.SanPham;
import luyen_tap_de_4.models.TaiKhoanNganHang;
import luyen_tap_de_4.models.TaiKhoanThanhToan;
import luyen_tap_de_4.models.TaiKhoanTietKiem;
import luyen_tap_de_4.utils.NotFoundBankAccountException;
import luyen_tap_de_4.utils.ReadAndWriter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TaiKhoanService implements IService {
    private static final List<TaiKhoanNganHang> NGAN_HANG_LIST = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    private static final String REGEX="^(\\p{L}|\\d|-)+( (\\p{L}|\\d|-)+)*$";
    private static final String REGEX_DATE="^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    private static final String REGEX_DOUBLE= "^(\\d*\\.*\\d+)+$";
    private static final String REGEX_INT="^\\d+$";
    static {
        List<String> stringList=ReadAndWriter.read("src\\luyen_tap_de_4\\data\\taikhoan.csv");
        String[] arr;
        List<Integer> array = new ArrayList<>();
        for (String str: stringList){
            if(!str.isEmpty()){
                arr=str.split(",");
                if(arr.length==8){
                    TaiKhoanTietKiem tietKiem=new TaiKhoanTietKiem(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3],Double.parseDouble(arr[4]),arr[5],Double.parseDouble(arr[6]),Integer.parseInt(arr[7]));
                    NGAN_HANG_LIST.add(tietKiem);

                }
                else if(arr.length==6){
                    TaiKhoanThanhToan thanhToan=new TaiKhoanThanhToan(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3],arr[4],Double.parseDouble(arr[5]));
                    NGAN_HANG_LIST.add(thanhToan);

                }
             array.add(Integer.parseInt(arr[0]));
            }
        }
        for (Integer num : array) {
            int max = array.get(0);
            if (max < num) {
                max = num;
                SanPham.setIdTemp(max + 1);
            }
        }
    }
    @Override
    public void creat() {
        System.out.println("1. Thêm tài khoản tiết kiệm\n" +
                "2. Thêm tài khoản thanh toán\n");
        System.out.println("Nhập lựa chọn");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                String code = checkInput("mã tài khoản");
                String name = checkInput("tên tài khoản");
                String date = checkDate("Ngày tạo tài khoản");
                double saveMoney = checkDouble("số tiền tiết kiệm");
                String dateSave = checkDate("ngày gửi tiết kiệm");
                double rate = checkDouble("lãi suất");
                int tenor = checkInt("kì hạn");
                TaiKhoanTietKiem tietKiem = new TaiKhoanTietKiem(code, name, date, saveMoney, dateSave, rate, tenor);
                NGAN_HANG_LIST.add(tietKiem);
                ReadAndWriter.write("src\\luyen_tap_de_4\\data\\taikhoan.csv",NGAN_HANG_LIST,false);
                break;
            case "2":
                System.out.println("Nhập mã tài khoản");
                String codeTT = scanner.nextLine();
                System.out.println("Nhập tên tài khoản");
                String nameTT = scanner.nextLine();
                System.out.println("Nhập ngày tạo tài khoản");
                String dateTT = scanner.nextLine();
                System.out.println("Nhập số tài khoản");
                String numberCard=scanner.nextLine();
                System.out.println("Nhập số tiền trong tài khoản");
                String str5=scanner.nextLine();
                double moneyCard=Double.parseDouble(str5);
                TaiKhoanThanhToan thanhToan=new TaiKhoanThanhToan(codeTT,nameTT,dateTT,numberCard,moneyCard);
                NGAN_HANG_LIST.add(thanhToan);
                ReadAndWriter.write("src\\luyen_tap_de_4\\data\\taikhoan.csv",NGAN_HANG_LIST,false);
                break;
        }
    }

    @Override
    public void delete(String string) throws NotFoundBankAccountException {
        int cont=0;
        ReadAndWriter.read("src\\luyen_tap_de_4\\data\\taikhoan.csv");
        for (int i = 0; i <NGAN_HANG_LIST.size() ; i++) {
            if (NGAN_HANG_LIST.get(i).getCode().equals(string)){
                cont++;
                System.out.println("Bạn có chắc xoá tài khoản này (y/n)");
                String choice=scanner.nextLine();
                if("y".equals(choice)){
                    NGAN_HANG_LIST.remove(i);
                    System.out.println("Xoá thành công");
                }
                else {
                    System.out.println("Bạn ko xoá tài khoản này");
                    break;
                }
            }
        }
        if(cont==0){
            throw new NotFoundBankAccountException("Ko tìm thấy tài khoản cần xoá");
        }
        ReadAndWriter.write("src\\luyen_tap_de_4\\data\\taikhoan.csv",NGAN_HANG_LIST,false);
    }

    @Override
    public void display() {
        ReadAndWriter.read("src\\luyen_tap_de_4\\data\\taikhoan.csv");
        for (TaiKhoanNganHang tk: NGAN_HANG_LIST){
            System.out.println(tk);
        }
    }

    @Override
    public void find() {
        ReadAndWriter.read("src\\luyen_tap_de_4\\data\\taikhoan.csv");
        System.out.println("Nhập mã tài khoản hoặc tên chủ tài khoản");
        String strFind=scanner.nextLine();
        for (TaiKhoanNganHang tk: NGAN_HANG_LIST) {
            if(tk.getCode().contains(strFind)|| tk.getName().contains(strFind)){
                System.out.println(tk);
            }
        }
    }
    private String checkInput(String string){
        String result;
        System.out.print("Nhập "+string);
        do {
            result = scanner.nextLine();
            if (Pattern.matches(REGEX,result)){
                break;
            }else {
                System.out.print(string+" invalid, please try again: ");
            }
        }while (true);
        return result;
    }
    private String checkDate(String string){
        String result;
        System.out.println("Nhập "+string);
        do {
            result = scanner.nextLine();
            if (Pattern.matches(REGEX_DATE,result)){
                break;
            }else {
                System.out.print(string+" invalid, please try again: ");
            }
        }while (true);
        return  result;
    }
    private Double checkDouble(String string){
        String result;
        System.out.println("Nhập "+string);
        do {
            result = scanner.nextLine();
            if (Pattern.matches(REGEX_DOUBLE,result)){
                break;
            }else {
                System.out.print(string+" invalid, please try again: ");
            }
        }while (true);
        return  Double.parseDouble(result);
    }
    private Integer  checkInt(String string){
        String result;
        System.out.println("Nhập "+string);
        do {
            result = scanner.nextLine();
            if (Pattern.matches(REGEX_INT,result)){
                break;
            }else {
                System.out.print(string+" invalid, please try again: ");
            }
        }while (true);
        return  Integer.parseInt(result);
    }
}
