import java.util.LinkedList;

public class javaCollectionFramework {
    public static void main(String[] args){
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addFirst(0);
        System.out.println(ll);

        //remove
        ll.removeLast();
        ll.removeFirst();
        ll.remove();
        System.out.println(ll);

    }
}
