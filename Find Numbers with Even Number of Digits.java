class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        int ecount = 0;
        for(int i=0; i<nums.length ; i++){
            while(nums[i] !=0){
                int x = nums[i] /= 10;
                count = count +1;
                
            }
            if(count % 2==0) ecount++;
            count = 0;
        }
        
        return ecount;
    }
}