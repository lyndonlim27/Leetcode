class Solution {
    public boolean isPalindrome(int x) {
        String num = Integer.toString(x);
        int strLen = num.length();
        for (int i = 0; i < Math.floor(strLen/2); i++) {
            if (!(num.charAt(i) == num.charAt(strLen - 1  - i))) {
                return false;
            }
        }
        return true;
    }
}
