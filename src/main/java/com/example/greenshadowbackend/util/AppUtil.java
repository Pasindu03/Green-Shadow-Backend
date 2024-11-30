package com.example.greenshadowbackend.util;

import org.springframework.data.geo.Point;

import java.util.Base64;
import java.util.UUID;

public class AppUtil {
    public static String generateUserId(){
        return "USERID-" + UUID.randomUUID();
    }

    public static String generatePictureToBase64(byte [] Picture){
        return Base64.getEncoder().encodeToString(Picture);
    }

    public static Point convertToPoint(String fieldLocation) {
        try {
            String[] parts = fieldLocation.split(",");
            int x = Integer.parseInt(parts[0].trim());
            int y = Integer.parseInt(parts[1].trim());
            return new Point(x, y);
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid fieldLocation format. Expected format: 'x,y'");
        }
    }
}
