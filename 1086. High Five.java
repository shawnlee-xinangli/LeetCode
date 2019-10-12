class Solution {
    public int[][] highFive(int[][] items) {
        TreeMap<Integer, PriorityQueue<Integer>> map = new TreeMap();
        
        for (int[] e: items) {
            int id = e[0];
            int score = e[1];
            
            if (!map.containsKey(id)) {
                PriorityQueue<Integer> pq = new PriorityQueue<Integer>(5);
                pq.add(score);
                map.put(id,pq);
            }else {
                PriorityQueue<Integer> pq = map.get(id);
                pq.add(score);
                if (pq.size()>5) {
                    pq.poll();
                }
                map.put(id,pq);
            }
        }
        int[][] res = new int[map.size()][2];
            
        for (int i = 0;i < map.size();i++) {
                int id = i+1;
                res[i][0] = id;
                
                int sum = 0;
                PriorityQueue<Integer> pq = map.get(id);
                while (!pq.isEmpty()) {
                    sum += pq.poll();
                }
                
                res[i][1] = sum/5;
            }
            return res;
        }
}

/*
  TreeMap和HashMap的difference在于TreeMap中的Key是in a sorted order, 而HashMap没有排序功能。
  PQ.poll()截取第一个元素(最小的元素)
*/
