class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> seen = new HashSet<>();
        int maxLength = 0;
        int length = 0;
        int removed = 0;

        for (int i = 0; i < s.length(); i++) {
            if (!seen.contains(s.charAt(i))) {
                seen.add(s.charAt(i));
                length++;
                maxLength = Math.max(length, maxLength);
            }
            else {
                while (seen.contains(s.charAt(i))){
                    seen.remove(s.charAt(removed));
                    removed++;
                    length--;
                }
                seen.add(s.charAt(i));
                length++;
                maxLength = Math.max(length, maxLength);
            }
        }
        return maxLength;
    }
}
