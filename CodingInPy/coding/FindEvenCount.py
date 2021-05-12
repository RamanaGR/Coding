def findNumbers(nums):
    count = 0

    def count_digits(n):
        count = 0
        while n > 0:
            count += 1
            n =n // 10
        return count

    for num in nums:
        if count_digits(num) % 2 == 0:
            count += 1
    return count


print(findNumbers([1, 12, 5, 365, 4569]))
