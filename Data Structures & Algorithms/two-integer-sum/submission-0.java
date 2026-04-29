class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> search = new HashMap<>();

        for (int k = 0; k < nums.length; k++) {
            int other = target - nums[k];
            if (search.containsKey(other)) {
                return new int[] {search.get(other), k};
            }
            search.put(nums[k], k);
        }
        return new int[] {};

    }
}
