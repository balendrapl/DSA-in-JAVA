public class _04assignmentOp {
    public static void main(String arg[]){
        int a = 40;
        // a = a + 10;
        a += 10;   // ⭐Java executes this line few nano seconds faster than the previous line i.e a = a+10
        // similar way for -=, *=, /=
        System.out.print(a);
    }
}