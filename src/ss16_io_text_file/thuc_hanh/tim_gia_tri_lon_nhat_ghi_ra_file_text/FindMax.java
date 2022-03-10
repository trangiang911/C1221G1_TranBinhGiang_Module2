package ss16_io_text_file.thuc_hanh.tim_gia_tri_lon_nhat_ghi_ra_file_text;

import java.util.ArrayList;
import java.util.List;

public class FindMax {
    public static int findMax(List<Integer> numbers){
        int max=numbers.get(0);
        for (int i=0;i<numbers.size();i++){
            if(max<numbers.get(i)){
                max=numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile=new ReadAndWriteFile();
        List<Integer> numbes = readAndWriteFile.readFile("src\\ss16_io_text_file\\thuc_hanh\\tim_gia_tri_lon_nhat_ghi_ra_file_text\\numbers.txt");
        int maxValue=findMax(numbes);
        readAndWriteFile.writeFile("src\\ss16_io_text_file\\thuc_hanh\\tim_gia_tri_lon_nhat_ghi_ra_file_text\\return.txt",maxValue);
    }
}
