//print all primes in a range
import java.util.*;

public class RangePrime {

    public static boolean checkPrime(int n){
        if(n==1){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2; i<n; i++){
            if(n%i==0)
            {
            return false;
            }
        }
        return true;
  
    }

    public static void Printprime(int n, int m){
    System.out.print("The prime numbers are - ");
    for(int i=n ; i<m; i++) {
        if(checkPrime(i)==true){
            System.out.print(i+" ");
        }

    }
    }
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the range x to y");
     int x= sc.nextInt();
     int y= sc.nextInt();
     Printprime(x,y);

    }
}
