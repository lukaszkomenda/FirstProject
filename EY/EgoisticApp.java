package EY;

import java.math.BigInteger;

class EgoisticApp {
    public static boolean isEgoistic(String N) {
        BigInteger number = BigInteger.valueOf(Long.parseLong(N));
        BigInteger powerNumber = number.pow(2);

        String lastDigitPowerNumber = "" + powerNumber;

        return N.substring(N.length() - 1)
                .equals(lastDigitPowerNumber.substring(lastDigitPowerNumber.length() - 1));

    }
}
