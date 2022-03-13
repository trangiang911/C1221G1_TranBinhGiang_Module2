package ss17_io_binary_file_serialization.bai_tap.services;

import ss16_io_text_file.bai_tap.copy_file_text.ReadAndWrite;
import ss17_io_binary_file_serialization.bai_tap.models.SanPham;
import ss17_io_binary_file_serialization.bai_tap.utils.ReadAndWriter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {
    Scanner scanner=new Scanner(System.in);
    private List<SanPham> list=new ArrayList<>();
    public void display(){
        System.out.println(ReadAndWriter.readFile());
    }
    public void add(){
        System.out.println("Nhập id sản phẩm");
        String id=scanner.nextLine();
        System.out.println("Nhập tên sản phẩm");
        String name=scanner.nextLine();
        System.out.println("Nhập tên nhà sản xuất");
        String nameHang=scanner.nextLine();
        System.out.println("Nhập giá sản phẩm");
        double money=Double.parseDouble(scanner.nextLine());
        list.add(new SanPham(id,name,nameHang,money));
        ReadAndWriter.writeFile(list);
    }
    public void find(){
        display();
        int cont=0;
        System.out.println("Nhập id sản phẩm cần tìm kiếm");
        String idFind=scanner.nextLine();
        for (int i=0;i<list.size();i++){
            if(list.get(i).getId().contains(idFind)){
                System.out.println(list.get(i));
                cont++;
            }
        }
        if (cont==0){
            System.out.println("Ko tìm thấy sản phẩm");
        }
    }
}
