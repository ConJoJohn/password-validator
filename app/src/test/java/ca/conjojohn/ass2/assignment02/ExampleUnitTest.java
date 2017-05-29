package ca.conjojohn.ass2.assignment02;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void password_validates() throws Exception {
        assertEquals(MainActivity.passwordValidator("asdfg12345"), "This password is acceptable.");
        assertEquals(MainActivity.passwordValidator("PasSword"), "Password cannot be \"password\" or \"notpassword\"!");
        assertEquals(MainActivity.passwordValidator("nOtPasSword"), "Password cannot be \"password\" or \"notpassword\"!");
        assertEquals(MainActivity.passwordValidator("1"), "Password must be between 8 and 15 characters!");
        assertEquals(MainActivity.passwordValidator("1234567890123456"), "Password must be between 8 and 15 characters!");
        assertEquals(MainActivity.passwordValidator("hellothere"), "Password must contain at least 1 number!");

    }

    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
}