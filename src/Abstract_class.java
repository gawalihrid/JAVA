
abstract class Car{
    int regno;
    Car(int r)
    {
        regno=r;
    }
    void opentank()
    {
        System.out.println("fill the tank");
    }
    abstract void steering(int direction,int angle);
    abstract void breaking(int force);

}
class Maruti extends Car{
    Maruti(int regno)
    {
        super (regno);
    }
    void steering(int direction,int angle)
    {
        System.out.println("Take a turn");
        System.out.println("This is ordinary steering");
    }
    void breaking (int force)
    {
        System.out.println("Breaks Applied ");
        System.out.println("These are hydraulic breaks");
    }
}
class Sentro extends Car{
    Sentro(int regno)
    {
        super (regno);
    }
    void steering(int direction,int angle)
    {
        System.out.println("Take a turn");
        System.out.println("This is power steering");
    }
    void breaking (int force)
    {
        System.out.println("Breaks Applied ");
        System.out.println("These are gas breaks");
    }
}
public class Abstract_class {
    public static void main(String[] args) {
        Maruti m = new Maruti(1001);
        Sentro s = new Sentro (5005);
        Car ref;
        ref =s ;
        ref.opentank();
        ref.steering(1,90);
        ref.breaking(500);
    }
}
/*
abstract class myclass{
     abstract void calculate(double x);
}
class sub1 extends myclass{
    @Override
    void calculate(double x)
    {
        System.out.println("Square= "+(x*x));
    }
}

class sub2 extends myclass{
    void calculate(double x){
        System.out.println("Square root= "+Math.sqrt(x));
    }
}
class sub3 extends myclass{

    @Override
    void calculate(double x) {
        System.out.println("Cube= "+(x*x*x));
    }
}
*/