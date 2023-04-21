//Write a method named isEven that accepts an int argument. The method should return true 
//if the argument iseven ,or false otherwise. Also write a program to test your method

import java.util.*;

public class p1 {
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = sc.nextInt();

    if(isEven(num)==true){
        System.out.println("The number is even number");
    }else{
        System.out.println("The number is odd number");
    }
  }
}
    

