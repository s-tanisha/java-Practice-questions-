/*Given two unsorted arrays that represent two sets 
(elements in every array are distinct), find the union
 and intersection of two arrays.

Example: 

arr1[] = {7, 1, 5, 2, 3, 6} 
arr2[] = {3, 8, 6, 20, 7}  */
import java.util.*;

public class UnionInterHS {
    public static void IntersectionOFarr(int arr[], int ARR[]){
        HashSet<Integer> Hs = new HashSet<>();
         
       
        int size =0;
         for(int i =0 ; i<arr.length;i++){
            Hs.add(arr[i]);
        }
        System.out.print("{ ");
        for(int i =0 ; i<ARR.length;i++){
           if(Hs.contains(ARR[i])){
            System.out.print( ARR[i]+", ");
           }
        }
        System.out.println(" }");

    }
    public static void UnionOFarr(int arr[], int ARR[]){
        HashSet<Integer> HS = new HashSet<>();

        for(int i =0 ; i<arr.length;i++){
            HS.add(arr[i]);
        }
        for(int i =0 ; i<ARR.length;i++){
            HS.add(ARR[i]);
        }
        System.out.println(HS);
    } 
    public static void main(String args[]){
       int arr1[] = {7, 1, 5, 2, 3, 6} ;
       int arr2[] = {3, 8, 20, 7 ,6};

       System.out.println("The union of two array is : ");
       UnionOFarr(arr1,arr2);
       System.out.println("The Intersection of two array is : ");
       IntersectionOFarr(arr1,arr2);
    }
}
