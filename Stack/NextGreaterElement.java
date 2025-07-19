import java.util.Stack;

public class NextGreaterElement {
    public static int[] getNextGreater(int[] arr){
        Stack<Integer> s = new Stack<>();
        int n = arr.length;
        int[] nextGreater = new int[n];

        for(int i = n-1; i >= 0 ; i--){
            while(!s.isEmpty() && s.peek() <= arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nextGreater[i] = -1;                
            }else{
                nextGreater[i] = s.peek();
            }
            s.push(arr[i]);
        }
        return nextGreater;
    }
    public static void main(String [] args){
        int[] arr = {4, 2, 8, 3, 9, 1};
        int next[] = getNextGreater(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(next[i] + " ");
        }

    }
}
