package LinearSearch;

public class LeetCodeQ2 {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {3,4,5},
                {3,3,3}
        };

        System.out.println(maxWealth(accounts));
    }
    static int maxWealth(int[][] arr){
        int latest = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if(sum > latest){
                latest = sum;
            }
        }
        return latest;
    }
}
