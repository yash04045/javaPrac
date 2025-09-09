import java.util.*;

public class ReverseStack {
    public static String reverseStack(String s){
        Stack<Character> ch =  new Stack<>();
        int indx = 0;
        while(indx < s.length()){
            ch.push(s.charAt(indx));
            indx++;
        }

        StringBuilder sb = new StringBuilder();
        while(!ch.isEmpty()){
            char curr = ch.pop();
            sb.append(curr);
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str = "Hello World";
        System.out.println(reverseStack(str));
    }
}
