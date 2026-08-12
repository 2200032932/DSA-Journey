import java.util.*;

class TwoSumOptimal{
    public static void main(String[] args){
        int [] arr={2,6,5,8,11};
        int target=14;
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int required=target-arr[i];
            if(map.containsKey(required)){
                System.out.println("Indices: " + map.get(required) + ", " + i);
                return;
            }
            map.put(arr[i],i);
        }
    }
}