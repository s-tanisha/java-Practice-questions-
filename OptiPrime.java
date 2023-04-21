// optimal method to check if a number is prime or not
import java.util.*;

public class OptiPrime {
    public static boolean CheckPrime(int n){
        
        if(n==2){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to check if prime");
        int num = sc.nextInt();
        if(num== 1){
            System.out.println("The number is neither prime nor consecutive number");
        }
        else{
            if(CheckPrime(num))
            {
                System.out.println("the number is a prime number");
                
            }
            else{
                System.out.println("the number is not a prime number");
            }
        }
    }
}
