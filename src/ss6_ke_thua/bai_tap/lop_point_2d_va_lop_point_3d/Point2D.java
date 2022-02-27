package ss6_ke_thua.bai_tap.lop_point_2d_va_lop_point_3d;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Point2D {
    private float x=0.0f;
    private float y=0.0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        return new float[]{x,y};
    }

    @Override
    public String toString() {
        return "Point2D{ " +
                Arrays.toString(getXY())+
                '}';
    }
}
