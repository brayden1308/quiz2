package com.example.quiz2.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;

@Service
public class JwtService {

    private final Key key = Keys.hmacShaKeyFor(
            "mi_clave_secreta_super_segura_1234567890".getBytes()
    );
  //jwt funcional
    public String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username) // ✔ correcto
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60))
                .signWith(key)
                .compact();
    }
}