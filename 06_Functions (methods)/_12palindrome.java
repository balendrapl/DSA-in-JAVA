public class _12palindrome {
    
    public static int palindrome(int n) {
        int rev = 0;
        while(n>0){
            int lastDig = n%10;
            n /= 10;
            rev = rev*10 + lastDig;
        }
        return rev;
    }

    public static void main(String[] args) {
        int a = 1221;
        if(a==palindrome(a)){
            System.out.println("its a palindrome");
        }else{
            System.out.println("its a not palindrome");
        }
        // we can't put this if-else condition in palindrome() coz the value of copy of 'a' 
        // gets changed to 0 at the end.
    }

}
