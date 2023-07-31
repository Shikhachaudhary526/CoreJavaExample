package interview;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 44, 33, 33};
        int temp;
        for(int i=0; i<arr.length; i++){
            for(int j= i+1; j<arr.length; j++){
              /*  if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                } */
                if(arr[i] == arr[j]){

                }
            }
        }
        System.out.println("Second highest number  " +arr[arr.length-2]);

    }
}
