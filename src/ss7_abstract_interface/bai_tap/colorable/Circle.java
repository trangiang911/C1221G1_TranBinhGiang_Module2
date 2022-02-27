package ss7_abstract_interface.bai_tap.colorable;

public class Circle extends src_code.Circle {
    public Circle() {
    }

    public Circle(double radius) {
        super(radius);
    }

    public Circle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public String toString() {
        return "Circle{" + "Area: " + this.getArea() + "}";
    }
}
