package ss7_abstract_interface.bai_tap.reziseable;

public class Retangle implements Resizeable {
    private double d;
    private double r;

    public Retangle(double d, double r) {
        this.d = d;
        this.r = r;
    }

    public Retangle() {
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getArea(){
        return d*r;
    }

    @Override
    public String toString() {
        return "Retangle{" +
                "d=" + d +
                ", r=" + r +
                ", area="+getArea()+
                '}';
    }

    @Override
    public void rezise(double precent) {
        this.d+=((this.d*precent)/100);
        this.r+=((this.r*precent)/100);
    }
}
