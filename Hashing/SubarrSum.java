// Given an unsorted array of integers, find the number of subarrays having a sum exactly equal to a given number k

import java.util.*;

public class SubarrSum {
    public static int SubArrSumToK(int arr[], int k){

        int count =0;
        int sum =0;

        HashSet<Integer> prefixSums = new HashSet<>();
        prefixSums.add(0);

        for(int num: arr){
            sum += num;

            if(prefixSums.contains(sum - k)){
                count++;
            }

            prefixSums.add(sum);

        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 7;
        int result = SubArrSumToK(nums, k);
        System.out.println("Number of subarrays with sum " + k + ": " + result);
    }
}
