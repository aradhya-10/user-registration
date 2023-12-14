import static org.junit.jupiter.api.Assertions.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestEmailValidation {

    // UC9: testing with all sample strings
    // UC11: validate multiple entries
    // Already done, adding a few invalid emails
    @ParameterizedTest
    @ValueSource(strings = {
            "abc@yahoo.com",
            "abc-100@yahoo.com",
            "abc.100@yahoo.com",
            "abc111@abc.com",
            "abc-100@abc.net",
            "abc.100@abc.com.au",
            "abc@1.com",
            "abc@gmail.com.com",
            "abc+100@gmail.com",
            "abc.21.@gmail.com",
            "aradhya@abc@gmail.com",
    })
    public void testEmails(String email) {
        String emailRegex = "^[a-zA-Z0-9.$&%_+-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z]{2,})+$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        assertTrue(matcher.matches());
    }

    // UC10: testing all other fields
    @ParameterizedTest
    @ValueSource(strings = { "aradhya", "Aradhya", "Ar", "ara", "Abc" })
    public void testNames(String name) {
        String nameRegex = "^[A-Z][a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(nameRegex);
        Matcher matcher = pattern.matcher(name);
        assertTrue(matcher.matches());
    }

    @ParameterizedTest
    @ValueSource(strings = { "91 9123456789", "+91912345678", "6394972187", "+9123456789", "91234 56789" })
    public void testPhoneNumbers(String phone) {
        String phoneRegex = "^[0-9]{1,4} [0-9]{5,15}$";
        Pattern pattern = Pattern.compile(phoneRegex);
        Matcher matcher = pattern.matcher(phone);
        assertTrue(matcher.matches());
    }

    @ParameterizedTest
    @ValueSource(strings = { "Password", "password12", "Password12", "Password@12", "pass@12" })
    public void testPassword(String pasword) {
        String passwordRegex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[^A-Za-z\\d]).{8,}$";
        Pattern pattern = Pattern.compile(passwordRegex);
        Matcher matcher = pattern.matcher(pasword);
        assertTrue(matcher.matches());
    }
}

//Tests passed only for valid inputs