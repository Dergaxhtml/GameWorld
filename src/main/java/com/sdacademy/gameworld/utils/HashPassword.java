package com.sdacademy.gameworld.utils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashPassword {

    public static String hash(String password) {

        String hashedPassword = null;

        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            byte[] hashInBytes = md.digest(password.getBytes(StandardCharsets.UTF_8));

            StringBuilder sb = new StringBuilder();

            for (byte b : hashInBytes) {
                sb.append(String.format("%02x", b));
            }

            hashedPassword = sb.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return hashedPassword;

    }

}
