import java.util.*;
public class TwoSumOptimal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
            int n=sc.nextInt();
            int [] arr =new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int target = sc.nextInt();
            HashMap<Integer,Integer> map=new HashMap<>();
            for (int i=0;i<n;i++){
                int complement =target-arr[i];
                if(map.containsKey(complement)){
                    System.out.println(map.get(complement)+" "+i);
                    return;
                }
                map.put(arr[i], i);
            }
            System.out.println("No two sum solution");
       sc.close(); 
    }
    }