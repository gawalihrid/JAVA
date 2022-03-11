import javax.security.auth.kerberos.KerberosTicket;

public class Varargs {
    public static void main(String[] args) {
        int Myint = 9;

        System.out.println(Myint);
        System.out.println((float) Myint);
        str();
        String tyu ="Hridhanshu";
        int xyz  = 2;
        mymethod(tyu);
        String ert = new String("Harry");
        mymethod(tyu, xyz);


        mymethod();

        
    }


    public static void str(){
        String abc  =  "hridhanshu";
        String  xyz= " gawali";
        System.out.println(abc + "" + xyz);
    }
    public static void mymethod(String rty){
        System.out.println(rty);

    }

    public static void mymethod(String ert, int abc){

        System.out.println("My name is "+ert +" My age is "+abc);
    }

    public static void mymethod(){
        int j =67;
        System.out.println(j);

    }
}




