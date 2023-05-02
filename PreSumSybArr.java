// using prefix array we can reduce time complexity while finding Maximum sum of possible Subarrays

public class PreSumSybArr {
    public static void MaxSumSubArr(int arr[]){
        //prefix array
        int preArr[]= new int[arr.length];
        int add=0;
        for(int i=0; i<preArr.length;i++)
        {
            add= add + arr[i];
            preArr[i]= add; 
        }

        // for(int i=0; i<preArr.length; i++){
        //     System.out.println(preArr[i]);
        int MaxSum=0;
        for(int i=0; i< arr.length; i++){
            int curr=0;
            for(int j=i; j<arr.length; j++){
                
                curr = i==0 ? preArr[j] : preArr[j]-preArr[i-1];
            }
            if(MaxSum<curr){
                MaxSum=curr;
            }
        }
        System.out.println("Maximum sum of subarray is "+ MaxSum);
        }
    
    public static void main(String args[]){
        int arr[]={1, -2, 6, -1, 3};
        MaxSumSubArr(arr);
    }

}
