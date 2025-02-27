public class _02unaryOp{
    public static void main(String arg[]){
        int a = 5;
        int b = a++;  // post increment
        System.out.println(a);
        System.out.println(b);
        int c = 10;
        int d = ++c;  // pre increment   &n similar code for decrement
        System.out.println(c);
        System.out.print(d);
    }
}