class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        y = len(matrix) # 3 rows
        x = len(matrix[0]) # 4 columns

        for i in range(y):
            for j in range(x):
                if (target == matrix[i][j]):
                    return True

        return False


        