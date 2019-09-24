class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sum = 0;
        char maxchar = 'I';
        for (int i =s.length()-1;i>=0;i--) {
            if (map.get(s.charAt(i))>=map.get(maxchar)) {
                sum += map.get(s.charAt(i));
                maxchar = s.charAt(i);
            }
            else {
                sum -= map.get(s.charAt(i));
            }
        }
        return sum;
    }
}
