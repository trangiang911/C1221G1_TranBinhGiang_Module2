package luyen_tap_de_4.models;

public class TaiKhoanThanhToan extends TaiKhoanNganHang {
    private String numberCard;
    private Double moneyCard;

    public TaiKhoanThanhToan(int id, String code, String name, String date, String numberCard, Double moneyCard) {
        super(id, code, name, date);
        this.numberCard = numberCard;
        this.moneyCard = moneyCard;
    }

    public TaiKhoanThanhToan(String code, String name, String date, String numberCard, Double moneyCard) {
        super(code, name, date);
        this.numberCard = numberCard;
        this.moneyCard = moneyCard;
    }

    public TaiKhoanThanhToan(String numberCard, Double moneyCard) {
        this.numberCard = numberCard;
        this.moneyCard = moneyCard;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public Double getMoneyCard() {
        return moneyCard;
    }

    public void setMoneyCard(Double moneyCard) {
        this.moneyCard = moneyCard;
    }

    @Override
    public String toString() {
        return "TaiKhoanThanhToan{" + super.toString()+
                "numberCard='" + numberCard + '\'' +
                ", moneyCard=" + moneyCard +
                '}';
    }

    @Override
    public String toCSV() {
        return super.toCSV()+","+numberCard+","+moneyCard;
    }
}
