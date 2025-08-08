public class findPermutations {
    //find all the possible permutations for a string 'abc'

    public static void findPermutations(String str, String ans){
        //base case
        if (str.length()==0){
            System.out.println(ans);
            return;
        }

        //recursion
        for (int i =0; i<str.length();i++){
            char cur = str.charAt(i);
            String newString = str.substring(0,i)+str.substring(i+1);
            findPermutations(newString, ans+cur);
        }
    }


    public static void main(String[] args) {
        String str = "abc";
        findPermutations(str, "");
    }
}
