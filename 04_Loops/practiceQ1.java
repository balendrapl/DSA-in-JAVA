public class practiceQ1 {
    public static void main(String args[]){
        int n=156548837;
        int evenSum = 0; 
        int oddSum = 0; 
        
        while(n>0){
            int lastDig = n%10;
            if(lastDig%2 == 0){
                evenSum += lastDig;
            } else{
                oddSum += lastDig; 
            }
            n /= 10;
        }
        System.out.println("Even num sum: " + evenSum);
        System.out.println("Odd num sum: " + oddSum);
    }
}
