public class _04multiply {

    public static int multiply(int a, int b) {
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int prod = multiply(a,b);
        System.out.println(prod);
        prod = multiply(7, 4);
        System.out.print(prod);
    }
}
