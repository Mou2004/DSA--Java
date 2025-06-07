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

    //remove duplicates in a string
    //given all letters are small a-z
    //for all character/big/small letters a-z,%%etc--hashSet implementation
    public String uniqueString(String input, boolean[] array, StringBuilder newStr, int index){
       if(index==input.length()){
           return newStr.toString();//since index is the counter to loop through the input, if it ends i.e end of the string
       }
       char currChar = input.charAt(index);
       if (array[currChar-'a']==true){//if the bool in the index of the current character is true that means, its already occured in the input string before
           uniqueString(input,array,newStr,index+1);
           return newStr.toString();
       }
       else {//if the current char hasn't occured before, we append it to the newStr and continue to apply the function in the next index
           newStr.append(currChar);
           uniqueString(input,array,newStr,index+1);
           return newStr.toString();
       }

    }
    //given n friends, each one can remain single or paired up with some other friend
    //each friend can be paired only once
    //find the total no. of ways in which the friends can be paired up or remain single
    public static int friendsPairing(int n){
        if (n==1||n==2){
            return n;
        }

        //choice to remain single--if one decides to remain single, we have f(n-1) remaining people to solve the problem for
        int fnm1 = friendsPairing(n-1);

        //choice to pair
        int fnm2 =friendsPairing(n-2);
        int pairWays = (n-1)*fnm2;

        int totalWays = fnm1+pairWays;
        return totalWays;//return friendsPairing(n-1)+(n-1)*friendsPairing(n-2)
    }

    //print all binary strings of size N without consecutive ones- i.e 1 shouldn't appear consecutively
    public static void printBinaryString(int n, int lastPlace, String str){
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }

        if(lastPlace==0){
            //place 0 on chair n
            printBinaryString(n-1,0, str+"0");
            //place 1 and change lastPlace to 1
            printBinaryString(n-1,1, str+"1");
        }
        else{
            printBinaryString(n-1,0,str+"0");
        }

        //shorter version of code-
        /*
        *  printBinaryString(n-1,0, str.append("0"));
        * if(lastPlace==0){
        * printBinaryString(n-1,1, str.append("1"));
        * }
        * */

    }

    public static void main(String[] args) {
        printBinaryString(3,0,"");
    }

}
