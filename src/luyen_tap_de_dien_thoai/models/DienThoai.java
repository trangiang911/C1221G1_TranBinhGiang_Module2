package luyen_tap_de_dien_thoai.models;

public abstract class DienThoai {
    private static int idtemp=1;
    private int id;
    private String name;
    private double price;
    private int amount;
    private String producer;

    public DienThoai(int id, String name, double price, int amount, String producer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.producer = producer;
    }

    public DienThoai(String name, double price, int amount, String producer) {
        this.id=idtemp++;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.producer = producer;
    }

    public DienThoai() {
    }

    public static int getIdtemp() {
        return idtemp;
    }

    public static void setIdtemp(int idtemp) {
        DienThoai.idtemp = idtemp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
    public String toCSV(){
        return id+","+name+","+price+","+amount+","+producer+",";
    }
    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", producer='" + producer + '\'';
    }

}
