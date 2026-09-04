/*
 * LeetCode 1365 - How Many Numbers Are Smaller Than the Current Number
 *
 * Approach:
 * For each element, count how many numbers in the array are smaller than it.
 * Store the count in the corresponding index of the result array.
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(n)
 */
class SmallCount{
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];

        for(int i = 0 ; i < nums.length ; i++){
            int count = 0;
            for(int j = 0 ; j < nums.length ; j++){
                if(nums[j] < nums[i]){
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}