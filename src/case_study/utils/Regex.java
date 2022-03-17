package case_study.utils;

import java.util.regex.Pattern;

public class Regex {
    public static boolean checkRegexVilla(String str) {
        if (Pattern.matches("^SVVL-[0-9]{4}$", str)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkRegexHouse(String str) {
        if (Pattern.matches("^SVHO-[0-9]{4}$", str)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkRegexRoom(String str) {
        if (Pattern.matches("^SVRO-[0-9]{4}$", str)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean checkRegexTenDichVu(String str){
        if(Pattern.matches("^[A-Z]{1}[a-z]+$",str)){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean checkRegexDienTichVaBeBoi(int area){
        if(area>30){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean checkChiPhiThue(double money){
        if(money>0){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean checkSLNguoi(int slNguoi){
        if(slNguoi>0 && slNguoi<20){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean checkSoTang(int soTang){
        if(soTang>0){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean checkNgaySinh(String birth){
        if(Pattern.matches("^[0-9]{2}/[0-9]{2}/[0-9]{4}",birth)){
            return true;
        }
        else {
            return false;
        }
    }
}
