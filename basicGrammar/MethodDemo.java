public class MethodDemo{
    public static void main(String[] args) {
        int area = getArea(10, 20);
        System.out.println(area);
    }

    public static int getArea(int height, int width){
        return height * width;
    }
}