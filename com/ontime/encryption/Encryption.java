package com.ontime.encryption;
import java.util.Base64;

public class Encryption {

    public static String encryptPassword(String password){

        //encoding instructions
        return Base64.getEncoder().encodeToString(password.getBytes());
    }

    public static String decryptPassword(String encryptedPassword){
        String decryptedPassword = new String(Base64.getMimeDecoder().decode(encryptedPassword));
        //decoding instructions
        return (decryptedPassword);
    }

}
