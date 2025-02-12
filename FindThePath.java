// Write a program to check whether the rat can pass through the grid and print its path to reach at (n-1,m-1) position.

class FindThePath {
    public static boolean rIAM(int[][] grid, int r, int c, int n, int m, int[][] path) {
        path[r][c] = 1;

        if (r == n - 1 && c == m - 1) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(path[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return true;
        }

        if ((c + 1) < m && grid[r][c + 1] == 0) {
            if (rIAM(grid, r, c + 1, n, m, path)) 
            return true;
        }
        if ((r + 1) < n && grid[r + 1][c] == 0) {
            if (rIAM(grid, r + 1, c, n, m, path)) 
            return true;
        }

        path[r][c] = 0; // Backtracking
        return false;
    }

    public static void main(String[] args) {
        int[][] grid = {{0, 0, 0, 0, 0}, {0, 1, 1, 0, 1}, {0, 0, 1, 1, 1}, {0, 0, 0, 0, 0}};
        int[][] path = new int[4][5];

        System.out.println(rIAM(grid, 0, 0, 4, 5, path));
    }
}
