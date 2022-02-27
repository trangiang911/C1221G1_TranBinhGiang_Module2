package bai_tap_lam_them_1.xuat_nhap_thong_tin_xe;

public class Vehicle {
    private double giaTriXe;
    private int xylanh;

    public Vehicle(double giaTriXe, int xylanh) {
        this.giaTriXe = giaTriXe;
        this.xylanh = xylanh;
    }

    public Vehicle() {
    }

    public double getGiaTriXe() {
        return giaTriXe;
    }

    public void setGiaTriXe(int giaTriXe) {
        this.giaTriXe = giaTriXe;
    }

    public int getXylanh() {
        return xylanh;
    }

    public void setXylanh(int xylanh) {
        this.xylanh = xylanh;
    }
    public double thueTruocBa(){
        if (getXylanh()<100){
            return (giaTriXe*1)/100;
        }
        else if (100<getXylanh() && getXylanh()>200){
            return (giaTriXe*3)/100;
        }
        else {
            return (giaTriXe*5)/100;
        }
    }
    public String HienThiThueCuaTungXe(){
        return "Vehicle{" +
                "giaTriXe=" + giaTriXe +
                ", xylanh=" + xylanh +
                "}"+
                " Thuế="+thueTruocBa()
                ;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "giaTriXe=" + giaTriXe +
                ", xylanh=" + xylanh +
                '}';
    }
}
