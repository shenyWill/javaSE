public class ArrayArrayDemo{
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        System.out.println(arr);

        int[][] arr1 = new int[3][];
        arr1[0] = new int[2];
        arr1[1] = new int[5];
        arr1[2] = new int[2];
        System.out.println(arr1[1][2]);

        int[][] arr2 = {{1,2,3}, {3,4,2}, {2,0}};
        System.out.println(arr2[1][2]);
        System.out.println(arr2.length);
        System.out.println(arr2[2].length);
    }
}