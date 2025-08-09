import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSubsets {

    public static void findSubsets(String str, String ans, int i){
        //base case
        if (i==str.length()){//as the iterator reaches end char of string, print the ans and return
            System.out.println(ans);
            return;
        }
        //recursion
        //Yes choice- chart inlcuded in new substring- next call would be next index and new string appends the char
        findSubsets(str, ans+str.charAt(i),i+1);
        //No choice- char not in new substring, new string doesn't append the char but increases index counter
        findSubsets(str,ans,i+1);
    }

    public static void findArraySubsets(List<Integer> list, int i, List<Integer> newList){
        if (i==list.size()){
            System.out.println(newList);;
            return;
        }
        //number inlcuded in the array
        newList.add(list.get(i));
        findArraySubsets(list,i+1,newList);
        newList.remove(list.get(i));
        findArraySubsets(list,i+1,newList);

    }

    public static void printArray(int[] arr){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }



    public static void main(String[] args) {
        String str = "abc";
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        findArraySubsets(list,0,list1);
    }
}
