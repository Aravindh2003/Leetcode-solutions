class Solution {
    public int rangeBitwiseAnd(int left, int right) {
          while (right > left) {
            right = right & (right - 1);
        }
        return right & left;
        /*int cnt = 0;
        while (left != right) {
            left >>= 1;
            right >>= 1;
            cnt++;
        }
        return (left << cnt);*/
    }
}
