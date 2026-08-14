import java.util.*;
public class AnagramBRUTE {
    public static boolean isAnagram(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1=sc.nextLine();
        System.out.println("Enter the second string:");
        String str2=sc.nextLine();
        sc.close();
        System.out.println("Are the two strings anagrams? "+isAnagram(str1,str2));
    }
}
