package example;

public class ReverseArrayFromGivenIndex {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int position=3;
        for(int j=arr[position]-1; j>=0; j--){
            System.out.println(arr[j]);
        }
        for(int i=arr[position]; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
