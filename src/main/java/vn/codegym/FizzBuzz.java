package vn.codegym;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (anhnb (anhnbt.it@gmail.com))
 * Date: 2024/09/18
 * Time: 14:23 PM
 */
public class FizzBuzz {

    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public static String translate(int number) {
        if (isFizz(number) && isBuzz(number)) {
            return FIZZ_BUZZ;
        } else if (isFizz(number)) {
            return FIZZ;
        } else if (isBuzz(number)) {
            return BUZZ;
        }
        return String.valueOf(number);
    }

    private static boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    private static boolean isFizz(int number) {
        return number % 3 == 0;
    }
}
