// Friends pairing problem 
//Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the number of ways in which friends can remain single or can be paired up

public class friends {
    public static int friendspairing(int n){
        if(n==1 || n==2){
            return n;
        }
        return friendspairing(n-1) + (n-1) * friendspairing(n-2);
    }
    public static void main(String args[]){
        System.out.println(friendspairing(3));
    }
    
}
