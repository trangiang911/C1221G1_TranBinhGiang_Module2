package ss7_abstract_interface.bai_tap.reziseable;

public class Square implements Resizeable {
    private double a;

    public Square() {
    }

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    public double getArea(){
        return a*a;
    }
    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                "area="+getArea()+
                '}';
    }

    @Override
    public void rezise(double precent) {
        this.a*=((this.a*precent)/100);
    }
}
