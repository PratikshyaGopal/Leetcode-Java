/*
 * LeetCode 1470 - Shuffle the Array
 *
 * Approach:
 * The array is divided into two halves:
 * [x1, x2, ..., xn, y1, y2, ..., yn]
 *
 * We take one element from the first half and one from
 * the second half alternately and store them in the result.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class SuffleArray {
    public int[] shuffle(int[] nums, int n) {

        int[] result = new int[2*n];

        for(int i = 0 ; i < n ; i++){
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[i+n];
        }
        return result;
    }
}