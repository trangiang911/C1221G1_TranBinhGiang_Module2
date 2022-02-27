package ss7_abstract_interface.bai_tap.reziseable;

public class Circle implements Resizeable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "Area="+ getArea()+
                '}';
    }

    @Override
    public void rezise(double percent) {
         this.radius +=((this.radius*percent)/100);
    }
}
