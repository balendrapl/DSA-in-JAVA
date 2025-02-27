public class _06switchStt {
    public static void main(String arg[]){
        int num = 2;
        switch(num) {
            case 1 : System.out.println("Burger");
                        break;
            case 2 : System.out.println("Paav Bhaji");
                        break;
            case 3 : System.out.println("Mango Shake");
                        break;
            default : System.out.print("We wake up....");
        }
    }
}

/* Note- 1. If any case matches the variable value i.e any case becomes true, then the following cases
            also start returning true, as here this switch acts like an electric switch in series combination.
            And therefore, we have to use "break" to stop the flow of electricity for the following cases
            after turning on the switch for that true real case.
          2.There is no necessity of having these cases to be in particular order
            we can use as: case2,case3,case1 as well.
          3.Also we can use character instead of numbers but it should match with some value of variable.
            e.g. char 'c';
                 switch(variable){
                 case 'b' : 
                        break;
                 case 'a' :
                        break;
                 case 'c' :
                        break;
                 }
*/