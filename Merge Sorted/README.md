# Merge Sorted Array
You are given two integer arrays nums1 and nums2, sorted in __non-decreasing order__, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

__Merge__ nums1 and nums2 into a single array sorted in __non-decreasing order.__

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

 

__Example 1:__

__Input:__ nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
__Output:__ [1,2,2,3,5,6]
__Explanation:__ The arrays we are merging are [1,2,3] and [2,5,6].

The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
