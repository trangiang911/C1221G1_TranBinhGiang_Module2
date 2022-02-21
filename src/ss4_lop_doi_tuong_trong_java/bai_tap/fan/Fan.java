package ss4_lop_doi_tuong_trong_java.bai_tap.fan;

public class Fan{
    public static final int SLOW=1;
    public static final int MEDIUM=2;
    public static final int FAST=3;
    private int speed=SLOW;
    private boolean on=false;
    private double radius=5;
    private String color="blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Fan(){}
    public String display() {
        if (isOn()) {
            return "Tốc độ quạt là " + getSpeed() + " màu sác quạt là " + getColor() + " bán kính quạt là " + getRadius() + "quạt đang bật";
        } else {
            return "Màu sắc quạt là "+getColor()+" bán kính quạt là "+getRadius()+" quạt đang tắt";
        }
    }
    }
