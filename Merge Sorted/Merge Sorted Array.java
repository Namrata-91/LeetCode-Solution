public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Start from the end of nums1 and nums2
        int i = m - 1; // Pointer for the last element in nums1's original part
        int j = n - 1; // Pointer for the last element in nums2
        int k = m + n - 1; // Pointer for the last position in nums1

        // Compare elements from nums1 and nums2 and place the largest one at the end
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If there are remaining elements in nums2, place them in nums1
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
