public class _10butterfly {
    public static void main(String[] args) {
        int n=5;
        // upper part
        for(int line=1; line<=n; line++){
            for(int star=1; star<=line; star++){
                System.out.print("* ");
            }
            for(int star=1; star<=2*(n-line); star++){
                System.out.print("  ");
            }
            for(int star=1; star<=line; star++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // lower part
        for(int line=1; line<=n; line++){
            for(int star=1; star<=n-line+1; star++){
                System.out.print("* ");
            }
            for(int star=1; star<=2*(line-1); star++){
                System.out.print("  ");
            }
            for(int star=1; star<=n-line+1; star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
 output:
*                 * 
* *             * *
* * *         * * *
* * * *     * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * *     * * * *
* * *         * * *
* *             * *
*                 *

 */