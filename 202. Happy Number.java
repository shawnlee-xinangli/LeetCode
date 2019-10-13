class Solution {
    public boolean isHappy(int n) {
        Set<Integer> s = new HashSet<Integer>();   
        while (!s.contains(n)) {
            s.add(n);
            if (n == 1) {
                return true;
            }
            n = squaresum(n);
        }
        return false;
    }
    
    public int squaresum(int n) {
        int sum = 0;
        while (n>0) {
            sum += (n%10)*(n%10);
            n = n/10;
        }   
        return sum;
    }      
}

/*
  如果n为happy number，则 n = squaresum(n) 一定会出现1，所以一旦n为1，return true。
  考虑unhappy的情况，如果false，一定会出现无限循环，也就是会出现  ...,N1,N2,N3,...,Nk,N1,N2,N3,...,NK,... 的情况
  n与之前的n有重复,一旦发现重复return false。
*/
