public class RatMaze {




    public static void main(String[] args) {
        int[][] maze = {
                {1,0,0,0,0},
                {1,1,0,1,0},
                {0,1,1,1,0},
                {0,0,0,1,0},
                {1,1,1,1,1}};
        printMaze(maze);
        Movement(maze,0,0);
        System.out.println(RatReachedDestination(maze,0,0));
    }
    public static boolean RatReachedDestination(int[][] maze, int x, int y){
        if (x > maze.length-1 || y > maze[0].length-1){
            return false;
        }
        if(x == maze.length-1 && y == maze[0].length-1){
            return true;
        }
        if (maze[x][y] == 0){
            return false;
        }
        return  RatReachedDestination(maze,x+1,y) || RatReachedDestination(maze,x,y+1);
    }
    public static void Movement(int[][] maze, int x, int y) {
        if (!isValidMove(maze, x, y)) {
            System.out.println("Didn't reach");
            return;
        }

        System.out.println("Mouse at: (" + x + ", " + y + ")");

        // Check if the rat has reached the destination
        if (x == maze.length - 1 && y == maze[0].length - 1) {
            System.out.println("Destination reached");
            return;
        }

        // Mark current position as visited to avoid cycles
        maze[x][y] = -1;

        // Try moving right
        if (isValidMove(maze, x, y + 1)) {
            Movement(maze, x, y + 1);
            return;
        }

        // Try moving down
        if (isValidMove(maze, x + 1, y)) {
            Movement(maze, x + 1, y);
            return;
        }

        System.out.println("Didn't reach");
    }

    public static boolean isValidMove(int[][] maze, int x, int y) {
        return x >= 0 && y >= 0 && x < maze.length && y < maze[0].length && maze[x][y] == 1;
    }

    public static void printMaze(int[][] maze){
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }
}
