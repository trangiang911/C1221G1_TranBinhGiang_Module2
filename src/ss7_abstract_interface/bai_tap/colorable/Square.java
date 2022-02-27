package ss7_abstract_interface.bai_tap.colorable;

public class Square extends Rectangle implements Colorable {
    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    @Override
    public String toString() {
        return "Square{" + "Area: " + this.getArea() + "}";
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
