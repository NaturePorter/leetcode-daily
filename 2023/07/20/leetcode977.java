class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int k = nums.length - 1;
        int i = 0;
        int j = nums.length - 1;
        while ( i <= j ) {
            if (nums[i]*nums[i] < nums[j]*nums[j]) {
                result[k] = nums[j]*nums[j];
                k--;
                j--;
            } else {
                result[k] = nums[i]*nums[i];
                k--;
                i++;
            }
        }
        return result;
    }
}
