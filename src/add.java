import java.Array;
import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class add {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String abc="EFGHE";
        String result="";

        for(int i=0;i<abc.length();i++){
            if(abc.charAt(i)=='E'){
                result += 'i';
            }
            else{
                result +=abc.charAt(i);
            }
        }
        System.out.println(result);
    }
}

