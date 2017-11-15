package com.askerlap.emad.logintaskprocab.Utilities;

import android.text.TextUtils;
import android.util.Patterns;

/**
 * Created by emad on 10/28/17.
 */

/********************************************************
 *                                                      *
 *This is a utility class to handel any kind of         *
 * validation on data over the whole app                *
 *                                                      *
 * ******************************************************/
public class ValidationChecker {


    //Inner class for Email Validations
    public static class EmailValidation {
        public static boolean isGoodEmail(String email) {
            return Patterns.EMAIL_ADDRESS.matcher(email).matches();
        }

        public static boolean isEmpty(String email) {
            return TextUtils.isEmpty(email);
        }
    }


    //Inner class for Password Validation
    public static class PasswordValidation {

        public static boolean isStrongPassword(String password) {
            if (password.length() >=6)
                return true;
            return false;
        }

        public static boolean isEmpty(String password) {
            return TextUtils.isEmpty(password);
        }
    }

    //Inner class for Username Validation
    public static class UsernameValidation {

        public static boolean isEmpty(String username) {
            return TextUtils.isEmpty(username);
        }
    }


}
