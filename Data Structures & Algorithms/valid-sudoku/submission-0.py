class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:

        # Check rows
        for r in range(9):
            seen = set()
            for c in range(9):
                val = board[r][c]
                if val != ".":
                    if val in seen:
                        return False
                    seen.add(val)

        # Check columns
        for c in range(9):
            seen = set()
            for r in range(9):
                val = board[r][c]
                if val != ".":
                    if val in seen:
                        return False
                    seen.add(val)

        # Check 3×3 boxes
        for i in range(9):
            used = set()
            row_start = (i // 3) * 3
            col_start = (i % 3) * 3

            for r in range(row_start, row_start + 3):
                for c in range(col_start, col_start + 3):
                    val = board[r][c]
                    if val != ".":
                        if val in used:
                            return False
                        used.add(val)

        return True


