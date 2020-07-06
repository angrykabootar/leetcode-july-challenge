class Solution {
    public int hammingDistance(int x, int y) {
     var count = 0;
        if(x == y){
            return count;
        }
    while ((x > y ? x : y) > 0) {
      count += (x & 1) ^ (y&1);
      x = x >> 1;
      y = y >> 1;
    }
    return count;
    }
}