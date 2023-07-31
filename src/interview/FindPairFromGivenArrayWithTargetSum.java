package interview;

public class FindPairFromGivenArrayWithTargetSum {
    public static void main(String[] args){
        int[] arr = {2,4,1,6,5,3,3};
        int targetSum = 6;

        for(int i =0; i<arr.length-1; i++){

            for(int j = i+1; j<arr.length; j++) {

                if (arr[i] + arr[j] == targetSum) {
                    System.out.printf("Pair found (%d, %d) %n", arr[i] , arr[j]);
                }
            }
        }

    }
}
