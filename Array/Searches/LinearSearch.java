import java.util.*;

public class LinearSearch {
    public static int linearSearch(int num[], int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }           
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[] = {3,6,6,7,8,9,4,46,7,8,4,9,4,3,7,9,0,3,2,2,4};
        int key = 100;

        int index= linearSearch(num, key);
        if(index==-1){
            System.out.println("Key is not present");
        }
        else{
            System.out.println("The key is at index: "+ index);
        }
    }
}


//Linear time complexity of linear search is O(n) which is the worst case time complexity
