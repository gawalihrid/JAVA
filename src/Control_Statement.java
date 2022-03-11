import java.lang.*;
import java.util.Scanner;


public class Control_Statement {
    public static void main(String [] arg) {
        //If- else
        //Problem 1
       /*  Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Length:");
        int ln = sc.nextInt();
        System.out.println("please Enter breadth:");
        int br = sc.nextInt();

        boolean ret=  false;
        ret = square(ln,br);
        if (ret == true){
            System.out.println("It is square");
            System.out.println("And its area of Square is " + ln*br);
        }
        else{
            System.out.println("I is not a square");
        }

    }
    public static boolean square(int l , int b){
        Scanner sc = new Scanner(System.in);

        boolean r = false;
        if(l==b){
            r = true;
            return r;
        }
        else {
            r = false;
            return r;
        }

        */

        // Problem 2
        /*Scanner sc = new Scanner(System.in);

        System.out.println("Ether value 1 :");
        Long val1 = sc.nextLong();
        System.out.println("Ether value 2 :");
        Long val2 = sc.nextLong();

        if(val1 >val2){
            System.out.println("Greast Value is "+val1);
        }
        else{
            System.out.println("greast value is:" + val2);
        }
        */

        // Problem 3
       /* Scanner sc = new Scanner(System.in);

        System.out.println("Enter Quantity");
        int qt= sc.nextInt();
        int cost =0;
        cost = qt*100;

        if(cost>=1000){
            int dis =(cost*10)/100;
            int fidis =cost - dis;
            System.out.println("Cost is:"+cost +"rs" );
            System.out.println("Discount is 10%:"+dis +"rs");
            System.out.println("Final Cost for purched after Discount is :"+ fidis);
        }
        else {
            System.out.println("Final Cost for purched is:"+cost);
        }*/

        //Problem 4
       /*      Scanner sc =new Scanner(System.in);

        System.out.println("Enter marks:");
        int marks = sc.nextInt();

        if(marks<25){
            System.out.println("Your Gread is F" );
        }
        if(marks>25 && marks<45){
            System.out.println("Your Gread is E" );
        }
        if(marks>45 && marks<50){
            System.out.println("Your Gread is D" );
        }
        if(marks>50 && marks<60){
            System.out.println("Your Gread is C" );
        }
        if(marks>60 && marks<80){
            System.out.println("Your Gread is B" );
        }
        if(marks>80){
            System.out.println("Your Gread is A" );
        }
*/

        //Problem 5
       /*
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age of person 1");
        int p1= sc.nextInt();

        System.out.println("Enter age of person 2");
        int p2= sc.nextInt();

        System.out.println("Enter age of person 3");
        int p3= sc.nextInt();

        if(p1<p2 && p1<p3){
            System.out.println("youngst is person 1");
        }
        else if(p2<p3){
            System.out.println("Youngst id person 2");
        }
        else{
            System.out.println("youngst is person 3");
        }
        */

        //problem 6 best
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total number of classes held:");
        int tot = sc.nextInt();

        System.out.println("Enter Number of class attended:");
        int att = sc.nextInt();
        if(att>tot){
            System.out.println("attended cannot be more than held");

        }
        else {


            int allow = ((tot*75)/100);

            int act = ((att*100)/tot);


            if (act >= allow && act<=100){
                System.out.println("You are allowed in exam, you have "+act+"% Attendance");
            }
            else {
                System.out.println("You are not allowed in exam, You have "+act+"% Attendance");
            }
        }
*/

        //problem 7
        /*int x =2;
        int y= 5;
        int z= 0;

        System.out.println(x==2);
        System.out.println(x!=5);
        System.out.println(x!=5 && y>=5);
        System.out.println(z!=0 || x==2);
        System.out.println(!(y<10));

         */

        //Loop
        //Problem 1

        /*int row = 4;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        */
        /*
        Scanner sc = new Scanner(System.in);

        int [] tab= {29,50,24};

        for(int i =0;i<= tab.length;i++) {
            for (int j =0; j<=10;j++) {
                System.out.println(tab[i] * j );

            }

            }
        */

         /*
        int [] arr ={12,13,14};
        arr[2]= 15;
        int num = 15;

        boolean isinarr= false;

        for (int element : arr){
            if (element == num){
                isinarr = true;
                break;
            }
        }
        if(isinarr)
        {
            System.out.println("number is present ");
        }
        else {
            System.out.println("is not");
        }*/

        }


}















