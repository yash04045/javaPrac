import java.util.ArrayList;

public class Reverse {
    public static void main(String[] args){
        ArrayList<String> list= new ArrayList<>();
        
        list.add("Yash");
        list.add("Raj");
        list.add("Krish");
        list.add("XYZ");
        list.add("Manjot");
        list.add("Adir");
        
        System.out.println("Reversed Arraylist: ");
        //Reverse 
        for(int i = list.size()-1; i>=0; i--){
            System.out.print(list.get(i) + " ");
        }      

    }
}
