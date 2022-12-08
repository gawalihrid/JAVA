class one1{
    static void calculate(double x){
        System.out.println("SquRE VALUE="+(x*x));
    }
}
class two2 extends one1{
     static void calculate(double x){
        System.out.println("Square root= "+ Math.sqrt(x));
    }
}
public class polymorphism_static {
    public static void main(String[] args) {
        //Super class referance to sub class object(Dynamic method dispatch)
        one1 O = new two2();
        O.calculate(25);

    }
}
