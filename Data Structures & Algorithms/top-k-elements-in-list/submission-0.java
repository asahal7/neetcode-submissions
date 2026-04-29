class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!(freq.containsKey(nums[i]))) {
                freq.put(nums[i], 1);
            }
            else {
                freq.put(nums[i], freq.get(nums[i]) + 1);
            }
        }
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(freq.entrySet());
        entryList.sort((a, b) -> b.getValue() - a.getValue()); 

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = entryList.get(i).getKey();
        }

        return result;

    }
}
