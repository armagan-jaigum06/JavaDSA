public class Assignment {
    public static void printSolution(int sol[][]){
        for(int i=0; i<sol.length; i++){
            for(int j=0; j<sol.length; j++){
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int maze[][], int x, int y){
        // if (x , y) outside maze return false
        return (x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] == 1);
    }

    public static boolean solveMazeUtil(int maze[][], int x, int y, int sol[][]) {
        // If (x, y) is the destination and it's a valid path
        if (x == maze.length - 1 && y == maze.length - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }
    
        // Check if maze[x][y] is valid
        if (isSafe(maze, x, y)) {
            // If already visited in current path, return false (to avoid loops)
            if (sol[x][y] == 1)
                return false;
    
            // Mark current cell as part of the solution path
            sol[x][y] = 1;
    
            // Move Down
            if (solveMazeUtil(maze, x + 1, y, sol))
                return true;
    
            // Move Right
            if (solveMazeUtil(maze, x, y + 1, sol))
                return true;
    
            // Backtrack – unmark cell
            sol[x][y] = 0;
            return false;
        }
    
        return false;
    }
    public static boolean solveMaze(int maze[][]) {
        int N = maze.length;
        int sol[][] = new int[N][N];
    
        if (solveMazeUtil(maze, 0, 0, sol) == false) {
            System.out.print("Solution doesn't exist");
            return false;
        }
    
        printSolution(sol);
        return true;
    }
        
    public static void main(String[] args) {
        int maze[][] = {
        {1, 0, 0, 0},
        {1, 1, 0, 1},
        {0, 1, 0, 0},
        {1, 1, 1, 1}
    };
    solveMaze(maze);
    }
}
