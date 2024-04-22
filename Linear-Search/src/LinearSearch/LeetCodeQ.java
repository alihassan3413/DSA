package LinearSearch;
// Q : return how many of element in array contains even number of digits

public class LeetCodeQ {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896,23};
//        System.out.println(findNumber(arr));
        System.out.println(findNumber2(arr));
    }

    static int findNumber(int[] arr){

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(findEven(arr[i])){
                count++;
            }
        }

        return count;
    }
    static boolean findEven(int num){
        String str = String.valueOf(num);

        int count=0;
        for (int i = 0; i < str.length(); i++) {
           count++;
        }
        if(count%2 ==0){
            return true;
        }
        return false;
    }


    // another method

    // a-main
    static int findNumber2(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(even(arr[i])){
                count++;
            }
        }
        return count;
    }

    // b-second part
    // finding the number of digits even or odd

    static boolean even(int num){
        if(digits(num)%2 ==0){
            return true;
        }
        return false;
    }

    // finding the no of digits in a element

    static int digits(int num){

        // for negative integers

        if(num <0){
            num = num * -1;
        }

        int count =0;
        while (num > 0){
            count++;
            num = num/10;
        }
        return count;
    }

    // another method for finding the digits

    static int digits2(int num){
        return (int)(Math.log10(num)+1);
    }
}
