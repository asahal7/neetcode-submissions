class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> store = new HashSet<>();
        for (int n : nums) {
            store.add(n);
        }
        int res = 0;

        for (int n : nums) {
            int curr = n;
            int streak = 0;
            if (!store.contains(curr - 1)){
                if (store.contains(curr)){
                    streak++;
                    while(store.contains(curr + 1)){
                        streak++;
                        curr++;
                    }
                }
            }
            res = Math.max(res, streak);
        }
        return res;
    }
}
