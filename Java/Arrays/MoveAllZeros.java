import java.util.*;
public class MoveAllZeros {
    public static void moveZeros(int arr[]){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
        }
        while(count<n){
            arr[count++]=0;
        }
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
        moveZeros(arr);
        System.out.println("Array after moving all zeros to the end:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
