package ss7_abstract_interface.bai_tap.reziseable;

public class TestResize {
    public static void main(String[] args) {
        double random=(Math.random()*(100-1+1)+1);
        System.out.println(random);
        Object[] arr=new Object[]{new Circle(4),new Retangle(5,6),new Square(9)};
        for (Object x:arr){
            if(x instanceof Circle){
                System.out.println("Befor");
                System.out.println(x);
                ((Circle) x).rezise(random);
                System.out.println("After");
                System.out.println(x);
            }
            else if(x instanceof Retangle){
                System.out.println("Befor");
                System.out.println(x);
                ((Retangle) x).rezise(random);
                System.out.println("After");
                System.out.println(x);
            }
            else if(x instanceof Square){
                System.out.println("Befor");
                System.out.println(x);
                ((Square) x).rezise(random);
                System.out.println("After");
                System.out.println(x);
            }
        }
    }
}
