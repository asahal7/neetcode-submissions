class Solution:
    def maxArea(self, heights: List[int]) -> int:
        left, right = 0 , len(heights) - 1
        maximum = 0
        current = 0

        while left < right : 
            if heights[left] > heights[right]:
                current = heights[right] * (right - left)
            else:
                current = heights[left] * (right - left)
            if current > maximum:
                maximum = current

            if heights[left] > heights[right]:
                right = right - 1
            elif heights[left] <= heights[right]:
                left = left + 1
            
        return maximum


        