package fizzbuzz;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void oneTriggersOne() {
        //Arrange
        final String expected = "1";
        //Act
        String result = FizzBuzz.say(1);
        //Assert
        assertEquals("not One", expected, result);
    }

    @Test
    public void twoTriggersTwo() {
        //Arrange
        final String expected = "2";
        //Act
        String result = FizzBuzz.say(2);
        //Assert
        assertEquals("not Two", expected, result);
    }

    @Test
    public void answerNumberWithSomeoneNumber() {
        //Arrange
        final String expected = "11";
        //Act
        String result = FizzBuzz.say(11);
        //Assert
        assertEquals("not Eleven", expected, result);
    }

    @Test
    public void threeTriggersFizz() {
        //Arrange
        final String expected = "Fizz";
        //Act
        String result = FizzBuzz.say(3);
        //Assert
        assertEquals("not Fizz", expected, result);
    }

    @Test
    public void fiveTriggersBuzz() {
        //Arrange
        final String expected = "Buzz";
        //Act
        String result = FizzBuzz.say(5);
        //Assert
        assertEquals("not Buzz", expected, result);
    }

    @Test
    public void sixTriggersFizz() {
        //Arrange
        final String expected = "Fizz";
        //Act
        String result = FizzBuzz.say(6);
        //Assert
        assertEquals("not Fizz", expected, result);
    }

    @Test
    public void tenTriggersBuzz() {
        //Arrange
        final String expected = "Buzz";
        //Act
        String result = FizzBuzz.say(10);
        //Assert
        assertEquals("not Buzz", expected, result);
    }

    @Test
    public void fifteenTriggersFizzBuzz() {
        //Arrange
        final String expected = "FizzBuzz";
        //Act
        String result = FizzBuzz.say(15);
        //Assert
        assertEquals("not FizzBuzz", expected, result);
    }

    @Test
    public void thirtyTriggersFizzBuzz() {
        //Arrange
        final String expected = "FizzBuzz";
        //Act
        String result = FizzBuzz.say(30);
        //Assert
        assertEquals("not FizzBuzz", expected, result);
    }
}
