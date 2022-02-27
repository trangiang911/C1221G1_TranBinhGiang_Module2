package ss4_lop_doi_tuong_trong_java.bai_tap.pt_bac_hai;

public class PTBacHai {
    private double a, b, c;

    public PTBacHai() {
    }

    ;

    public PTBacHai(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDelta(){
        return Math.pow(this.b,2)-4*this.a*this.c;
    }
    public double getRoot1(){
        return ((-this.b)+Math.sqrt(getDelta()))/(2*this.a);
    }
    public double getRoot2(){
        return ((-this.b)-Math.sqrt(getDelta()))/(2*this.a);
    }
    public String display(){
        return "PTbac2{"+"a="+a+",b="+b+",c="+c+"}";
    }
}
