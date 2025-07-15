public class StringsBuilders {
    public static void main(String [] args){
        StringBuilder sb = new StringBuilder("");
        for(char ch= 'a'; ch <='z'; ch++){
            sb.append(ch+ " ");
        }
        System.out.println(sb);
        // StringBuilder is mutable, so we can modify it without creating a new object
    }
}
