public class MaxDemo{
    public static void main(String[] args) {
        int[] arr = {2,5,78,3,1,9,76,0,35,5,7,8};
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}