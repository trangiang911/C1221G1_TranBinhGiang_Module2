package luyen_tap_de_4.services;

import luyen_tap_de_3.models.SanPham;
import luyen_tap_de_4.models.TaiKhoanNganHang;
import luyen_tap_de_4.models.TaiKhoanThanhToan;
import luyen_tap_de_4.models.TaiKhoanTietKiem;
import luyen_tap_de_4.utils.NotFoundBankAccountException;
import luyen_tap_de_4.utils.ReadAndWriter;

import java.util.ArrayList;
import java.util.Date;
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
        int max = 0;
        for (Integer num : array) {
            max = array.get(0);
            if (max < num) {
                max = num;
            }
        }
        TaiKhoanNganHang.setIdTemp(max + 1);

    }
    @Override
    public void creat() {
        System.out.println("1. Th??m t??i kho???n ti???t ki???m\n" +
                "2. Th??m t??i kho???n thanh to??n\n");
        System.out.println("Nh???p l???a ch???n");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                String code = checkInput("m?? t??i kho???n");
                String name = checkInput("t??n t??i kho???n");
                String date = checkDate("Ng??y t???o t??i kho???n");
                double saveMoney = checkDouble("s??? ti???n ti???t ki???m");
                String dateSave = checkDate("ng??y g???i ti???t ki???m");
                while (Date.parse(date)-Date.parse(dateSave)<0){
                    System.out.println("Ng??y g???i ti???t ki???m ph???i l???n h??n ng??y t???o t??i kho???n");
                    dateSave=checkDate("l???i ng??y g???i ti???t ki???m");
                }
                double rate = checkDouble("l??i su???t");
                int tenor = checkInt("k?? h???n");
                TaiKhoanTietKiem tietKiem = new TaiKhoanTietKiem(code, name, date, saveMoney, dateSave, rate, tenor);
                NGAN_HANG_LIST.add(tietKiem);
                ReadAndWriter.write("src\\luyen_tap_de_4\\data\\taikhoan.csv",NGAN_HANG_LIST,false);
                break;
            case "2":
                System.out.println("Nh???p m?? t??i kho???n");
                String codeTT = scanner.nextLine();
                System.out.println("Nh???p t??n t??i kho???n");
                String nameTT = scanner.nextLine();
                System.out.println("Nh???p ng??y t???o t??i kho???n");
                String dateTT = scanner.nextLine();
                System.out.println("Nh???p s??? t??i kho???n");
                String numberCard=scanner.nextLine();
                System.out.println("Nh???p s??? ti???n trong t??i kho???n");
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
                System.out.println("B???n c?? ch???c xo?? t??i kho???n n??y (y/n)");
                String choice=scanner.nextLine();
                if("y".equals(choice)){
                    NGAN_HANG_LIST.remove(i);
                    System.out.println("Xo?? th??nh c??ng");
                }
                else {
                    System.out.println("B???n ko xo?? t??i kho???n n??y");
                    break;
                }
            }
        }
        if(cont==0){
            throw new NotFoundBankAccountException("Ko t??m th???y t??i kho???n c???n xo??");
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
        System.out.println("Nh???p m?? t??i kho???n ho???c t??n ch??? t??i kho???n");
        String strFind=scanner.nextLine();
        for (TaiKhoanNganHang tk: NGAN_HANG_LIST) {
            if(tk.getCode().contains(strFind)|| tk.getName().contains(strFind)){
                System.out.println(tk);
            }
        }
    }
    private String checkInput(String string){
        String result;
        System.out.print("Nh???p "+string);
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
        System.out.println("Nh???p "+string);
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
        System.out.println("Nh???p "+string);
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
        System.out.println("Nh???p "+string);
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
