public class Factorial {
    public static void main(String[] args) {
        int a=4;
        long answer=factorial(a);

        System.out.println(a+ "! = " + answer);
    }

    public static long factorial(int n) {
        long result=1;

        for (int i=1; i<=n; i++){
            result=result * i;
        }
        return result;
    }
}
