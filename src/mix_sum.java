import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;
import java.util.Arrays;

public class mix_sum {
    public static void main(String[] args) {
        //Execution time starts at this
        Instant start = Instant.now();

        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();

        String[] string = str
                .split(" ");

        // declaring an array with the size of string
        int[] arr = new int[string.length];

// parsing the String argument as a signed decimal
// integer object and storing that integer into the
// array
        for (int i = 0; i < string.length; i++) {
            arr[i] = Integer.parseInt(string[i]);
        }

        // printing string
        System.out.print("String : " + str);

        // printing the Integer array
        System.out.print("\nInteger array : "
                + Arrays.toString(arr));

//code of array element sorting
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println();

        //Displaying elements of array after sorting
        System.out.println("Elements of array sorted in ascending order: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }

        // Making sub arrays

        int [] p=Arrays.copyOfRange(arr,0,1);
        System.out.println("\n Sub array 1:");
        for (int i : p)
            System.out.print( i + "  ");
        System.out.println("\n");

        int [] q=Arrays.copyOfRange(arr,1,3);
        System.out.println("Sub array 2:");
        for (int i : q)
            System.out.print(i + "  ");
        System.out.println("\n");

        int [] r=Arrays.copyOfRange(arr,3,6);
        System.out.println("Sub array 3:");
        for (int i : r)
            System.out.print( i + "  ");





        int sum,sum1=0,sum2=0;

        //sum of 1st array
        sum=p[0];

        //sum of second array
        for (int j : q) {
            sum1 += j;
        }

        //sum of third array
        for (int j : r) {
            sum2 += j;
        }

        //final sum
        int finalsum;

        finalsum=sum+sum1+sum2;

        System.out.println("\nSum of All three sub arrays : "+finalsum);



        //execution time requried for code


        Instant end = Instant.now();
        Duration interval = Duration.between(start, end);

        System.out.println("Execution time in seconds: " + interval.getSeconds());
    }
}