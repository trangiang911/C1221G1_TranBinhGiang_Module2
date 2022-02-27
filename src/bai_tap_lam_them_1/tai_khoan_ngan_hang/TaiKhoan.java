package bai_tap_lam_them_1.tai_khoan_ngan_hang;
import java.util.Scanner;
public class TaiKhoan implements NapVaRutTien{
    private final double LAISUAT=0.035;
    private long soTK;
    private String tenTK;
    private double soTienTK=50;
    Scanner scanner=new Scanner(System.in);
    public TaiKhoan(long soTK, String tenTK, double soTienTK) {
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.soTienTK = soTienTK;
    }

    public TaiKhoan() {
    }

    public long getSoTK() {
        return soTK;
    }

    public void setSoTK(long soTK) {
        this.soTK = soTK;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public double getSoTienTK() {
        return soTienTK;
    }

    public void setSoTienTK(double soTienTK) {
        this.soTienTK = soTienTK;
    }
    public double daoHan(){
        return soTienTK+(soTienTK*LAISUAT);
    }
    public void chuyenTien(TaiKhoan taiKhoan){
        double tien;
        System.out.println("Nhập số tiền cần chuyển");
        tien=Double.parseDouble(scanner.nextLine());
        setSoTienTK(getSoTienTK()-tien);
        taiKhoan.setSoTienTK(taiKhoan.getSoTienTK()+tien);;
    }
    @Override
    public void napTien() {
        double tien;
        do {
            System.out.println("Nhập số tiền nạp vào ");
            tien = Double.parseDouble(scanner.nextLine());
        }while (tien<=0);
     setSoTienTK(getSoTienTK()+tien);
    }

    @Override
    public void rutTien() {
        double tien;
        do {
            System.out.println("Nhập số tiền cần rút");
            tien=Double.parseDouble(scanner.nextLine());
            }while (tien>getSoTienTK() || tien<=0);
        setSoTienTK(getSoTienTK()-(tien+PHI));
    }

    @Override
    public String toString() {
        return "TaiKhoan{" +
                ", soTK=" + soTK +
                ", tenTK='" + tenTK + '\'' +
                ", soTienTK=" + soTienTK +" Ngàn"+
                '}';
    }
}
