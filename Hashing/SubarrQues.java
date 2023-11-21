/* 
 * Given an array arr[] of length N, find the length of the longest sub-array with a sum equal to 0.

Examples:

Input: arr[] = {15, -2, 2, -8, 1, 7, 10, 23}
Output: 5
*/
import java.util.*;

public class SubarrQues {

    // public static int MaxLengthArr(int [] arr){
    //     int maxlength, sum = 0;
    //     Hashset<Integer> seensum = new hashset<>();
    // }
    public static void main(String[] args){
        int arr[]= {15, 2,-2, -8, 7,1, 10, 23};
        System.out.println("The langest subarray with sum as 0 is "+MaxLengthArr(arr));
    }
    public static int MaxLengthArr(int[] arr) {
        int maxLength = 0;
        int sum = 0;
        HashSet<Integer> seenSums = new HashSet<>(); // Stores seen cumulative sums

        for (int num : arr) {
            sum += num;

            if (sum == 0) {
                maxLength = Math.max(maxLength, 1 );
            } 
            if (seenSums.contains(sum)) {
                maxLength = Math.max(maxLength, seenSums.size());
            } else {
                seenSums.add(sum);
            }
        }

        return maxLength;
    }
}
