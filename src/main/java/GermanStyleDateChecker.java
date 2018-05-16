import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {
    public static Matcher getMatcher(String dateString) {
        Pattern pat = Pattern.compile("(^([1-2][0-9])|^(0{0,1}[1-9])|^(3(0|1)))(\\.|-| )((1[0-2])|(0{0,1}[1-9]))(\\.|-| )([1-2](0|9)){0,1}[0-9][0-9]$"); 
        Matcher match = pat.matcher(dateString);
        return match;
    }
}
