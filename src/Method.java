public class Method {
    static int sum(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
    public static void main(String[] args) {
        int sumResult = sum(100, 50);
        int finalResult = sumResult * 2;
        System.out.println(finalResult);
    }
}
