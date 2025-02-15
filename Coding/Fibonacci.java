package Coding;
import java.util.Scanner;

public class Fibonacci{
    public static void main(String[]args){
        Scanner s1= new Scanner(System.in);

        System.out.print("Enter Your Number:-");
        int number = s1.nextInt(); 
        int first =0,second=1,next;
      System.out.println("Fibonacci series is ");
      for (int i=0;i<=number;i++){
        System.out.print(first+ " ");
        next=first+second;
        first=second;
        second=next;
      }
        
    }
}