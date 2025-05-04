package com.rent.video.system.services;

import com.rent.video.system.exchnage.GetUserLoginRequest;
import io.jsonwebtoken.*;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Date;
import java.util.Map;
import java.util.function.Function;

@Service
public class JwtService {

    @Value("${app.jwtSecret}")
    private String jwtSecret;

    // Generate JWT Token
    public String generateToken(Map<String, Object> extraClaims, String loginemail) {
        return Jwts.builder()
                .claims(extraClaims)
                .subject(loginemail)
                .issuedAt(new Date(System.currentTimeMillis()))
                .expiration(new Date(System.currentTimeMillis() + 86400000)) // 1 day
                .signWith(getSignKey())
                .compact();
    }

    // Validate token
    public boolean isTokenValid(String token, String email) {
        final String username = extractUserName(token);
        return (username.equals(email)) && !isTokenExpired(token);
    }

    // Extract username (subject)
    public String extractUserName(String token) {
        return extractClaim(token, Claims::getSubject);
    }

    // Extract expiration date
    public Date extractExpirationDate(String token) {
        return extractClaim(token, Claims::getExpiration);
    }

    // Generic claim extractor
    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }

    // Extract all claims
    private Claims extractAllClaims(String token) {
        return Jwts.parser().verifyWith((SecretKey) getSignKey()).build().parseSignedClaims(token).getPayload();
    }

    // Check token expiration
    private boolean isTokenExpired(String token) {
        return extractExpirationDate(token).before(new Date());
    }

    // Get Signing Key
    private Key getSignKey() {
        byte[] keyBytes = jwtSecret.getBytes(StandardCharsets.UTF_8);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}
