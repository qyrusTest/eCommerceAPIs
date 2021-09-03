package com.example.restservice;

public class TokenGenerator {
	
	private final String Username;
	private final String Password;
	private final String Token;

	public TokenGenerator(String username, String password, String token) {
		this.Username = username;
		this.Password = password;
		this.Token = token;
	}

	public String getUsername() {
		return Username;
	}

	public String getPassword() {
		return Password;
	}
	
	public String getToken() {
		return Token;
	}
	
}
