//Convert Decimal to Binary
import java.util.*;

public class DecToBin {

    public static void convertToBin(int n){
        int bin=0;
        int i=0;
        while(n>0){
            int rem = n%2;
            n = n/2;
            int place= (int)Math.pow(10,i);
            bin = bin + place*rem;
            i++;
        }
        System.out.println("The binary code is "+ bin);
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Decimal number");
        int dec= sc.nextInt();
        convertToBin(dec);
    }
}
