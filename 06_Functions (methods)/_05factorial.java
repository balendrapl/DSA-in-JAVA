public class _05factorial {

    public static void factorial(int n) {
        int fact = 1;
        for(int i=n; i>=1; i--){
            fact = fact*i;
            System.out.print(i + "*");
        }
        System.out.print(" = " + fact);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + "! = ");
        factorial(n);
    }
}
