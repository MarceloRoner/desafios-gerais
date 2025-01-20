public class LargestPrimeFactor {
    public static void main(String[] args) {
        long number = 600851475143L;
        long largestPrime = 0;

        for (long i = 2; i <= number; i++) {
            while (number % i == 0) {
                largestPrime = i;
                number /= i;
            }
        }

        System.out.println("O maior fator primo de 600851475143 é: " + largestPrime);
    }
}
