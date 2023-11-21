//Find the majority element in the array. A majority element in an array A[] of size n is an element that appears more than
// n/3 times (and hence there is at most one such element). 

import java.util.*;

public class MajorityElement {
    public static void MajorityFreq (int []arr){
    HashMap<Integer, Integer> Elements = new HashMap<>();

    for(int element : arr){
        if(Elements.containsKey(element)){
            Elements.put(element, Elements.get(element) +1 );
        }
        else{
            Elements.put(element, 1);
        }
    }
    int n= arr.length/3;
    for(int key : Elements.keySet()){
        if(Elements.get(key)> n){
            System.out.println(key);
        }
    }
    }
    public static void main(String a[]){
        int num[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        int nums[]= {1,2};
        MajorityFreq(num);
        MajorityFreq(nums);
        
    }
}
