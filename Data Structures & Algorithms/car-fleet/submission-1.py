class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        # Pair positions with speeds and sort by position descending
        pairs = sorted(zip(position, speed), reverse=True)

        stack = []

        for pos, spd in pairs:
            time = (target - pos) / spd

            if not stack or time > stack[-1]:
                stack.append(time)
            # else: this car joins the fleet of stack[-1]

        return len(stack)






        