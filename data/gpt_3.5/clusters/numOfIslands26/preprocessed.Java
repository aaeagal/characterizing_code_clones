public class Interleave {
    public int numIslands1(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        
        int numRows = grid.length;
        int numCols = grid[0].length;
        int numIslands = 0;
        
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (grid[i][j] == '1') {
                    numIslands++;
                    dfs1(grid, i, j);
                }
            }
        }
        
        return numIslands;
    }
    
    private void dfs1(char[][] grid, int row, int col) {
        int numRows = grid.length;
        int numCols = grid[0].length;
        
        if (row < 0 || col < 0 || row >= numRows || col >= numCols || grid[row][col] == '0') {
            return;
        }
        
        grid[row][col] = '0';
        dfs1(grid, row + 1, col);
        dfs1(grid, row - 1, col);
        dfs1(grid, row, col + 1);
        dfs1(grid, row, col - 1);
    }

    public int numIslands2(char[][] grid) {
        int numOfIslands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    numOfIslands++;
                    dfs2(grid, i, j);
                }
            }
        }
        return numOfIslands;
    }
    
    private void dfs2(char[][] grid, int row, int col) {
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[row].length || grid[row][col] == '0') {
            return;
        }
        
        grid[row][col] = '0';
        dfs2(grid, row-1, col);
        dfs2(grid, row+1, col);
        dfs2(grid, row, col-1);
        dfs2(grid, row, col+1);
    }

    public int numIslands3(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dfs3(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    
    private void dfs3(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1') {
            return;
        }
        grid[i][j] = '0';
        dfs3(grid, i + 1, j);
        dfs3(grid, i - 1, j);
        dfs3(grid, i, j + 1);
        dfs3(grid, i, j - 1);
    }

    public int numIslands4(char[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;
        int count = 0;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (grid[i][j] == '1') {
                    dfs4(grid, i, j);
                    count++;
                }
            }
        }
        
        return count;
    }
    
    public void dfs4(char[][] grid, int row, int column) {
        int rows = grid.length;
        int columns = grid[0].length;
        
        if (row < 0 || column < 0 || row >= rows || column >= columns || grid[row][column] != '1') {
            return;
        }
        
        grid[row][column] = '0';
        
        dfs4(grid, row + 1, column);
        dfs4(grid, row - 1, column);
        dfs4(grid, row, column + 1);
        dfs4(grid, row, column - 1);
    }

    public int numIslands5(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs5(grid, i, j);
                }
            }
        }
        return count;
    }
    
    public void dfs5(char[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        dfs5(grid, i-1, j);
        dfs5(grid, i+1, j);
        dfs5(grid, i, j-1);
        dfs5(grid, i, j+1);
    }

    int numIslands6(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs6(grid, i, j);
                }
            }
        }
        
        return count;
    }
    
    void dfs6(char[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;
        
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] != '1') {
            return;
        }
        
        grid[i][j] = '0';
        
        dfs6(grid, i + 1, j);
        dfs6(grid, i - 1, j);
        dfs6(grid, i, j + 1);
        dfs6(grid, i, j - 1);
    }

    public int numIslands7(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs7(grid, i, j);
                }
            }
        }
        
        return count;
    }
    
    private void dfs7(char[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;
        
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == '0') {
            return;
        }
        
        grid[i][j] = '0';
        
        dfs7(grid, i-1, j);
        dfs7(grid, i+1, j);
        dfs7(grid, i, j-1);
        dfs7(grid, i, j+1);
    }

    public int numIslands8(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs8(grid, i, j);
                }
            }
        }
        
        return count;
    }
    
    private void dfs8(char[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;
        
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] != '1') {
            return;
        }
        
        grid[i][j] = '0';
        
        dfs8(grid, i + 1, j);
        dfs8(grid, i - 1, j);
        dfs8(grid, i, j + 1);
        dfs(8grid, i, j - 1);
    }

    public int numIslands9(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    exploreIsland9(grid, i, j);
                }
            }
        }
        return count;
    }
    
    private void exploreIsland9(char[][] grid, int row, int col) {
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[row].length || grid[row][col] != '1') {
            return;
        }
        
        grid[row][col] = '0';
        exploreIsland9(grid, row+1, col);
        exploreIsland9(grid, row-1, col);
        exploreIsland9(grid, row, col+1);
        exploreIsland9(9grid, row, col-1);
    }

    public int numIslands10(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        int count = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    dfs10(grid, i, j);
                    count++;
                }
            }
        }
        
        return count;
    }
    
    private void dfs10(char[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;
        
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] != '1') {
            return;
        }
        
        grid[i][j] = '0';
        
        dfs10(grid, i - 1, j);
        dfs10(grid, i + 1, j);
        dfs10(grid, i, j - 1);
        dfs10(grid, i, j + 1);
    }

    public int numIslands11(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs11(grid, i, j);
                }
            }
        }
        return count;
    }
    
    private void dfs11(char[][] grid, int row, int col) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[row].length || grid[row][col] == '0') {
            return;
        }
        
        grid[row][col] = '0';
        
        dfs11(grid, row - 1, col);
        dfs11(grid, row + 1, col);
        dfs11(grid, row, col - 1);
        dfs11(grid, row, col + 1);
    }

    public int numIslands12(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs12(grid, i, j);
                }
            }
        }
        
        return count;
    }
    
    private void dfs12(char[][] grid, int row, int col) {
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == '0') {
            return;
        }
        
        grid[row][col] = '0';
        
        dfs12(grid, row - 1, col);
        dfs12(grid, row + 1, col);
        dfs12(grid, row, col - 1);
        dfs12(grid, row, col + 1);
    }

    public int numIslands13(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs13(grid, i, j);
                }
            }
        }
        
        return count;
    }
    
    private void dfs13(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] != '1') {
            return;
        }
        
        grid[i][j] = '0';
        
        dfs13(grid, i+1, j);
        dfs13(grid, i-1, j);
        dfs13(grid, i, j+1);
        dfs13(grid, i, j-1);
    }

    public int numIslands14(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs14(grid, i, j);
                }
            }
        }
        
        return count;
    }
    
    private void dfs14(char[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;
        
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] != '1') {
            return;
        }
        
        grid[i][j] = '0';
        
        dfs14(grid, i - 1, j);
        dfs14(grid, i + 1, j);
        dfs14(grid, i, j - 1);
        dfs14(grid, i, j + 1);
    }

    public int numIslands15(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    dfs15(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    
    private void dfs15(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
            return;
        }
        
        grid[i][j] = '0';
        
        dfs15(grid, i+1, j);
        dfs15(grid, i-1, j);
        dfs15(grid, i, j+1);
        dfs15(grid, i, j-1);
    }

    public int numIslands16(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs16(grid, i, j);
                }
            }
        }
        return count;
    }
    
    private void dfs16(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] != '1') {
            return;
        }
        grid[i][j] = '0';
        dfs16(grid, i - 1, j);
        dfs16(grid, i + 1, j);
        dfs16(grid, i, j - 1);
        dfs16(grid, i, j + 1);
    }

    public int numIslands17(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs17(grid, i, j);
                }
            }
        }
        return count;
    }
    
    public void dfs17(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] != '1') {
            return;
        }
        
        grid[i][j] = '0';
        
        dfs17(grid, i + 1, j);
        dfs17(grid, i - 1, j);
        dfs17(grid, i, j + 1);
        dfs17(grid, i, j - 1);
    }

    public int numIslands18(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs18(grid, i, j);
                }
            }
        }
        return count;
    }
    
    private void dfs18(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        dfs18(grid, i + 1, j);
        dfs18(grid, i - 1, j);
        dfs18(grid, i, j + 1);
        dfs18(grid, i, j - 1);
    }

    public int numIslands19(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs19(grid, i, j);
                }
            }
        }
        
        return count;
    }
    
    private void dfs19(char[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;
        
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == '0') {
            return;
        }
        
        grid[i][j] = '0';
        
        dfs19(grid, i - 1, j);
        dfs19(grid, i + 1, j);
        dfs19(grid, i, j - 1);
        dfs19(grid, i, j + 1);
    }

    public int numIslands20(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int numIslands = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    numIslands++;
                    dfs20(grid, i, j);
                }
            }
        }
        
        return numIslands;
    }
    
    private void dfs20(char[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;
        
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == '0') {
            return;
        }
        
        grid[i][j] = '0';
        
        dfs20(grid, i-1, j);
        dfs20(grid, i+1, j);
        dfs20(grid, i, j-1);
        dfs20(grid, i, j+1);
    }
}

