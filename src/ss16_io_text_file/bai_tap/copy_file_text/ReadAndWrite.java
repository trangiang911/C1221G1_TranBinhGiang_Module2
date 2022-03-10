package ss16_io_text_file.bai_tap.copy_file_text;

import java.io.*;

public class ReadAndWrite {
    static String str="";
    static int cont = 0;
    public static String readFile(String filePath) {

        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                str+=line;
            }
            String[] arr=str.split("");
            for (int i=0;i<arr.length;i++){
                cont++;
            }
            if(str==""){
                throw new Exception("File này là file rỗng hoặc là đã tồn tại");
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    public static void write(String filePath,String str1,int numbers) {
        try {
            FileWriter fileWriter=new FileWriter(filePath,true );
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write(str1+" "+"số ký tự là "+numbers+" ");
            bufferedWriter.write("sau khi coppy ");
            bufferedWriter.newLine();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ReadAndWrite.readFile("src\\ss16_io_text_file\\bai_tap\\copy_file_text\\source.txt");
        ReadAndWrite.write("src\\ss16_io_text_file\\bai_tap\\copy_file_text\\target.txt",str,cont);
    }
}
