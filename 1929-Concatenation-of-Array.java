class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        for(int i=0; i<ans.length; i++){
            if(i>=nums.length){
                ans[i]=nums[i-nums.length];
            } else{
                ans[i]=nums[i];
            }
        }
        return ans;
    }
}