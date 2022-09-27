import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Palidrome {

    // функция для переворота строки (абв -> вба)
    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    // функция проверяет является ли строка Палиндромом
    public static boolean isPalidrome(String s) {
        return s.equals(reverseString(s));
    }

    public static void main(String[] args) {
        boolean isAllPalidrome = true;
        for (int i = 0; i < args.length; ++i) {
            if (!isPalidrome(args[i])) {
                isAllPalidrome = false;

            }
        }
        System.out.println(isAllPalidrome);
    }
}