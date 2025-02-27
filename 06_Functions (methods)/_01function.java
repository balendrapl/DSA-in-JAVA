public class _01function {
    public static void printHW() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return;  //-----> no need of using this line for void returntype function but if we use it, no need to worry.
    }
    public static void main(String args[]){
        printHW();
    }
}

/*
NOTE: 1.    if we have taken int returntype instead of void in above function, then add following
            line at the end of the function's block of code

            return 3;

            here we use 3, which represents the no. of values to be returned,
            as in above code Hello World is returned 3 times

      2.    Methods- those functions which are written inside the class are known as the methods of that class
            In c++, functions can be written outside the class but Java is designed in such a way that all the
            code have to be written inside the class. So all the functions in Java are conventionally known as methods. 
*/