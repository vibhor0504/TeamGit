#Bruteforce
def dedup(nums):
    hmap = {}
    for x in nums :
        if x in hmap:
            hmap[x] += 1
        else:
            hmap[x] = 1
    nums.clear()
    for key in hmap:
        nums.append(key)
    return len(nums)

def dedupBetter(nums):
    num = set(nums)
    nums.clear()
    nums.extend(num)
    nums.sort()
    return len(nums)

nums = [-1,0,0,0,0,3,3]
print(dedupBetter(nums))
print(nums)