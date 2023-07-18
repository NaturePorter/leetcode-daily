class Solution {
    public int search(int[] nums, int target) {
        int a = 0;
        while ( nums[a] != target ) {
                a++;
                if (a == nums.length) {
                    return -1;
                }
        }
        return a;
    }
}
