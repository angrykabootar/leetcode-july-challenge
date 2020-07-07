class Solution {
    public int islandPerimeter(int[][] grid) {
       var result = 0;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        if (grid[i][j] == 0) continue;
        if (i - 1 < 0 || grid[i - 1][j] == 0) result++;

        if (i + 1 >= grid.length || grid[i + 1][j] == 0) result++;

        if (j - 1 < 0 || grid[i][j - 1] == 0) result++;

        if (j + 1 >= grid[i].length || grid[i][j + 1] == 0) result++;
      }
    }
    return result;
    }
}