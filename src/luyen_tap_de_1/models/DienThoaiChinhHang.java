package luyen_tap_de_1.models;

public class DienThoaiChinhHang extends DienThoai {
    private String insurance;
    private String warrantyCoverage;

    public DienThoaiChinhHang(int id, String name, double price, int amount, String producer, String insurance, String warrantyCoverage) {
        super(id, name, price, amount, producer);
        this.insurance = insurance;
        this.warrantyCoverage = warrantyCoverage;
    }

    public DienThoaiChinhHang(String insurance, String warrantyCoverage) {
        this.insurance = insurance;
        this.warrantyCoverage = warrantyCoverage;
    }

    public DienThoaiChinhHang(String name, double price, int amount, String producer, String insurance, String warrantyCoverage) {
        super(name, price, amount, producer);
        this.insurance = insurance;
        this.warrantyCoverage = warrantyCoverage;
    }

    public DienThoaiChinhHang() {
        super();
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public String getWarrantyCoverage() {
        return warrantyCoverage;
    }

    public void setWarrantyCoverage(String warrantyCoverage) {
        this.warrantyCoverage = warrantyCoverage;
    }

    @Override
    public String toCSV() {
        return super.toCSV()+insurance+","+warrantyCoverage;
    }

    @Override
    public String toString() {
        return "DienThoaiChinhHang{" + super.toString()+
                "insurance='" + insurance + '\'' +
                ", warrantyCoverage='" + warrantyCoverage + '\'' +
                '}';
    }
}
