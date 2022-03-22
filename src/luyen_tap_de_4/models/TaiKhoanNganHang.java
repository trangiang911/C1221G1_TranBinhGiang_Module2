package luyen_tap_de_4.models;

public abstract class TaiKhoanNganHang {
    private static int idTemp;
    private int id;
    private String code;
    private String name;
    private String date;

    public TaiKhoanNganHang(int id, String code, String name, String date) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.date = date;
    }

    public TaiKhoanNganHang(String code, String name, String date) {
        this.id = idTemp++;
        this.code = code;
        this.name = name;
        this.date = date;
    }

    public TaiKhoanNganHang() {
    }

    public static int getIdTemp() {
        return idTemp;
    }

    public static void setIdTemp(int idTemp) {
        TaiKhoanNganHang.idTemp = idTemp;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                        ", code='" + code + '\'' +
                        ", name='" + name + '\'' +
                        ", date='" + date + '\'' ;
    }

    public String toCSV() {
        return id + ","+code+"," + name + "," + date + ",";
    }
}
