public class ratInMaze {

    public static boolean isSafe(int maze[][], int row, int col){
        return(row<maze.length && col<maze.length && col>=0 && row>=0 && maze[row][col]==1);
    }

    public static boolean findPathUtil(int maze[][], int row, int col, int sol[][]){
        if(row == maze.length-1 && col == maze.length-1 && maze[row][col] == 1){
            sol[row][col] = 1;
            return true;
        }
        if(isSafe(maze, row, col)){
            sol[row][col] = 1;

            // Down
            if(findPathUtil(maze, row+1, col, sol)){
                return true;
            }

            // Right
            if(findPathUtil(maze, row, col+1, sol)){
                return true;
            }

            sol[row][col] = 0;
            return false;
        }
        return false;
    }
    public static void ratPath(int maze[][], int row, int col){
        int solution[][] = new int[maze.length][maze.length];
        if(findPathUtil(maze,row,col,solution)){
            printMaze(solution);
        }else{
            System.out.println("No solution");
        }
    }

    public static void printMaze(int maze[][]){
        for(int i = 0; i<maze.length;i++){
            for(int j = 0; j<maze[0].length;j++){
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int maze[][] = { 
            { 1, 0, 0, 0 },
            { 1, 1, 0, 1 },
            { 0, 1, 0, 0 },
            { 1, 1, 1, 1 } 
        };
        ratPath(maze,0,0);
    }
}
