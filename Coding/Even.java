package Coding;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        
        Scanner S1= new Scanner(System.in);
        System.out.println("Enter Your Number");
        int num = S1.nextInt();

        if(num % 2==0){
            System.out.println(  num +" is even ");
        }
        else {
            System.out.println(  num +" is odd ");
        }
    }
}
