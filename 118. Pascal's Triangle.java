class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList();
        List<Integer> row = new ArrayList();
        if (numRows == 0) {
            return res;
        }
        row.add(1);
        res.add(new ArrayList(row));
        if (numRows == 1) {
            return res;
        }
      
        for (int i = 2;i <= numRows; i++) {           
            row.add(1);
            for (int j =i-2;j>= 1;j--){
                row.set(j,row.get(j)+row.get(j-1));
            }
            res.add(new ArrayList(row));
        }
        
        return res;  
    }
}

/*
  时间复杂度很好，但空间复杂度较高。
*/
