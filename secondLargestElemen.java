class Solution {
    public int secondLargestElement(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] != nums[n - 1]) {
                return nums[i];
            }
        }

        return -1; 
    }
}
