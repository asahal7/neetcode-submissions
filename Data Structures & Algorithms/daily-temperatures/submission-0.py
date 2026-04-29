class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        result = [0] * len(temperatures)
        for t in range(len(temperatures)):
            for x in range(t+1 , len(temperatures)):
                if (temperatures[x] > temperatures[t]):
                    result[t] = x - t
                    break
        return result
                
            

        