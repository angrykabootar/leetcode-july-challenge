class Solution {
  public int arrangeCoins(int n) {
    var count = 0;
    while (n >= 0) {
      n = n - count - 1;
      if (n >= 0) {
        count++;
      }

    }

    return count;
  }
}