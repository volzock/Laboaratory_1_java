public class Primes {
    // проверка числа на простоту
    public static boolean isPrime(int n) {
        for (int i = 2; i < n / 2; ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // метод, с которого начинается испольнение программы
    public static void main(String[] args) {
        for (int i = 2; i < 100; ++i) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}