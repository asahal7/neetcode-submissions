class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int product = 1;

        for (int n : nums){
            product = product * n;
        }

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0) {
                int product2 = 1;
                for (int j = 0; j < i; j++){
                    product2 = product2 * nums[j];
                }
                for (int k = i + 1; k < nums.length; k++){
                    product2 = product2 * nums[k];
                }
                output[i] = product2;
            }
            else {
                output[i] = (product / nums[i]);
            }
        }
        return output;
    }
}  
