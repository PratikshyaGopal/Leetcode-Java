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

public class MoveZeroBrute {
    public void moveZeroes(int[] nums) {

        for(int i = 0 ; i < nums.length - 1; i++){
            if(nums[i] == 0){
                int j = i;
                while(j < nums.length - 1){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    j++;
                }
            }
        }
    }
}
