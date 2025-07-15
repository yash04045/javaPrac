public class FirstOccurence {
    public static int Occurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return Occurence(arr, key, i+1);
    }
    public static void main(String args[]){
        int arr[] = {2,3,5,7,8,9,7,3,5,7,5};
        int key = 7;
        int i = 0;
        System.out.println(Occurence(arr,key,i));
    }
}
