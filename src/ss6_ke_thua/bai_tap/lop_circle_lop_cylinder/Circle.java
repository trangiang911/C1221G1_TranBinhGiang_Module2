package ss6_ke_thua.bai_tap.lop_circle_lop_cylinder;

public class Circle {
    protected double banKinh;
    protected String mauSac;

    public Circle(double banKinh, String mauSac) {
        this.banKinh = banKinh;
        this.mauSac = mauSac;
    }

    public Circle() {

    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
    public double getDienTich(){
        return Math.pow(banKinh,2)*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "banKinh=" + banKinh +
                ", mauSac='" + mauSac + '\'' +
                ", dienTich='"+getDienTich()+'\''+
                '}';
    }
}
