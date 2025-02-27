public class practiceQ {
    //Q1
    
    public static void average(float a, float b, float c) {
        float avg = (a+b+c)/3;
        System.out.println(avg);
    }

    //Q2

    public static boolean isEven(int n) {
        boolean check = true;
        if(n%2==0){
            check = true;
        }else{
            check = false;
        }
        return check;
    }

    //Q3- palindrome

    //Q4

    public static void mathClass(int a, int b, int c) {
        System.out.println(Math.min(a, b));
        System.out.println(Math.max(a, b));
        System.out.println(Math.sqrt(a));    //double
        System.out.println(Math.pow(a, b));  //double
        System.out.println(Math.abs(c));
        //Math.avg()  doesn't exists in Java's Math class
        
    }

    //Q5

    public static void digSum(int n) {
        int sum = 0;
        while(n>0){
            int lastDig = n%10;
            n /= 10;
            sum += lastDig;
        }
        System.out.println(sum);
    }


    public static void main(String[] args) {
        average(5, 7,10);               //Q1
        System.out.println(isEven(8));      //Q2
        mathClass(3, 5, -8);              //Q4
        digSum(453);                        //Q5
    }
}


