package com.exam.service;

import java.util.*;

import com.exam.model.User;
import com.exam.model.UserRole;

public interface UserService {

	public User createUser(User user, Set<UserRole> userRoles) throws Exception;

	public User getUser(String username);

	public void deleteById(Long userId);

}
