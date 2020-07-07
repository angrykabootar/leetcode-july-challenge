/*
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 ≤ x, y < 231.

Example:

Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different.
*/
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