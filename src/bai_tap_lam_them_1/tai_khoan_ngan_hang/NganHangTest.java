package bai_tap_lam_them_1.tai_khoan_ngan_hang;

public class NganHangTest {
    public static void main(String[] args) {
        TaiKhoan taiKhoan1 = new TaiKhoan(0001, "Trần Bình Giảng", 100);
        System.out.println(taiKhoan1);
        TaiKhoan taiKhoan2 = new TaiKhoan(0002, "Trần Bình Dảng", 50);
        System.out.println(taiKhoan2);
        taiKhoan1.rutTien();
        System.out.println(taiKhoan1);
        taiKhoan2.napTien();
        System.out.println(taiKhoan2);
        taiKhoan1.chuyenTien(taiKhoan2);
        System.out.println(taiKhoan1);
        System.out.println(taiKhoan2);
    }
}
