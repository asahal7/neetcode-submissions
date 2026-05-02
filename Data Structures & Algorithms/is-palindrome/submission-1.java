class Solution {
    public boolean isPalindrome(String s) {
        String t = s.replaceAll("[^a-zA-Z0-9]", "");
        String y = t.toLowerCase();

        int left = 0;
        int right = y.length() - 1;

        while (left < right) {
            if (y.charAt(left) != y.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
