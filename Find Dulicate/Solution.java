class Solution {
    public boolean containsDuplicate(int[] nums){
        
        // Create a HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();
        
        // Traverse the array
        for (int num : nums) {
            // If the element already exists in the set, it's a duplicate
            if (!set.add(num)) {
                return true;
            }
        }
        
        // If no duplicates are found, return false
        return false;
    }
}
