package com.codegnan.ecom2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codegnan.ecom2.dto.JwtAuthenticationResponse;
import com.codegnan.ecom2.dto.RefreshTokenRequest;
import com.codegnan.ecom2.dto.SignInRequest;
import com.codegnan.ecom2.dto.SignUpRequest;
import com.codegnan.ecom2.entities.User;
import com.codegnan.ecom2.services.AuthenticationService;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthenticationController {

	private final AuthenticationService authenticationService;

	public AuthenticationController(AuthenticationService authenticationService) {
		this.authenticationService = authenticationService;
	}

	@PostMapping("/signup")
	public ResponseEntity<User> signup(@RequestBody SignUpRequest signupRequest) {
		System.out.println(signupRequest.getFirstName());

		System.out.println(signupRequest.getLastName());

		return ResponseEntity.ok(authenticationService.signup(signupRequest));
	}

	@PostMapping("/signin")
	public ResponseEntity<JwtAuthenticationResponse> signin(@RequestBody SignInRequest signinRequest) {
		System.out.println(signinRequest.getEmail());
		System.out.println(signinRequest.getPassword());

		return ResponseEntity.ok(authenticationService.signin(signinRequest));
	}

	@PostMapping("/refresh")
	public ResponseEntity<JwtAuthenticationResponse> refresh(@RequestBody RefreshTokenRequest requestTokenRequest) {

		return ResponseEntity.ok(authenticationService.refreshToken(requestTokenRequest));
	}

}
