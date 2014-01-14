package fizzbuzz;

public class FizzBuzz {

    public static final int MODULE_BUZZ = 5;
    public static final int MODULE_FIZZ = 3;

    public static String say(int number) {
        String result = "";
        result = notSayNumber(number);
        result = sayNumberWhenTextIsEmpty(number, result);
        return result;
    }

    private static String notSayNumber(int number) {
        String text = sayFizz(number);
        text += sayBuzz(number);
        return text;
    }

    private static String sayNumberWhenTextIsEmpty(int number, String text) {
        if (text.equals(""))
            text = String.valueOf(number);
        return text;
    }

    private static String sayBuzz(int number) {
        String text = "";
        if (isModule(number, MODULE_BUZZ))
            text += "Buzz";
        return text;
    }

    private static String sayFizz(int number) {
        String text = "";
        if (isModule(number, MODULE_FIZZ))
            text += "Fizz";
        return text;
    }

    private static boolean isModule(int number, int module) {
        return (number != 0 && number % module == 0);
    }
}
