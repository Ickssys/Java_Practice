
public class MathMisc {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { // we can also do i * i <= n;
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // recursive euclidean algorithm
    public static int euclidGCD(int p, int q) {
        if (q == 0)
            return p;
        return euclidGCD(q, p % q);
    }

    // recursive fibonnacci
    public static int fib(int n) {
        return fibIter(1, 0, n);
    }

    public static int fibIter(int a, int b, int count) {
        if (count == 0) {
            return b;
        }
        return fibIter(a + b, a, count - 1);
    }

    public static void main(String[] args) {
        System.out.println(euclidGCD(45, 7));
    }
}
