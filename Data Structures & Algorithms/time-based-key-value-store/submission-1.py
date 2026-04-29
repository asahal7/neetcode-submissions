class TimeMap:

    def __init__(self):
        self.ds = defaultdict(list)

    def set(self, key: str, value: str, timestamp: int) -> None:
        self.ds[key].append((timestamp,value))

    def get(self, key: str, timestamp: int) -> str:
        arr = self.ds.get(key, [])
        if not arr:
            return ""

        left, right = 0, len(arr) - 1
        res = ""  

        while left <= right:
            mid = (left + right) // 2
            mid_timestamp, mid_value = arr[mid]

            if mid_timestamp <= timestamp:
                res = mid_value 
                left = mid + 1   
            else:
                right = mid - 1

        return res
        
