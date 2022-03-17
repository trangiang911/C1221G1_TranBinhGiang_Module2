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

    public static boolean checkRegexTenDichVu(String str) {
        if (Pattern.matches("^[A-Z]{1}[a-z_[\\s]]+$", str)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkRegexDienTichVaBeBoi(String str) {
        if (Pattern.matches("^[0-9]{2}$", str)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkChiPhiThue(String str) {
        if (Pattern.matches("^[0-9]+$", str)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkSLNguoi(String str) {
        if (Pattern.matches("^[0-9]{1,2}$", str)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkSoTang(String str) {
        if (Pattern.matches("^[0-9]+$", str)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkTen(String string) {
        if (Pattern.matches("^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$", string)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkSDT(String string) {
        if (Pattern.matches("^0[0-9]{9,10}$", string)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkMail(String string) {
        if (Pattern.matches("^[a-z_0-9_[^\\w]]{4,}@[a-z]{4,}\\.[a-z]{2,}", string)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkNgaySinh(String birth) {
        if (Pattern.matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$", birth)) {
            return true;
        } else {
            return false;
        }
    }
}
