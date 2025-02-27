public class _03swapNum {
    // case1
    public static void swap1(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    // case2 
    public static void swap2(int c, int d){
        int temp = c;
        c = d;
        d = temp;
    }
    public static void main(String args[]){
        int a = 5;
        int b = 10;
        int c = 200;
        int d = 400;
        
        swap1(a, b);
        swap2(c, d);

        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}

/*NOTE:  1. such dfference in both cases is arising bcoz in Java all arguments are passed with CALL BY VALUE 
            i.e only copy of the variable is passed, not the original varible itself or its address (as it is
            done in call by reference) 
         2. Java always passes by VALUE.
*/