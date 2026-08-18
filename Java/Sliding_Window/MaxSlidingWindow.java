package Java.Sliding_Window;
import java.util.*;
public class MaxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length==0){
            return new int[0];
        }
     int n=nums.length;
        int[] result=new int[n-k+1];
        int w=k-1;
        for(int j=0;j<n-k+1;j++){
            int max=nums[j];
        for (int i=j;i<=j+w;i++){
            if(nums[i]>max){
            max=nums[i];
            }
        }
        
        result[j]=max;
    }
    return result;
    }  
     public static void main(String[] args) {

        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};

        int k = 3;

        MaxSlidingWindow obj = new MaxSlidingWindow();

        System.out.println(
                Arrays.toString(obj.maxSlidingWindow(nums, k)));
    }
}
