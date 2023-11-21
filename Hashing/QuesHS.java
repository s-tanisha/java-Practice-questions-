// count unique elemnts from an array 

import java.util.*;

public class QuesHS {
    public static int CountUnique(int arr[]){

        HashSet<Integer> Hs = new HashSet<>();

        for(int i =0; i < arr.length;i++)
        {
            Hs.add(arr[i]);
        }
        return Hs.size();
    }
    public static void main(String args[]){
        int arr[] ={ 1, 2,3, 4 , 5, 6, 7, 8, 8 ,9 ,3 ,11, 4, 7};

        System.out.println("Unique element in array are "+ CountUnique(arr));
    }
}
