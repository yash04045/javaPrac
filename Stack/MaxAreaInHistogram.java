import java.util.Stack;

public class MaxAreaInHistogram {
    public static void maxArea(int[] arr){
        int[] nsl = new int[arr.length];
        int[] nsr = new int[arr.length];
        int maxArea = 0;        
        //Next smaller right
        Stack<Integer> s = new Stack<>();
        for(int i = arr.length-1; i >= 0 ; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        //Next smaller left
        s = new Stack<>();
        for(int i = 0; i < arr.length ; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        //Current Ara: j - i - 1 = nsr[i] - nsl[j] - 1 
        for(int i = 0; i<arr.length;i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1 ;
            int currArea = height * width;
            maxArea = Math.max(currArea,maxArea);
        }
        System.out.print("Max area of the Histogrma is: " + maxArea);
    }
    public static void main(String args[]){
        int [] arr = {2,1,5,6,2,3};
        maxArea(arr);
    }
}
