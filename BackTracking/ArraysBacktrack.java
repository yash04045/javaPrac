

public class ArraysBacktrack {
    public static void changeArr(int arr[], int i, int val){
        //Base case
        if(i == arr.length){
            printArr(arr);
            return;
        }

        //Kaam
        arr[i] = val;
        changeArr(arr, i+1, val+1);
        arr[i] = arr[i] - 2;  //BackTrack
    }
    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}
