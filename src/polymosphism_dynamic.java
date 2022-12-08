//Dynamic Polymorphism example
class sample {
    void add(int a,int b){
        System.out.println("from add 1:"+ (a+b));
    }
    void add(int a,int b,int c){
        System.out.println("from add 2:"+ (a+b+c));
    }
}
class cacl{
    void calculate(double x){
        System.out.println("Square value = "+(x*x));
    }
}
class caclu extends cacl{
    void calculate(double x){
        System.out.println("Square root= "+ Math.sqrt(x));
    }
}


public class polymosphism_dynamic {
    public static void main(String[] args) {
       // sample s = new sample();
        //s.add(10,20);
        //s.add(10,20,30);
        caclu c = new caclu();
        c.calculate(25);
    }
}
