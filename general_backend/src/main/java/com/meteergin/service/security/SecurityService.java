package com.meteergin.service.security;

public interface SecurityService {
	public String findLoggedInUsername();

	public void autologin(String username, String password);
}
