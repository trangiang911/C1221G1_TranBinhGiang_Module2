package bai_tap_lam_them_1.chuong_trinh_quan_ly_phuong_tien;

public class XeMay extends Xe {
    private double congSuat;


    public XeMay(String bienKiemSoat, String hangXe, int namSanXuat, String chuSoHuu, double congSuat) {
        super(bienKiemSoat, hangXe, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public XeMay(double congSuat) {
        this.congSuat = congSuat;
    }

    public XeMay() {
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay{" +super.toString()+
                "congSuat=" + congSuat +
                '}';
    }
}
