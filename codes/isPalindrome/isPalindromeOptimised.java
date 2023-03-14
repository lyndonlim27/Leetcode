class Solution {
    public boolean isPalindrome(int x) {
        int xCopy = x;
        int revX = 0;
        if (x < 0) {
            return false;
        }
        while (xCopy > 0) {
            revX = (xCopy % 10) + (revX * 10);
            xCopy /= 10;
        }
        return revX == x;
    }
}
