public class ReverseArr{
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = reverseArray(arr1);
        for(int i=0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    };

    public static int[] reverseArray(int[] arr) {
        int[] newArr = new int[arr.length];
        for(int i=0; i < arr.length; i++) {
            int distance = arr.length - i -1;
            newArr[i] = arr[distance];
        }
        return newArr;
    };
}