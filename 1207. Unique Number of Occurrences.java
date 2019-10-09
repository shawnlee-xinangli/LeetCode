class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] count = new int[2001];
        for (int i: arr) {
            count[i+1000]++;
        }
        int[] map = new int[1000];
        for (int c: count) {
            if (c == 0) {
                continue;
            }
            if (map[c] == 1) {
                return false;
            }
            map[c]++;
        }
        return true;
    }
}

/*
  遍历数组，统计Occurrences,注意index需要加1000（因为-1000<=a[i]<=1000），
  之后只需要check count里面除0的元素外是否有duplicate就行了。
*/
