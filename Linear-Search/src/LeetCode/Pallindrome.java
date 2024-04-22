package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Pallindrome {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome1(x));;
    }

    static public boolean isPalindrome(int x) {

        if(x<0){
            return false;
        }
        int n = x;
        List<Integer> list= new ArrayList<>();
        while (n>0){
            x = n%10;
            n = n/10;
            list.add(x);
        }
        int left = 0;
        int right = list.size() -1;
        System.out.println(list);
        while (left < right){
            if(!list.get(left).equals(list.get(right))){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    static public boolean isPalindrome1(int x) {

        if(x<0){
            return false;
        }
        int reversed = 0;
        int original = x;
        while (x>0){
            int digit = x%10;
            reversed = reversed*10+digit;
            x /= 10;
        }

        return original == reversed;
    }

}
