
class TwosumBrute {
public static void main(String[]args){
    int [] arr={2,6,5,8,11};
    int target=14;
int n=arr.length;
    for (int i =0;i<n;i++){
        int required =target-arr[i];
        for(int j=0;j<n;j++){
            if(arr[j]==required){
                System.out.println("Indices: " + i + ", " + j);
                return;
            }
        }
    }
}}


//class Solution {
 //   public int[] twoSum(int[] nums, int target) {

   //       int n = nums.length;

       //   for (int left = 0; left < n; left++) {
           //   for (int right = left + 1; right < n; right++) {

   //   int sum = nums[left] + nums[right];

 //                 if (sum == target) {
     //                 return new int[]{left, right};
     //         }
     // }
 //         }
 //     return new int[]{};
 // }
//}