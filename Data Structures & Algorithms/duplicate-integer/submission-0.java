class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> duplicate = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!(duplicate.contains(nums[i]))) {
                duplicate.add(nums[i]);
            }
            else {
                return true;
            }
        }
        return false;
    }
}