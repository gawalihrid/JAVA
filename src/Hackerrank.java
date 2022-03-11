import java.util.*;
import java.lang.*;
import java.util.Calendar;
import java.io.*;
import java.math.*;


/*
class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */
/*

    public static String findDay(int month, int day, int year) {
        String[]day_of_week={"SUNDAY" ,"MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};

        Calendar cal =Calendar.getInstance();
        cal.set(year,month-1, day);
        int p=cal.get(Calendar.DAY_OF_WEEK);
        return day_of_week[p-1];

    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

 */


public class Hackerrank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i =n; i>=1;i--)
        {
            for (int j = 1;j<=i; j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }



        /*
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int power = 1;
        int temp = n;
        while (temp >= 10) {
            temp /= 10;
            power *= 10;
        }

        temp = n;
        while (power != 0) {
            int digit = temp / power;
            System.out.println(digit);

            temp = temp % power;
            power = power / 10;
        }


         */
 /*
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int digit = 0;

        while(n!=0)
        {
            n=n/10;
            digit++;
        }
        System.out.println(digit);

*/
        // hacker rank

         /*static

    {
        Scanner sc = new Scanner(System.in);

            int B= sc.nextInt();
            int H= sc.nextInt();

            if (B>0 && H>0)
            {
                System.out.println(B*H);
            }
            else{
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
    }*/
        // Calendar class use program
    /*
    public static String findDay(int month,int day ,int year)
    {
        String[]day_of_week={"SUNDAY" ,"MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};

        Calendar cal =Calendar.getInstance();
        cal.set(year,month-1, day);
        int p=cal.get(Calendar.DAY_OF_WEEK);
        return day_of_week[p-1];
    }

     */

        /*  Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        sc.close();
        String s = Integer.toString(n);

        if(n == Integer.parseInt(s))
        {
            System.out.println("Good Job");
        }
        else{
            System.out.println("Wrong answer.");
        }

       */
        /*Scanner sc = new Scanner(System.in);

        int t= sc.nextInt();

        for(int i=0; i<t; i++)
        {
            int a= sc.nextInt();
            int b= sc.nextInt();
            int n= sc.nextInt();

            for (int j= 0;j<n;j++)
            {
                a = a+b;
                System.out.println(a+ " ");
                b = b*2;
            }
            System.out.println(" ");
        }
        sc.close();

         */
        /*  Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i =0;i<=t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+"can be fitted in:");
                if(x>= -128 && x<= 128) System.out.println("* byte");
                if(x>= -32768 && x<= 32768) System.out.println("* short");
                if(x>= -2147483648 && x<= 2147483647) System.out.println("* int ");
                if(x>= -9223372036854775808L && x<= 9223372036854775807L) System.out.println("* long");
            }
            catch(Exception e )
            {
                System.out.println(sc.next()+"can't be fitted anywhere");
            }
        }

       */
        /*
        Scanner sc = new Scanner(System.in);
        Scanner ty = new Scanner(System.in);

        int n = sc.nextInt();
        double dob = sc.nextDouble();
        String str = ty.nextLine();

        System.out.println(str);
        System.out.println(dob);
        System.out.println(n);

*/
        /*Scanner sc = new Scanner (System.in);
        System.out.println("================================");
        for(int i =0; i <3;i++)
        {
            String str = sc.nextLine();
            int no = sc.nextInt();

            System.out.printf("%-15s%03d\n",str,no);
        }

        System.out.println("================================");
*/
        /* Scanner sc =new Scanner(System.in);

        int N=sc.nextInt();
        if(N>=2 && N<=20){
            for (int i =1;i<=10;i++){
                int ret = N*i;
                System.out.println(ret);
            }
        }
        else {
            System.out.println("Error");
        }

        */


    }
}

