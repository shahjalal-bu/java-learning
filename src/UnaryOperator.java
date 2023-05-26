public class UnaryOperator {
    public static void main(String[] args) {
        int x = -10;
        x = +10;
        System.out.println(x);
        int y = 100;
        int result;
        result = y++;
        System.out.println(result);
        System.out.println(y);
        int ypre = 100;
        int resultpre;
        resultpre = ++ypre;
        System.out.println(resultpre);
        System.out.println(ypre);

    }
}
