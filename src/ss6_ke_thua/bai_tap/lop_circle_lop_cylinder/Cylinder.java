package ss6_ke_thua.bai_tap.lop_circle_lop_cylinder;

public class Cylinder extends Circle{
    private double chieuCao;


    public Cylinder(double banKinh, String mauSac, double chieuCao) {
        super(banKinh, mauSac);
        this.chieuCao=chieuCao;
    }

    public Cylinder() {
        super();
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }
    public  double getTheTich(){
        return Math.pow(banKinh,2)*Math.PI*chieuCao;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "chieuCao=" + chieuCao +
                ", banKinh=" + banKinh +
                ", mauSac='" + mauSac + '\'' +
                ", dienTich='"+getDienTich()+'\''+
                ", theTich='"+getTheTich()+'\''+
                '}';
    }
}
