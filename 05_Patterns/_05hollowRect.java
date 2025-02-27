//⭐⭐⭐⭐⭐
public class _05hollowRect {
    public static void main(String[] args) {
        int l=6, b=4;
        for(int line=1; line<=l; line++){
            for(int star=1; star<=b; star++){
                if(line==1 || line==l|| star==1 || star==b){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

//method2
/*
public class _05hollowRect {
    public static void main(String[] args) {
        int l=6, b=4;
        for(int line=1; line<=l; line++){
            for(int star=1; star<=b; star++){
                if(line==1 || line==l){
                    System.out.print("* ");
                } else{
                    if(star==1 || star==b){
                        System.out.print("* ");
                    } else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
*/

//method 3 (not optimised, as it uses 3 for loops, whereas above method uses 2 loops)

/*

public class _5hollowRect {
    public static void main(String args[]){
        int l = 4, b = 6;
        for(int line=1; line<=b; line++){
            if(line>1 && line<b ){
                for(int j=1; j<=l; j++){
                    if(j>1 && j<l){
                        System.out.print("  ");
                    } else{
                        System.out.print("* ");
                    }
                }
                System.out.println();
            } else{
                for(int j=1; j<=l; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}

 */
