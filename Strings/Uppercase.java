public class Uppercase {
    public static String toUppercase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch= Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(" ");
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
               
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[]) {
        String str = "hello my name is yash and i am learning java along with data structures and algorithms";
        System.out.println(toUppercase(str));
    }
}
