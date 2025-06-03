public class Recursion2 {
    //Tilling problem-important - appears in different forms in interviews
    /* note-recursion isn't the best way to solve such problems--DP is
     * Given a "2*n" board  and tiles of size 2*1, count the number of ways to tile the
     * given board using the 2*1 tiles
     *      * (A tile can either be placed horizontally or vertically)
     */

    public static int tilingWays(int n){//floor size is 2*n
        //base case
        if (n==0||n==1){
            //no. of ways if floor size is 2*0 is 1 i.e no tile
            //no. of ways if floor size is 2*1 is 1- i.e 1 2*1 tile vertically
            return 1;
        }
        /*Two ways to arrange tiles
        * Vertically- tilingWays(n-1)--i.e if you place one tile vertically, then you need solve n-1 area of the floor
        * Horizontally- tilingWays(n-2)-- if you place one horizontally, you have to place the next tile horizontally too, and then solve the rest n-2 of the floor
        * */
        else return tilingWays(n-1)+tilingWays(n-2);
    }
    //if the floor is 4*n and the tile is 4*1
    //note-recursion isn't the best way to solve such problems
    //try a DP (memoized or tabulated) version too — recursive ones without memoization can be slow for large n
    public static int tilingWays4(int n){//floor size is 2*n
        //base case
        if (n==0||n==1||n==2||n==3){

            return 1;
        }
        if(n==4){
            return 2; //horizontally and vertically
        }

        else return tilingWays4(n-1)+tilingWays4(n-4);
    }

}
