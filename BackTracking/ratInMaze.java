public class ratInMaze {

    // Check if the position (row, col) is safe
    public static boolean isSafe(int maze[][], int row, int col, int sol[][]) {
        return (row < maze.length && col < maze[0].length && row >= 0 && col >= 0 
                && maze[row][col] == 1 && sol[row][col] == 0);
    }

    // Utility function to find a path
    public static boolean findPathUtil(int maze[][], int row, int col, int sol[][]) {
        int n = maze.length;

        // Base case: If destination (n-1, n-1) is reached
        if (row == n - 1 && col == n - 1 && maze[row][col] == 1) {
            sol[row][col] = 1;
            return true;
        }

        // Check if current position is safe
        if (isSafe(maze, row, col, sol)) {
            // Mark the current cell as part of the path
            sol[row][col] = 1;

            // Try all four directions: Down, Right, Up, Left
            // Move Down
            if (findPathUtil(maze, row + 1, col, sol)) {
                return true;
            }
            // Move Right
            if (findPathUtil(maze, row, col + 1, sol)) {
                return true;
            }
            // Move Up
            if (findPathUtil(maze, row - 1, col, sol)) {
                return true;
            }
            // Move Left
            if (findPathUtil(maze, row, col - 1, sol)) {
                return true;
            }

            // If no direction leads to a solution, backtrack
            sol[row][col] = 0;
            return false;
        }
        return false;
    }

    // Main function to solve the maze
    public static void ratPath(int maze[][], int row, int col) {
        int n = maze.length;
        int[][] solution = new int[n][n];

        // Check if starting point is valid
        if (maze[0][0] == 0 || !findPathUtil(maze, row, col, solution)) {
            System.out.println("No solution");
        } else {
            printMaze(solution);
        }
    }

    // Print the solution matrix
    public static void printMaze(int maze[][]) {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String args[]) {
        int maze[][] = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
        ratPath(maze, 0, 0);
    }
}