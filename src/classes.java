import java.util.Scanner;

class hack{
    int no1;
    int no2;
    void  add(int no1, int no2 )
    {
    }
}

public class classes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        hack hrid = new hack();

        System.out.println("EEnter no1 :");
        hrid.no1= sc.nextInt();
        System.out.println("Enter no2:");
        hrid.no2= sc.nextInt();

        hrid.add(hrid.no1, hrid.no2);

        int x= 10;
        int y= 10;
        int xyz;
        xyz = sum(x, y );
        System.out.println(xyz);


    }

    public static int   sum(int a, int b )
    {
        int xyz = (a+b)/2;
        return xyz;

    }
}
