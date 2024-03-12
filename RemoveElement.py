#Bruteforce
def remElement(nums, val):
    k=0
    for i in range (0,len(nums)) :
        if(nums[i] == val):
            nums[i] = 100
            k=k+1
        i = i+1
    nums.sort()
    return len(nums)-k

#Recursion
def remElementsNoLoop(nums, val):
    if not(val in nums):
        return len(nums)
    nums.remove(val)
    return remElementsNoLoop(nums, val)

#lambda func
def remElementLamda(nums, val):
    nums = list(filter(lambda x: x != val, nums))
    return len(nums)

nums = [0,1,2,2,3,0,4,2]
val = 2
print(nums)
#k = remElement(nums, val)
#k = remElementsNoLoop(nums, val)
k = remElementLamda(nums, val)
print(nums)
print(k)