package Coding;
import java.util.Scanner;

public class PrimeNumber {


    public static void main(String []args){
        Scanner S2 = new Scanner(System.in);
        System.out.println("Enter Your Number:");
        int num = S2.nextInt();

        if (isPrime(num)){
            System.out.println(num +"is a prime Number ");
        }else{
            System.out.println(num +"is not prime Number ");
        }
        
    }
    public static boolean isPrime(int number){
        for (int i=2;i<=number/2;i++){
            if (number%i==0){
                return false;
            }
        }
        return true;
        
    }
    
    
}
