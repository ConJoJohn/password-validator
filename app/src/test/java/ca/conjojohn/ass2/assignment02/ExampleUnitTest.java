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
        assertEquals(MainActivity.passwordValidator("PasSword"), "Password cannot be \"password\"!");
        assertEquals(MainActivity.passwordValidator("1"), "Password must be at least 8 characters!");
    }

    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
}