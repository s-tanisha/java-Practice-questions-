// Write a Java program to check if a number is a palindrome in Java?
import java.util.*;

public class p2 {
    public static boolean palindrome(int num){
        int rev=0;
        int palindrome= num;
        while(num>0){
          int rem = num%10;
          rev = rev*10 + rem;
          num= num/10;
        }
        System.out.println(rev);
        if(rev==palindrome){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if(palindrome(num)==true){
            System.out.println("The number is a palindrome");
        }else{
            System.out.println("The number is not a palindrome");
        }
    }
}
