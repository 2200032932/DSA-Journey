import java.util.*;
public class Kadanes_Algorithm_MaximumSubarraySumi {
    public int maxSubArray(int[] nums){
       int sum=0;
       int max=nums[0];
       for(int i : nums){
            sum+=i;
            max = Math.max(max,sum);
            if(sum<0){
                sum=0;
            }
       } 
       return max;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        Kadanes_Algorithm_MaximumSubarraySumi obj=new Kadanes_Algorithm_MaximumSubarraySumi();
        System.out.println("Maximum subarray sum is:"+obj.maxSubArray(arr));
    }
}
