class Solution {
    public int[][] kClosest(int[][] points, int K) {
        int[][] res = new int[K][2];
        Comparator<int[]> comp = (p1, p2) -> (p2[0]*p2[0]+p2[1]*p2[1]-p1[0]*p1[0]-p1[1]*p1[1]);
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(comp);
        for(int[] point:points) {
            pq.offer(point);
            if (pq.size()>K) {
                pq.poll();
            }
        }
        for(int i = K-1;i >= 0; i--) {
            res[i] = pq.poll();
        }
        return res;
    }
}

/*
  运用PQ降序排列，从最后一个元素开始添加。
*/
