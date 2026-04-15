class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        table = {}

        for i in range(len(nums)):
            x = table.get(target - nums[i])

            if x is not None:
                return [table[target - nums[i]], i]
            table[nums[i]] = i
