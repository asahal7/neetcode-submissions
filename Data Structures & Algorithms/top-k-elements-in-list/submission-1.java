class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        int[] answer = new int[k];
        int a = 0;

        for (int i = 0; i < nums.length; i++){
            if (freq.containsKey(nums[i])) {
                freq.put(nums[i], freq.get(nums[i]) + 1);
            }
            else {
                freq.put(nums[i], 0);
            }
        }
        List<Integer> values = new ArrayList<>(freq.values());
        HashSet<Integer> mostfreq = new HashSet<>();

        for (int b = 0; b < k; b++){
            mostfreq.add(Collections.max(values));
            values.remove(Collections.max(values));
        }
        for (Map.Entry<Integer,Integer> entry : freq.entrySet()) {
            if (mostfreq.contains(entry.getValue())) {
                answer[a++] = entry.getKey();
            }
        }
        return answer;
    }
}
