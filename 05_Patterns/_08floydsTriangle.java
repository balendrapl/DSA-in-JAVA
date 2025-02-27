public class _08floydsTriangle {
    public static void main(String[] args) {
        int n=5;
        int number=1;
        for(int line=1; line<=n; line++){
            for(int num=1; num<=line; num++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}

/* 
 output
1 
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */