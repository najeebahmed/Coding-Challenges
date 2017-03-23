public class 14_Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";

        int prefixLength = strs[0].length();

        for(int ii = 1; ii < strs.length; ii++) {
            prefixLength = Math.min(strs[ii].length(), prefixLength);

            for(int jj = prefixLength - 1; jj >= 0; jj--)
                if(strs[0].charAt(jj) != strs[ii].charAt(jj))
                    prefixLength = jj;
        }

        return strs[0].substring(0, prefixLength);
    }
}
