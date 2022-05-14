package com.github.wellwineo.unittestlesson;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void emailValidation_IsCorrect() {
        assertTrue(Utilities.IsEmailValid("email@example.com"));
    }

    @Test
    public void passwordValidation_IsCorrect() {
        assertTrue(Utilities.IsPasswordValid("Pass_word123!&"));
    }

    @Test
    public void passwordValidation_IsMatchesAndCorrect() {
        assertFalse(Utilities.IsPasswordValidAndMatches("Pass_word123", "Pass_w0rd123"));
    }
}