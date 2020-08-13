package CodeWars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
    public static boolean isHexNumber(String s) {
        // your code here

        boolean b = false;

        if (s != null){
            Pattern p = Pattern.compile("^(0x)?[\\dA-Fa-f]+$");
            Matcher m = p.matcher(s);
            b = m.matches();
        }
        return b;
    }
}
