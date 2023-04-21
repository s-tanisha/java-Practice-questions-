//Convert from Binary to decimal
import java.util.*;

public class  BinToDec {

    public static int ConvertBin(int n){
        int dec =0;
        int i=0;
           while(n>0){
            int last = n%10;
            n= n/10;
            int place=(int)Math.pow(2,i);
            int multi = place* last;
            dec = multi + dec;
            i++;
            }
        
        return dec;
    }
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Binary code atmost 10 places");
        int Bcode = sc.nextInt();
        System.out.println(ConvertBin(Bcode));
        
    }
}
