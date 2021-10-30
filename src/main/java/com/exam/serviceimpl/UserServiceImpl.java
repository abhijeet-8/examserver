package com.exam.serviceimpl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.repo.RoleRepository;
import com.exam.repo.UserRepository;
import com.exam.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userrepository;

	@Autowired
	private RoleRepository rolerepository;

	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
		// TODO Auto-generated method stub

		User local = this.userrepository.findByUsername(user.getUsername());

		if (local != null) {
			System.out.println("user is already available");
			throw new Exception("user is already available");
		}

		else {
			for (UserRole ur : userRoles) {
				rolerepository.save(ur.getRole());
			}
			user.getUserRoles().addAll(userRoles);
			local = userrepository.save(user);
		}
		return local;
	}

	// getting user by username

	@Override
	public void deleteById(Long userId) {
		// TODO Auto-generated method stub
		this.userrepository.deleteById(userId);
	}

	@Override
	public User getUser(String username) {
		// TODO Auto-generated method stub
		this.userrepository.findByUsername(username);
		return null;
	}

}
