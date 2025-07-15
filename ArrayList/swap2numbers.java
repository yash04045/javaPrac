

import java.util.ArrayList;

public class swap2numbers {
    // public static void swap(ArrayList<Integer> list; int indx1,int indx2){
    //     int temp = list.get(idx1);
    //     list.set(idx1, list.get(idx2));
    //     list.set(idx2, temp);
    // }
    public static void main(String args[]){
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(8);
        list.add(7);
        list.add(9);
        list.add(10);
        list.add(6);
        list.add(12);
        System.out.println("Original List: " + list);

        int temp = list.get(1);
        list.set(1, list.get(3));
        list.set(3, temp);

        System.out.print("Changed List: "+ list);

    }
}
