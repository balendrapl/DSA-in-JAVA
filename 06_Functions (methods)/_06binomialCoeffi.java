public class _06binomialCoeffi {

    public static int factorial(int a) {
        int f = 1;
        for(int i=1; i<=a; i++){
            f *= i;
        }
        return f;
    }

    public static int binomialC(int n, int r) {
        int binC = factorial(n)/((factorial(r))*(factorial(n-r)));
        return binC;
    }
    public static void main(String[] args) {
        int n = 7, r = 3;
        System.out.print("nCr with (n=" + n + ", r=" + r + ") = ");
        System.out.print(binomialC(n, r));
    }
}