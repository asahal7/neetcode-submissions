class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        y = len(matrix) # 3 rows
        x = len(matrix[0]) # 4 columns

        for i in range(y):
            if (target == matrix[i][x-1]):
                return True
            if (target < matrix[i][x-1]):
                break
        row = i
        
        for j in range(x - 1):
            if (target == matrix[row][j]):
                return True


        return False


        