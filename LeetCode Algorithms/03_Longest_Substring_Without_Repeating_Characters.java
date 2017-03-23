public class 03_Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> characterMap = new HashMap<Character, Integer>();
        int maxLength = 0;
        int currBeg = 0;
        int currEnd;
        int repeatedIndex;

        for(int ii = 0; ii < s.length(); ii++) {
            if(characterMap.containsKey(s.charAt(ii))) {
                repeatedIndex = characterMap.get(s.charAt(ii));

                if(repeatedIndex >= currBeg) {
                    currEnd = ii - 1;
                    maxLength = Math.max(maxLength, currEnd - currBeg + 1);
                    currBeg = repeatedIndex + 1;
                }
            }

            characterMap.put(s.charAt(ii), ii);
        }

        currEnd = s.length() - 1;
        maxLength = Math.max(maxLength, currEnd - currBeg + 1);

        return maxLength;
    }
}
