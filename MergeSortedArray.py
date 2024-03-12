#Bruteforce
def funcMergeArr(nums1, nums2,m,n) -> None:
    for i in range (0,n):
        nums1[i+m] = nums2[m-n]
        n = n-1
        i = i+1
    nums1.sort()
    print(nums1)

#Recursion
def funcMergeArrNoFor(nums1, nums2, m, n) -> None:
    if m >= len(nums1) | n > 0:
        nums1.sort()
        return
    nums1[m] = nums1[m] + nums2[n-1]
    funcMergeArrNoFor(nums1, nums2, m+1, n-1)

#nums1 = [1,2,3,4,5,0]
#nums2 = [6] m=5, n=1

nums1 = [1,2,3,0,0,0]
nums2 = [2,5,6]
m=3
n=3
print(nums1)
#funcMergeArr(nums1, nums2, m, n)
funcMergeArrNoFor(nums1, nums2, m, n)
print(nums1)


