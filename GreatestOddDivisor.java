public class GreatestOddDivisor {
    public static void main(String[] args) {
        int n = 27;

        //  podejscie iteracyjne
        int iterativeResult = calculateGreatestOddDivisorIteratively(n);
        System.out.println(iterativeResult);

        //  podejscie rekursywne
        int recursiveResult = calculateGreatestOddDivisorRecursively(n);
        System.out.println(recursiveResult);
    }

    private static int calculateGreatestOddDivisorIteratively(int n) {
        for (int i = n - 1; i >= 1; i--) {
            if (n % i == 0 && i % 2 != 0) {
                return i;
            }
        }

        return 1;
    }

    private static int calculateGreatestOddDivisorRecursively(int n) {
        if (n == 1) {
            return 1;
        }

        if (n % 2 == 0) {
            return calculateGreatestOddDivisorRecursively(n / 2);
        } else {
            return n;
        }
    }
}
