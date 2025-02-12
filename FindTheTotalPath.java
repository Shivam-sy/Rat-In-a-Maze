//Write a program to check whether the rat can pass through the grid and find the total number of existing paths reach at (n-1,m-1) position.

class FindTheTotalPath {
    public static int rIAM(int[][] grid, int r, int c, int n, int m, int[][] path, int count) {
        path[r][c] = 1;

        if (r == n - 1 && c == m - 1) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(path[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            path[r][c] = 0; 
            return count + 1;
        }

        // Move Right
        if ((c + 1) < m && grid[r][c + 1] == 0) {
            count = rIAM(grid, r, c + 1, n, m, path, count);
        }
        // Move Down
        if ((r + 1) < n && grid[r + 1][c] == 0) {
            count = rIAM(grid, r + 1, c, n, m, path, count);
        }

        // Backtrack
        path[r][c] = 0;
        return count;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {0, 0, 0, 0, 0}, 
            {0, 1, 1, 0, 1}, 
            {0, 0, 1, 1, 1}, 
            {0, 0, 0, 0, 0}
        };
        int[][] path = new int[4][5];

        int totalWays = rIAM(grid, 0, 0, 4, 5, path, 0);
        System.out.println("Total number of ways: " + totalWays);
    }
}
