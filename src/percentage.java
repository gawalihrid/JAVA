import java.lang.System;
import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        System.out.println("This program Calculates the percentage of student");

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Subject1_marks ");
        int a = sc.nextInt();
        System.out.println(a);
        System.out.println("Please Enter  Subject2_marks ");
        int b = sc.nextInt();
        System.out.println("Please Enter  Subject3_marks ");
        int c = sc.nextInt();
        System.out.println("Please Enter  Subject4_marks  :");
        int d = sc.nextInt();
        System.out.println("Please Enter  Subject5_marks :");
        int e = sc.nextInt();

        int total = a+b+c+d+e;  //logic

        int percentage = (total*100)/500; //logic

        System.out.print("Percentage of student is :"+percentage);

        GFG obj=new GFG();
        // input alphanumeric string
        String str = "12abc20yz68";
        obj.findSum(str);
        // Function call
        System.out.println("\n"+GFG.findSum(str));

    }
}


/*

import java.lang.System;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLin

class main{
    public static void main(String args[])
    {
        System.out.print("This programm Calculates the percentage of student");

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Subject1_marks ");
        int a = sc.nextInt();
        System.out.println(a);
        System.out.println("Please Enter  Subject2_marks ");
        int b = sc.nextInt();
        System.out.println("Please Enter  Subject3_marks ");
        int c = sc.nextInt();
        System.out.println("Please Enter  Subject4_marks  :");
        int d = sc.nextInt();
        System.out.println("Please Enter  Subject5_marks :");
        int e = sc.nextInt();

        int total = a+b+c+d+e;

        int average = total/5;

        int percentage = (average/500)*100;

        System.out.print("Percentage of student is :");
        System.out.print(percentage);
    }
}
 */





class GFG {


    static int findSum(String str)
    {

        String temp = "0";
        int sum = 0;


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);


            if (Character.isDigit(ch))
                temp += ch;


            else {

                sum += Integer.parseInt(temp);


                temp = "0";
            }
        }


        return sum + Integer.parseInt(temp);
    }



}