public class _07fnOverloading {

    public static int sum(int a, int b) {
        return a+b;
    }
    public static float sum(float a, float b) {
        return a+b;
    }
    public static int sum(int a, int b, int c) {
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(5, 7));
        System.out.println(sum(5.5f, 7.3f));
        System.out.println(sum(5, 7, 2));
    }
}
