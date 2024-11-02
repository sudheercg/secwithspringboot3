package com.codegnan.ecom2.services;

import com.codegnan.ecom2.dto.JwtAuthenticationResponse;
import com.codegnan.ecom2.dto.RefreshTokenRequest;
import com.codegnan.ecom2.dto.SignInRequest;
import com.codegnan.ecom2.dto.SignUpRequest;
import com.codegnan.ecom2.entities.User;

public interface AuthenticationService {
	
	User signup(SignUpRequest signUpRequest);
	JwtAuthenticationResponse signin(SignInRequest signInRequest);
	JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);

}
