// import java.util.*;

public class _10typePromotion {
    public static void main(String arg[]) {
        // byte b=5;
        // b= b*4;    // this line will throw an error as b*4 is an expression & it automatically 
                    /*   turn to int if all other variables have lesser size than int
                          While b has byte type & byte can't handle int i.e int can't be assigned in byte type */
        // System.out.print(b);

        byte d= 5;
        d= (byte)(d*4);
        System.out.print(d);

    }
}