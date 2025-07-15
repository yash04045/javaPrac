import java.util.*;

public class ShortestPath {
    public static float getShortestPath(String path){
        int x=0,y=0;

        for(int i=0; i<path.length();i++){
            if(path.charAt(i)== 'n'){
                y++;
            } else if( path.charAt(i) == 's'){
                y--;
            } else if(path.charAt(i) == 'w'){
                x--;
            } else if(path.charAt(i) == 'e'){
                x++;
            } else{
                return -1;
            }           
        }
        int X2= x * x;
        int Y2 = y * y;
        return (float)Math.sqrt(X2 + Y2);
    }
    public static void main(String [] args){
        String path = "nsewneesewnnnnseeeeed";
        float distance = getShortestPath(path);
        if(distance != -1){
            System.out.println("Shortest Path: " + distance);
        } else {
            System.out.println("Invalid path");
        }
    }
}
