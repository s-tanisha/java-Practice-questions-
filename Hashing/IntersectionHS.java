import java.util.*;

public class IntersectionHS {
    public static void IntersectionSET(int arr1[], int arr2[]){
        HashSet<Integer> InterE = new HashSet<>();
        int cnt=0;
        for(int element: arr2){
            InterE.add(element);
        }
        for(int element : arr1){
            if(InterE.contains(element)){
                System.out.print(element+" ");
                cnt++;
            }
        }
        System.out.println(" ");
        System.out.println("The count is "+cnt);

        
    }
    public static void main(String[]a){
        int arr1[]={ 7, 3, 9};
        int arr2[]= {6, 3, 9, 2, 9, 4};

        IntersectionSET(arr1, arr2);
    }
}
