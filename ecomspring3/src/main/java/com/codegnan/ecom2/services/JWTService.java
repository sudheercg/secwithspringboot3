package com.codegnan.ecom2.services;

import java.util.Map;

import org.springframework.security.core.userdetails.UserDetails;

public interface JWTService {

	public String extractUserName(String token);

	public String generateToken(UserDetails userDetails);

	public boolean isTokenValid(String token, UserDetails userDetails);

	public String generateRefreshToken(Map<String, Object> extractClaims, UserDetails userDetails);

}
