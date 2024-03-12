def dedup(nums):
    hmap = {}
    for x in nums :
        if x in hmap:
            hmap[x] += 1
        else:
            hmap[x] = 1
    temp = []
    for key in hmap:
        temp.append(key)
    nums.clear()
    nums.extend(temp)
    return len(nums)

nums = [1,1,2]
print(dedup(nums))
print(nums)