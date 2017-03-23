public class 13_Roman_To_Integer {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romans = new HashMap<>();
        populateMap(romans);

        int sum = 0;
        int max = 0;
        int cur;


        for(int ii = s.length() - 1; ii >= 0; ii--) {
            cur = romans.get(s.charAt(ii));

            if(ii + 1 < s.length() && (cur < max))
                sum -= cur;
            else {
                sum += cur;
                max = cur;
            }
        }

        return sum;
    }

    public void populateMap(HashMap<Character, Integer> romans) {
        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);
    }
}
