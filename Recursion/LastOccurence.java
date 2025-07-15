public class LastOccurence {
    public static int LOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound= LOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;
    }
    public static void main(String args[]){
        int arr[] = {2,3,5,7,8,9,7,3,5,7,5};
        int key = 7;
        int i = 0;
        System.out.println(LOccurence(arr,key,i));
    }
}
