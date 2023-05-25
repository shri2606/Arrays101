class Solution {
    public int[] sortedSquares(int[] nums) {
        int sq = 0;
        for(int i=0;i<nums.length;i++){
            sq = nums[i] * nums[i];
            nums[i] = Math.abs(sq);
        }
        
        // Sorting
        Arrays.sort(nums);
        return nums;
        
    }
}