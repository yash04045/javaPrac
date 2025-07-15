import java.util.*;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for(int i = 0; i<cleaned.length()/2;i++){
            if( cleaned.charAt(i) != cleaned.charAt(cleaned.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args){
        String s = "race a ca";
        if(isPalindrome(s)==true){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
