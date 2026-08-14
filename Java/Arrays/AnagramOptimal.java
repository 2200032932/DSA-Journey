
import java.util.*;
public class AnagramOptimal {
    public static boolean isAnagram(String str1,String str2){
        return str1.length()==str2.length()
                &&Arrays.equals(str1.chars().sorted().toArray(),str2.chars().sorted().toArray());
    }
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the strings with space:");
    String str1=sc.next();
    String str2=sc.next();
    System.out.println("Are the two strings anagrams? "+isAnagram(str1,str2)); 
    sc.close();
}
}
