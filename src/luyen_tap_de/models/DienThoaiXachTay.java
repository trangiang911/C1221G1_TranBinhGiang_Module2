package luyen_tap_de.models;

public class DienThoaiXachTay extends DienThoai {
    private String portableCountry;
    private String status;

    public DienThoaiXachTay(int id, String name, double price, int amount, String producer, String portableCountry, String status) {
        super(id, name, price, amount, producer);
        this.portableCountry = portableCountry;
        this.status = status;
    }

    public DienThoaiXachTay(String portableCountry, String status) {
        this.portableCountry = portableCountry;
        this.status = status;
    }

    public DienThoaiXachTay(String name, double price, int amount, String producer, String portableCountry, String status) {
        super(name, price, amount, producer);
        this.portableCountry = portableCountry;
        this.status = status;
    }

    public DienThoaiXachTay() {
        super();
    }

    public String getPortableCountry() {
        return portableCountry;
    }

    public void setPortableCountry(String portableCountry) {
        this.portableCountry = portableCountry;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "DienThoaiXachTay{" + super.toString()+
                "portableCountry='" + portableCountry + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    @Override
    public String toCSV() {
        return super.toCSV()+portableCountry+","+status;
    }
}
