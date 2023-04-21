//Write a Java method to compute the sum of the digits in an integer
import java.util.*;

public class p3 {
    public static void SumInt(int n){int sum=0;
        while(n>0){
            int rem= n%10;
            sum = sum+ rem;
            n= n/10;

        }
        System.out.println("The sum is "+ sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        SumInt(num);
    }
}
