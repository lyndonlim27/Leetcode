class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            max = Math.max(list.size(), max);
            Character currChar = s.charAt(i);
            if (list.contains(currChar)) {
                list = list.subList(list.indexOf(currChar)+1, list.size());
            }
            list.add(s.charAt(i));

        }
        return Math.max(list.size(), max);
    }
}
