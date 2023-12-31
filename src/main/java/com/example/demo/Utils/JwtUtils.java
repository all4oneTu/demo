package com.example.demo.Utils;

import com.example.demo.Entity.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class JwtUtils {
    private static final String SUBJECT = "exam";
    private static final long EXPIRE = 1000 * 60 * 60 * 24;

    private static final String APP_SECRET = "liangshanguang";

    public static String genJsonWebToken(User user) {
        if (user == null || user.getUserId() == null || user.getUserUsername() == null || user.getUserAvatar() == null) {
            return null;
        }
        return Jwts.builder().setSubject(SUBJECT)
                .claim("id", user.getUserId())
                .claim("username", user.getUserUsername())
                .claim("avatar", user.getUserAvatar())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRE))
                .signWith(SignatureAlgorithm.HS256, APP_SECRET)
                .compact();
    }
    public static Claims checkJWT(String token) {
        try {
            return Jwts.parser().setSigningKey(APP_SECRET).parseClaimsJws(token).getBody();
        } catch (Exception e) {
            return null;
        }
    }
}
