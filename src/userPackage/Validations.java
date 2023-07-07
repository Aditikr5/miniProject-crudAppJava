package userPackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validations {

        //function to check if the mobile number is valid or not
        public static boolean isValidMobileNo(String str) {
        //(0/91): number starts with (0/91)
        //[7-9]: starting of the number may contain a digit zero to nine
        //[0-9]: then contains digits 0 to 9
            Pattern pattern = Pattern.compile("(0/91)?[7-9][0-9]{9}");
        //the matcher() method creates a matcher that will match the given input against this pattern
            Matcher match = pattern.matcher(str);
        //returns a boolean value
            return (match.find() && match.group().equals(str));
        }

    //function to check if the email is valid or not
    public static boolean isValidEmail(String emailAddress) {
        return Pattern.compile("^(.+)@(\\S+)$")
                .matcher(emailAddress)
                .matches();
    }


}
