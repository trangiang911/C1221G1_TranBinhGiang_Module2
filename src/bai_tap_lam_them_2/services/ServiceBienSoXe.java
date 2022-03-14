package bai_tap_lam_them_2.services;

import bai_tap_lam_them_2.models.Oto;
import bai_tap_lam_them_2.models.XeMay;
import bai_tap_lam_them_2.models.XeTai;

import java.util.List;

public class ServiceBienSoXe {
    public static boolean kiemTra(String str, List<XeTai> xeTaiList, List<XeMay> xeMayList, List<Oto> otoList) {
        for (int i = 0; i <xeTaiList.size() ; i++) {
            if(xeTaiList.get(i).getBienKiemSoat().equals(str)){
                return false;
            }
        }
        for (int i = 0; i <otoList.size() ; i++) {
            if(otoList.get(i).getBienKiemSoat().equals(str)){
                return false;
            }
        }
        for (int i = 0; i <xeMayList.size() ; i++) {
            if(xeMayList.get(i).getBienKiemSoat().equals(str)){
                return false;
            }
        }
        return true;
    }
}
