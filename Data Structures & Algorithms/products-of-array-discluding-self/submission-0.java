class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroes = 0;
        int position = 0;
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] == 0) {
                zeroes++;
            }
        }
        if (zeroes > 1) {
            for (int p = 0; p < nums.length; p++) {
                nums[p] = 0;
            }
        }
        else if (zeroes == 0) {
            int product = 1;
            for (int i = 0; i < nums.length; i++){
                product *= nums[i];
            }
            for (int j = 0; j < nums.length; j++) {
                nums[j] = product / nums[j];
            } 
        }
        else if (zeroes == 1) {
            int product = 1;
            for (int a = 0; a < nums.length; a++) {
                if (nums[a] != 0) {
                    product *= nums[a];
                    nums[a] = 0;
                }
                else {
                    position = a;
                }
            }
            nums[position] = product;
        }
        return nums;
        
    }
}  
