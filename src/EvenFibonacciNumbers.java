public class EvenFibonacciNumbers {
    public static void main(String[] args) {
        int limit = 4000000;
        int a = 1, b = 2, sum = 0;

        while (b < limit) {
            if (b % 2 == 0) {
                sum += b;
            }
            int temp = b;
            b = a + b;
            a = temp;
        }

        System.out.println("A soma dos números pares na sequência de Fibonacci abaixo de 4 milhões é: " + sum);
    }
}
