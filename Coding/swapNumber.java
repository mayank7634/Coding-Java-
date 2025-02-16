package Coding;

import java.util.Scanner;

public class swapNumber {

    public static void main(String[] args) {
        Scanner S1= new Scanner (System.in);
        System.out.print("Enter Your First Number");
        
        int a=5;
        System.out.print("Enter Your Second Number");
        int b=10;
        System.out.println("Before Swaping a="+ a + ",b="+b);
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After Swaping a="+ a + ",b="+b);


    }
}