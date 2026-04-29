class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        stack = []

        for i in range(len(position)):
            for j in range(0, len(position) - i - 1):
                if position[j] < position[j+1]:
                    position[j] , position[j+1], speed[j], speed[j+1] = position[j+1] , position[j], speed[j+1], speed[j]
        
        for a in range(len(position)):
            time = (target - position[a]) / speed[a]
            if not stack or time > stack[-1]:
                stack.append(time)
        
        return len(stack)





        