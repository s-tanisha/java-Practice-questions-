// Union of 2 arrays
import java.util.*;

public class UnionHM{
    public static void union(int arr1[], int arr2[]){
        HashSet<Integer> UnionE = new HashSet<>();
        for(int element: arr2){
            UnionE.add(element);
        }
        for(int element : arr1){
            if(!(UnionE.contains(element))){
                UnionE.add(element);
            }
        }
        Iterator it = UnionE.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
    // public static void Print(HashSet<Integer> MAP){
    //     for(int key: MAP.keySet()){
    //         System.out.println(key);
    //     }
    // }
    public static void main(String a[]){
        int arr1[]= {7,3,9};
        int arr2[]= {6, 3, 9, 4, 2, 9};

        union(arr1, arr2);

    }
}