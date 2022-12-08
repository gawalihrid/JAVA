import java.util.Scanner;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class if_else {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int N = sc.nextInt();
        if(N>0){
            System.out.println("It is a positive number");
        }
        else if(N<0){
            System.out.println("It is Negative number");
        }

         else {
             System.out.println("Number is zero");
         }


       /*
        System.out.println("How many subjects");
        int n = sc.nextInt();

        int [] marks = new int[n];

        for (int i= 0;i<n;i++){
            System.out.println("Enter marks:");
            marks[n]= sc.nextInt();

        }

        int total =0;
        for(int i=0;i<n;i++)
            total+=marks[i];

        System.out.println("total marks= "+total);

        float percent = (float) total/n;
        System.out.println("percentage ="+percent);


        System.out.println("Thank you");
*/


      /*
        final Scanner scanner = new Scanner(System.in);

                int N = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                scanner.close();

*/
    }
}