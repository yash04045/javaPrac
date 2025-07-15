public class RemoveDuplicateLetters {
    public static void removeDuplicate(String s, int indx, StringBuilder newStr, boolean[] map){
        //Base Condition
        if(indx == s.length()){
            System.out.println(newStr);
            return;
        }

        // kaam

        char currChar = s.charAt(indx);
        if(map[currChar-'a'] == true){
            //duplicate
            removeDuplicate(s, indx+1, newStr, map);
        }else{
            map[currChar - 'a'] = true;
            removeDuplicate(s, indx+1, newStr.append(currChar), map);
        }
        
    }
    public static void main(String [] args){
        String str = "yaaaaaaaaassssssssssshhhhhhhhsinggh";
        removeDuplicate(str, 0, new StringBuilder(""),new boolean[26]);
    }
}
