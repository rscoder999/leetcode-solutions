//27.Remove Element
//https://leetcode.com/problems/remove-element/description/

class Solution {
    public int removeElement(int[] nums, int val) {
        
        int i=0;

        for(final int num:nums){
            if(num!=val){
                nums[i++]=num;
            }
        }
        return i;
    }
}
