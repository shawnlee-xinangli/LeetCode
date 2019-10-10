//Brute Force :
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int l = gas.length;
        for (int i = 0;i<l;i++) {
            if (candrive(gas,cost,i,l)) {
                return i;
            }
        }
        return -1;
    }
    
    public boolean candrive(int[] gas, int[] cost, int k,int l) {
        int current = gas[k]-cost[k];
        if (current <0) {
            return false;
        }
        if (k == l-1) {
            for (int i = 0;i<l-1;i++) {
                current += gas[i]-cost[i];
                if (current < 0) {
                    return false;
                }
            }
        }
        else {
            for (int i = k+1;i<l;i++) {
                current += gas[i]-cost[i];
                if (current < 0) {
                    return false;
                }
            }
            for (int i = 0;i<k;i++) {
                current += gas[i]-cost[i];
                if (current < 0) {
                    return false;
                }
            }
        }
        return true; 
    }    
}




class Solution {
        public int canCompleteCircuit(int[] gas, int[] cost) {
        int sumGas = 0;
        int sumCost = 0;
        int res = 0;
        int tank = 0;
        for (int i = 0; i < gas.length; i++) {
            sumGas += gas[i];
            sumCost += cost[i];
            tank += gas[i] - cost[i];
            if (tank < 0) {
                res = i + 1;
                tank = 0;
            }
        }
        if (sumGas < sumCost) {
            return -1;
        } 
        else {
            return res;
        }
    }
}

/*
  优化方案: 首先注意到如果有解的话，gas的和一定是>=cost的和，因为无论res是什么都需要遍历所有元素。
  并且如果有解，0到length-1中有且仅有一个元素能满足条件，说明我们只需要从0开始找，
  如果一旦发现tank<0，说明这个0到i中的任意一个数都不是解，解一定是在i+1到length-1中的某一个数。
*/
