public class _07invertedHalfNumPyramid {
    public static void main(String[] args) {
        int n=5;
        for(int line=1; line<=n; line++){
            for(int num=1; num<=n-line+1; num++){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

/*
 output:
1 2 3 4 5 
1 2 3 4
1 2 3
1 2
1
 */