package luyen_tap_de_1.services;

import luyen_tap_de_1.models.DienThoai;
import luyen_tap_de_1.models.DienThoaiChinhHang;
import luyen_tap_de_1.models.DienThoaiXachTay;
import luyen_tap_de_1.utils.NotFoundProductException;
import luyen_tap_de_1.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DienThoaiService implements IDienThoai {
    private static final List<DienThoaiChinhHang> DIEN_THOAI_CHINH_HANGS = new ArrayList<>();
    private static final List<DienThoaiXachTay> DIEN_THOAI_XACH_TAYS = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    static {
        List<Integer> arr=new ArrayList<>();
        List<String> stringList = ReadAndWrite.read("src\\luyen_tap_de\\data\\chinhHang.csv");
        List<String> stringList1 = ReadAndWrite.read("src\\luyen_tap_de\\data\\xachTay.csv");
        String[] arr1;
        String[] arr2;
        for (String item : stringList) {
            if (!item.isEmpty()) {
                arr1 = item.split(",");
                DienThoaiChinhHang dienThoaiChinhHang = new DienThoaiChinhHang(Integer.parseInt(arr1[0]), arr1[1],
                        Double.parseDouble(arr1[2]), Integer.parseInt(arr1[3]), arr1[4], arr1[5], arr1[6]);
                DIEN_THOAI_CHINH_HANGS.add(dienThoaiChinhHang);
                arr.add(Integer.parseInt(arr1[0]));
            }
        }
        for (String item : stringList1) {
            if (!item.isEmpty()) {
                arr2 = item.split(",");
                DienThoaiXachTay dienThoaiXachTay = new DienThoaiXachTay(Integer.parseInt(arr2[0]), arr2[1],
                        Double.parseDouble(arr2[2]), Integer.parseInt(arr2[3]), arr2[4], arr2[5], arr2[6]);
                DIEN_THOAI_XACH_TAYS.add(dienThoaiXachTay);
                arr.add(Integer.parseInt(arr2[0]));
            }
        }
        for (Integer num: arr){
            int max= arr.get(0);
            if(max<num){
                max=num;
                DienThoai.setIdtemp(max+1);
            }
        }

    }

    @Override
    public String warrantyCoverage() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Toan Quoc");
        stringList.add("Quoc Te");
        System.out.println("1. To??n qu???c" +
                "2. Qu???c t??");
        System.out.println("Nh???p l???a ch???n");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                return stringList.get(0);
            case "2":
                return stringList.get(1);
            default:
                System.out.println("L???a ch???n k ????ng");
                return null;
        }
    }

    @Override
    public String status() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Da sua chua");
        stringList.add("Chua sua chua");
        System.out.println("1. ???? s??a ch???a" +
                "2. Ch??a s???a ch???a");
        System.out.println("Nh???p l???a ch???n");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                return stringList.get(0);
            case "2":
                return stringList.get(1);
            default:
                System.out.println("L???a ch???n k h???p l???");
                return null;
        }
    }

    @Override
    public void creat() {
        System.out.println("1. Th??m m???i ??i???n tho???i ch??nh h??ng\n" +
                "2. Th??m m???i ??i???n tho???i x??ch tay");
        System.out.println("Nh???p l???a ch???n");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                System.out.println("Nh???p t??n ??i???n tho???i");
                String name = scanner.nextLine();
                System.out.println("Nh???p gi?? b??n");
                String str1 = scanner.nextLine();
                double price = Double.parseDouble(str1);
                System.out.println("Nh???p s??? l?????ng");
                String str2 = scanner.nextLine();
                int sl = Integer.parseInt(str2);
                System.out.println("Nh???p nh?? s???n xu???t");
                String nSX = scanner.nextLine();
                System.out.println("Nh???p th???i gian b???o h??nh");
                String date = scanner.nextLine();
                System.out.println("Nh???p ph???m vi b???o h??nh");
                String limit = warrantyCoverage();
                DienThoaiChinhHang dienThoaiChinhHang = new DienThoaiChinhHang(name, price, sl, nSX, date, limit);
                DIEN_THOAI_CHINH_HANGS.add(dienThoaiChinhHang);
                ReadAndWrite.write("src\\luyen_tap_de\\data\\chinhHang.csv", DIEN_THOAI_CHINH_HANGS, false);
                System.out.println("Ghi file th??nh c??ng");
                break;
            case "2":
                System.out.println("Nh???p t??n ??i???n tho???i");
                String nameXT = scanner.nextLine();
                System.out.println("Nh???p gi?? b??n");
                String str3 = scanner.nextLine();
                double priceXT = Double.parseDouble(str3);
                System.out.println("Nh???p s??? l?????ng");
                String str4 = scanner.nextLine();
                int slXT = Integer.parseInt(str4);
                System.out.println("Nh???p nh?? s???n xu???t");
                String nSXXT = scanner.nextLine();
                System.out.println("Nh???p qu???c gia x??ch tay");
                String nation = scanner.nextLine();
                System.out.println("Nh???p tr???ng th??i c???a m??y");
                String status = status();
                DienThoaiXachTay dienThoaiXachTay = new DienThoaiXachTay(nameXT, priceXT, slXT, nSXXT, nation, status);
                DIEN_THOAI_XACH_TAYS.add(dienThoaiXachTay);
                ReadAndWrite.write("src\\luyen_tap_de\\data\\xachTay.csv", DIEN_THOAI_XACH_TAYS, false);
                System.out.println("Ghi file th??nh c??ng");
                break;
        }
    }

    @Override
    public void display() {
        System.out.println("\n====??i???n tho???i ch??nh h??ng====");
        for (DienThoaiChinhHang element : DIEN_THOAI_CHINH_HANGS) {
            System.out.println(element);
        }
        System.out.println("\n====??i???n tho???i x??ch tay====");
        for (DienThoaiXachTay element : DIEN_THOAI_XACH_TAYS) {
            System.out.println(element);
        }
    }

    @Override
    public void delete(String str) throws NotFoundProductException {
        ReadAndWrite.read("src\\luyen_tap_de\\data\\chinhHang.csv");
        ReadAndWrite.read("src\\luyen_tap_de\\data\\xachTay.csv");
        display();
        int cont = 0;
//        System.out.println("Nh???p id ??i???n tho???i b???n mu???n xo??");
//        String str=scanner.nextLine();
        int idDeleta = Integer.parseInt(str);
        for (int i = 0; i < DIEN_THOAI_CHINH_HANGS.size(); i++) {
            if (DIEN_THOAI_CHINH_HANGS.get(i).getId() == idDeleta) {
                System.out.println("B???n c?? mu???n xo?? ??i???n tho???i n??y(yes or no)");
                String choice = scanner.nextLine();
                if ("yes".equals(choice.toLowerCase())) {
                    DIEN_THOAI_CHINH_HANGS.remove(i);
                    System.out.println("xo?? th??nh c??ng");
                    display();
                    cont++;
                    break;
                }
            }
        }
        for (int i = 0; i < DIEN_THOAI_XACH_TAYS.size(); i++) {
            if (DIEN_THOAI_XACH_TAYS.get(i).getId() == idDeleta) {
                System.out.println("B???n c?? mu???n xo?? ??i???n tho???i n??y(yes or no)");
                String choice = scanner.nextLine();
                if ("yes".equals(choice.toLowerCase())) {
                    DIEN_THOAI_XACH_TAYS.remove(i);
                    System.out.println("xo?? th??nh c??ng");
                    display();
                    cont++;
                    break;
                }
            }
        }
        ReadAndWrite.write("src\\luyen_tap_de\\data\\chinhHang.csv", DIEN_THOAI_CHINH_HANGS, false);
        ReadAndWrite.write("src\\luyen_tap_de\\data\\xachTay.csv", DIEN_THOAI_XACH_TAYS, false);
        if (cont == 0) {
            throw new NotFoundProductException("Ko th??? t??m th???y id b???n mu???n xo??");
        }
    }

    @Override
    public void find() {
        System.out.println("Nh???p id ho???c t??n ??i???n tho???i b???n mu???n t??m ki???m");
        String str = scanner.nextLine();
//        int idFind = Integer.parseInt(str);
        for (DienThoaiChinhHang dienThoaiChinhHang : DIEN_THOAI_CHINH_HANGS) {
            if (Integer.toString(dienThoaiChinhHang.getId()).contains(str) || dienThoaiChinhHang.getName().contains(str)) {
                System.out.println(dienThoaiChinhHang);
            }
        }
        for (DienThoaiXachTay dienThoaiXachTay: DIEN_THOAI_XACH_TAYS){
            if(Integer.toString(dienThoaiXachTay.getId()).contains(str)|| dienThoaiXachTay.getName().contains(str)){
                System.out.println(dienThoaiXachTay);
            }
        }
    }
}
