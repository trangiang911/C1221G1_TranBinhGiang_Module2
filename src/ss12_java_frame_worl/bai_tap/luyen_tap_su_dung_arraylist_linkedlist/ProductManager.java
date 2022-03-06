package ss12_java_frame_worl.bai_tap.luyen_tap_su_dung_arraylist_linkedlist;
import ss12_java_frame_worl.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.sap_xep.GiamDan;
import ss12_java_frame_worl.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.sap_xep.TangDan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ProductManager {
    Scanner scanner=new Scanner(System.in);
    List<Product> productList=new ArrayList<>();
    public void themMoi(){
        System.out.println("Nhập id sản phẩm");
        String id=scanner.nextLine();
        System.out.println("Nhập tên sản phẩm");
        String name=scanner.nextLine();
        System.out.println("Nhập giá sản phẩm");
        Double money=Double.parseDouble(scanner.nextLine());
        productList.add(new Product(id,name,money));
    }
    public void display(){
        for (Product element:productList){
            System.out.println(element);
        }
    }
    public void edit(){
        display();
        System.out.println("Nhập id sản phẩm cần chỉnh sửa");
        String idEdit=scanner.nextLine();
        for (int i=0;i<productList.size();i++){
            if(idEdit.equals(productList.get(i).getiD())){
                System.out.println("Nhập tên mới cho sản phẩm");
                String nameEdit=scanner.nextLine();
                productList.get(i).setName(nameEdit);
                System.out.println("Nhập giá mới cho sản phẩm");
                double moneyEdit=Double.parseDouble(scanner.nextLine());
                productList.get(i).setMoney(moneyEdit);
                System.out.println("Chỉnh sửa thành công");
                break;
            }
        }
    }
    public void del(){
        display();
        System.out.println("Nhập id sản phẩm cần xoá");
        String idDel=scanner.nextLine();
        for (int i=0;i<productList.size();i++){
            if(idDel.equals(productList.get(i).getiD())){
                productList.remove(i);
                System.out.println("xoá thành công");
            }
        }
    }
    public void find(){
        display();
        System.out.println("Nhập tên muốn tìm");
        String nameFind=scanner.nextLine();
        int cont=0;
        for (int i=0;i<productList.size();i++){
            if(nameFind.equals(productList.get(i).getName())){
                System.out.println(productList.get(i));
                cont++;
            }
        }
        if(cont==0){
            System.out.println("Ko tìm thấy sản phẩm");
        }
    }
    public void sapXep(){
        TangDan tangDan=new TangDan();
        GiamDan giamDan=new GiamDan();
        System.out.println("Sắp xếp tăng dần theo giá");
        productList.sort(tangDan);
        System.out.println(productList);
        System.out.println("Sắp xếp giảm dần theo giá");
        productList.sort(giamDan);
        System.out.println(productList);
    }
}
