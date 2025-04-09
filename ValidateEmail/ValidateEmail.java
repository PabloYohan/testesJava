package ValidateEmail;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidateEmail {

  public static boolean validaEmail(String email) {
    String regex = "^[\\w\\.-]+@[\\w\\.-]+\\.\\w+$";

    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(email);
    return matcher.find();
  }
}
