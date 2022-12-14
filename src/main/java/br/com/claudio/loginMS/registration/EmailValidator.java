package br.com.claudio.loginMS.registration;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class EmailValidator implements Predicate<String> {

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^(?=.{1,64}@)[\\\\p{L}0-9_-]+(\\\\.[\\\\p{L}0-9_-]+)*@[^-][\\\\p{L}0-9-]+(\\\\.[\\\\p{L}0-9-]+)*(\\\\.[\\\\p{L}]{2,})$");

    @Override
    public boolean test(String email) {
//        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
//        return matcher.matches();
        return true;
    }


}
