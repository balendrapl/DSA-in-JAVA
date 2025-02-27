public class _11decimalToBinary {

    public static void deciBin(int deci ) {
        int bin = 0;
        int p = 0;
        while(deci>0){
            int rem = deci%2;
            bin += rem * (int)Math.pow(10, p);
            deci /= 2;
            p++;
        }
        System.out.print(bin);
    }  
    public static void main(String[] args) {
        deciBin(8);
    }
}



//m2-- this is a wrong method as it gives correct results only for odd no. & not for even
//     bcoz of this line "rem = rem*10 + n%2;"
/*
public class _11decimalToBinary {

    public static int deciBin(int n ) {
        int rem = 0;
        while(n>0){
            rem = rem*10 + n%2;
            n /= 2;
        }
        int reversedBin = rem;

        int binNum = 0;
        while(reversedBin>0){
            int lastDig = reversedBin%10;
            reversedBin /= 10;
            binNum = binNum*10 + lastDig;
        }
        return binNum;
    }
    
    public static void main(String[] args) {
        System.out.println(deciBin(16));
    }
}
*/