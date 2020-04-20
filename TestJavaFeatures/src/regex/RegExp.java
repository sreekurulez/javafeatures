package regex;
import java.util.regex.*;

public class RegExp {
    public static void main(String args[]){

        Pattern regex = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
        Matcher mobileMatcher = regex.matcher("881-123-3333");
        System.out.println(mobileMatcher.matches());
    }
}
