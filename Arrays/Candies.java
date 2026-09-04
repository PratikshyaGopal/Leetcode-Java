/*
 * LeetCode 1431 - Kids With the Greatest Number of Candies
 *
 * Approach:
 * First find the maximum number of candies among all kids.
 * Then check if adding extraCandies to each kid's candies
 * makes their total greater than or equal to the maximum.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Candies{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        ArrayList<Boolean> result = new ArrayList<>();

        //Find the maximun number of candies
        int max = 0;

        for(int i = 0 ; i < candies.length ; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }

        //checking for each kid
        for(int i = 0 ; i < candies.length ; i++){
            if(candies[i] + extraCandies >= max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}