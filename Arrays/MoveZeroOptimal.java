/*
 * LeetCode 283 - Move Zeroes
 *
 * Approach:
 * Use a pointer to place all non-zero elements at the beginning
 * of the array, then fill the remaining positions with zero.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
package Arrays;

public class MoveZeroOptimal {
    public void moveZeroes(int[] nums) {

        int index = 0;

        // Move all non-zero elements to the front
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // Fill the remaining positions with zero
        while(index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }
}
