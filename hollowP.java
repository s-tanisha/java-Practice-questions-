//hollow rectangle pattern

public class hollowP {
    public static void main(String args[]){
        int n= 4;
        for(int line=1; line<=n; line++ )
        {
            for(int star=1; star<=n; star++){
              if(line==1 || line == n || star==1 || star==n){
                System.out.print("*");
              }
              else{
                System.out.print(" ");
              }
              
        }
        System.out.println();
    }
        }
}
