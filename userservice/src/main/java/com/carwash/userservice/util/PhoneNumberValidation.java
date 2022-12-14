package com.carwash.userservice.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidation {

    public static boolean isValidMobileNo(String str) {
        Pattern ptrn = Pattern.compile("(0/91)?[6-9][0-9]{9}");
        Matcher match = ptrn.matcher(str);
        return (match.find() && match.group().equals(str));
    }
}