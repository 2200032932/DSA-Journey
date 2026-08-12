import java.util.*;
public class MaxSubArray {
    int maxSubArray(int[] nums){
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>maxi){
                maxi=sum;
            }
        }
        return maxi;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        MaxSubArray obj=new MaxSubArray();
        System.out.println("Maximum subarray sum is:"+obj.maxSubArray(arr));
    }
}
