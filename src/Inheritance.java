

class Teacher{
    public Teacher(){
        System.out.println("Hello from constructor");
    }

    public  void main(){
        int a=12;
        int b= 12;
        System.out.println(a+b);
    }

}
class Student extends Teacher
{


}

class student2 extends Student{
public  void main(int c){
    int a=12;
    int b= 12;
    System.out.println(a-b);


}

}
public class Inheritance {
    public static void main(String[] args) {

        student2 obj = new student2();
        obj.main();

    }

}
