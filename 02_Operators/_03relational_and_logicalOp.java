public class _03relational_and_logicalOp{
    public static void main(String arg[]){
        int a = 10;
        int b = 5;
// relational operator
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
// logical operator
        System.out.println((a>b) && (a<50) );
        System.out.println((a>b) || (a<50) );
        System.out.println(!(a>b) );


    }
}