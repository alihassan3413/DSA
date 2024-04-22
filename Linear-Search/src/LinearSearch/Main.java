package LinearSearch;

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 9;

        int ans  = linearSearch(array,target);
        int elementone = linearSearch2(array,target);
        boolean boolone = linearSearch3(array,target);


        System.out.println("Index :"+ans);
        System.out.println("Element : "+elementone);
        System.out.println("Present or Not : "+boolone);
    }

    // search the item in the array:return the index if found

    // for finding index
    static int linearSearch(int[] arr,int targer){
        if(arr.length==0){
            return -1;
        }
        for (int index=0; index < arr.length; index++){
            int element  = arr[index];
            if(element == targer){
                return index;
            }
        }
        // this line will execute only if the above return statement does not work and the target not found
        return -1;
    }


    // for finding the element
    static int linearSearch2(int[] arr,int targer){
        if(arr.length==0){
            return Integer.MAX_VALUE;
        }
        for ( int element : arr){
            if(element == targer){
                return element;
            }
        }
        // this line will execute only if the above return statement does not work and the target not found
        // cannot return -1 bcz there might be the -1 as element but it can not be index
        return Integer.MAX_VALUE;
    }


    // for finding true or false
    static boolean linearSearch3(int[] arr,int targer){
        if(arr.length==0){
            return false;
        }
        for (int index=0; index < arr.length; index++){
            int element  = arr[index];
            if(element == targer){
                return true;
            }
        }
        // this line will execute only if the above return statement does not work and the target not found
        return false;
    }
}