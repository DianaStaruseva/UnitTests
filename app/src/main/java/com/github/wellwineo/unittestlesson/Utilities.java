package com.github.wellwineo.unittestlesson;

import android.util.Patterns;

import java.util.regex.Pattern;

public class Utilities {
    public static boolean IsEmailValid(String email) {
        return Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
                Pattern.CASE_INSENSITIVE)
                .matcher(email).find();
    }

    public static boolean IsPasswordValid(String password) {
        Pattern pattern = Pattern.compile(
                "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$"
        );

        return pattern.matcher(password).matches();
    }

    public static boolean IsPasswordValidAndMatches(String password1, String password2) {
        return password1.equals(password2) && IsPasswordValid(password1);
    }

}
