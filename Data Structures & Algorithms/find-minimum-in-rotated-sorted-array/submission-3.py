class Solution:
    def findMin(self, nums: List[int]) -> int:
        # being rotated means everything has shifted to the right
        # we need to get it to back to it's original sorting and then return [0]
        left , right = 0 , len(nums) - 1

        while left < right:
            if nums[left] < nums[left+1]:
                left += 1
            else:
                return nums[left + 1]
        return nums[0]