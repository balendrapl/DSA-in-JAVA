public class _10binaryToDecimal {

    public static void binDeci(int bin) {
        int deci = 0;
        int p = 0;
        while(bin>0){
            int lastDig = bin%10;
            deci += lastDig * (int)Math.pow(2, p);   //here we typecasted it coz it converts intput value to double & also returns a double value
            bin /= 10;
            p++;
        }
        System.out.println(deci);
    }
    public static void main(String[] args) {
        binDeci(100);
    }
}
