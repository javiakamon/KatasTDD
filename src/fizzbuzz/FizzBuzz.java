package fizzbuzz;

public class FizzBuzz {

    public static final int MODULE_BUZZ = 5;
    public static final int MODULE_FIZZ = 3;

    public static String say(int number) {
        String result = "";
        result = notSayNumber(number, result);
        result = sayNumber(number, result);
        return result;
    }

    private static String notSayNumber(int number, String result) {
        result = sayFizz(number, result);
        result = sayBuzz(number, result);
        return result;
    }

    private static String sayNumber(int number, String text) {
        if (text == "")
            text = String.valueOf(number);
        return text;
    }

    private static String sayBuzz(int number, String text) {
        if (isModule(number, MODULE_BUZZ))
            text += "Buzz";
        return text;
    }

    private static String sayFizz(int number, String text) {
        if (isModule(number, MODULE_FIZZ))
            text += "Fizz";
        return text;
    }

    private static boolean isModule(int number, int module) {
        return (number % module == 0);
    }
}
