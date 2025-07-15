import java.util.ArrayList;

public class Operation {
     public static void main(String args[]){
        ArrayList<String> list= new ArrayList<>();
        //add function-----> Time Complexity O(1).
        list.add("Yash");
        list.add("Raj");
        list.add("Krish");
        list.add("XYZ");
        list.add("Manjot");
        list.add("Adir");

        list.add(1, "Amit");
        // System.out.println(list);

        // //Get Operation -----> Time Complexity O(1)
        // System.out.println(list.get(3));

        // //Remove Element----> Time Complexity O(n).
        // list.remove(3);
        // System.out.println(list);

        // //Set Element at Index ----> O(n).
        // list.set(3, "Harjot");
        // System.out.println(list);

        // //Contains ----> O(n).
        // System.out.println(list.contains("Aditya"));
        // System.out.println(list.contains("Yash"));

        System.out.println(list.size());
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();
    }
}
