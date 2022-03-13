package ss17_io_binary_file_serialization.bai_tap.utils;

import ss17_io_binary_file_serialization.bai_tap.models.SanPham;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriter{
    public static final String SANPHAMCSV="src\\ss17_io_binary_file_serialization\\bai_tap\\data\\SanPham.csv";
    public static List<SanPham> readFile(){
        List<SanPham> sanPhamList=new ArrayList<>();
        File file=new File(SANPHAMCSV);
        FileInputStream fileInputStream=null;
        ObjectInputStream objectInputStream=null;
        try{
            fileInputStream=new FileInputStream(file);
            objectInputStream=new ObjectInputStream(fileInputStream);
            sanPhamList=(List<SanPham>) objectInputStream.readObject();
        }catch (IOException| ClassNotFoundException e){
            e.printStackTrace();
        }finally {
            try {
                if(fileInputStream!=null){
                    fileInputStream.close();
                    objectInputStream.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return sanPhamList;
    }
    public static void writeFile(List<SanPham> sanPhamList){
        File file=new File(SANPHAMCSV);
        FileOutputStream fileOutputStream=null;
        ObjectOutputStream objectOutputStream=null;
        try {
            fileOutputStream=new FileOutputStream(file);
            objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(sanPhamList);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                if(fileOutputStream!=null){
                    fileOutputStream.close();
                    if (objectOutputStream != null) {
                        objectOutputStream.close();
                    }
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
