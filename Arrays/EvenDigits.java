/*
 * LeetCode 1672 - Richest Customer Wealth
 *
 * Approach:
 * Calculate the total wealth of each customer by summing all
 * the money in their bank accounts, then keep track of the
 * maximum wealth found.
 *
 * Time Complexity: O(m * n)
 * Space Complexity: O(1)
 */
package Arrays;

public class EvenDigits {

    public int findNumbers(int[] nums) {
        int count = 0;

        for(int i = 0 ; i < nums.length ; i++){

            int num = nums[i];
            int digits = 0;

            while(num > 0){

                num = num / 10 ;
                digits++;
            }
            if(digits % 2 == 0){
                count++;
            }
        }
        return count;
    }

}
