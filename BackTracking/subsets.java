

public class subsets {
    public static void getSubsets(String str, String ans, int i){
        //Base Case
        if( i == str.length()){
            if(ans.length() == 0){
                System.out.println("Null");
            }else{
                System.out.println(ans);                
            }
            return;
            
        }

        //Recursion(Yes)
        getSubsets(str, ans+str.charAt(i), i+1);
        //Recursion(No)
        getSubsets(str, ans, i+1);
    }
    public static void main(String args[]){
        String Str = "abc";
        getSubsets(Str, "", 0);
    }
}
