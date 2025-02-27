public class _04character {
    public static void main(String[] args) {
        for(int line=1; line<=4; line++){
            char ch = 'A';
            for(int chars=1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();            
        }
    }
}
/* Interesting note:

1. if we make ch, a global variable i.e declared outside the outer loop then 
        A
        BC
        DEF
        GHIJ
2. if we make ch, a local variable i.e declared outside the inner loop but inside the outer loop then
        A
        AB
        ABC
        ABCD
3. if we make ch, a local variable i.e declared inside the inner loop then
        A
        AA
        AAA
        AAAA
*/
