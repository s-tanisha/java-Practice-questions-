// kadane's algorithm to find maximum sum of possible subarrays

public class kadaneMaxSum {
    public static void kadaneMaxSub (int arr[]){
        //if all the elements in the array is negative
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0){
                count++;
            }
            
           max=Math.max(arr[i], max);
        }
        int length= arr.length-1;
        System.out.println(count );
        System.out.println(length );
        if(count==arr.length){
            System.out.println("All the elements in the array are negative");
            System.out.println("The max sum of subarray is "+ max);
        }else
        {
           int ms= Integer.MIN_VALUE;
           int cs=0;
           for(int i =0; i<arr.length;i++){
              cs=cs+arr[i];
              if(cs<0){
                cs=0;
               }
              ms=Math.max(cs, ms);
            }
           System.out.println("The max number of the arr is "+ ms);
        }
    }
    public static void main(String args[]){
        int arr[]= {-2, -3, -4, -1, -2, -1, -5, -3};
        kadaneMaxSub(arr);

    }
    
}
