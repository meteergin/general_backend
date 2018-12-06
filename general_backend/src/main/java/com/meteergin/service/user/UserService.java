package com.meteergin.service.user;

import com.meteergin.model.User;

public interface UserService {

	public void save(User user);

	public User findByUsername(String username);

}
