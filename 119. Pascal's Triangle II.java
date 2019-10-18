class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
        if (rowIndex == 0) {           
            list.add(1);
            return list;
        }
        if (rowIndex == 1) {
            list.add(1);
            list.add(1);
            return list;
        }
        list.add(1);
        List<Integer> prevlist = getRow(rowIndex-1);
        for (int i =0; i<rowIndex - 1; i++) {
            list.add(prevlist.get(i) + prevlist.get(i+1));
        }
        list.add(1);
        return list;
    }
}

/*
  Recursion Base Case rowIndex == 0 || rowIndex == 1
*/

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        for (int k = 1;k<=rowIndex;k++) {
            for (int i = k-1; i > 0; i--) {
                list.set(i,list.get(i)+list.get(i-1));
            }
            list.add(1);
        }
        return list;
    }
}

/*
  Iteration Method (Space O(K)) 只更改原来的List。
*/
