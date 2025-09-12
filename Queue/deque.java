import java.util.*;

public class deque {
    public static void main(String args[]){
        Deque<Integer> d = new LinkedList<>();
        d.addFirst(1);
        d.addFirst(2);
        d.addLast(9);
        d.addLast(4);
        System.out.println(d);
        d.removeFirst();
        System.out.println(d);    
        
        System.out.println(d.getFirst());
        System.out.println(d.getLast()f);
    }

}
