import java.lang.System;
import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        System.out.println("This programm Calculates the percentage of student");

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


        int percentage = (total*100)/500;

        System.out.print("Percentage of student is :"+percentage);

    }
}


/*

import java.lang.System;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

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