package PasswordHash;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class GivenHashPasswordWithSalt {

    public static void main(String[] args) throws Exception {
        String password = "I love Java";

        String hashPassword = givenPasswordWithHash(password);
        String hashPasswordWithSalt = givenPasswordWithHashAndSalt(password);

        System.out.println(hashPassword);
        System.out.println(hashPasswordWithSalt);
    }

    public static String givenPasswordWithHash (String password) throws NoSuchAlgorithmException {

        MessageDigest m = MessageDigest.getInstance("MD5");
        m.reset();
        m.update(password.getBytes());
        byte[] digest = m.digest();
        BigInteger bigInt = new BigInteger(1,digest);
        String hashPassword = bigInt.toString(16);

        while (hashPassword.length() < 32){
            hashPassword = "0" + hashPassword;
        }

        return hashPassword;

    }

    public static String givenPasswordWithHashAndSalt (String password) throws NoSuchAlgorithmException{
        byte[] array = new byte[7];
        new Random().nextBytes(array);

        String salt = new String(array, StandardCharsets.UTF_8);

        String hashPassword = givenPasswordWithHash(password);

        return hashPassword + salt;
    }
}
