class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int start = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            max = Math.max(set.size(), max);
            Character currChar = s.charAt(i);
            if (set.contains(currChar)) {
                while (s.charAt(start) != currChar) {
                    set.remove(s.charAt(start));
                    start++;
                }
                    start++;
            } else {
                set.add(currChar);
            }

        }
        return Math.max(set.size(), max);
    }
}
