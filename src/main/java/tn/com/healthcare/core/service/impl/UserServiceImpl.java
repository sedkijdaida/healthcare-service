package tn.com.healthcare.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.com.healthcare.core.dao.UserDao;
import tn.com.healthcare.core.model.User;
import tn.com.healthcare.core.service.UserService;

@Service("userService")
public class UserServiceImpl extends
		AbstractHealthcareEntityService<User, Long> implements UserService {

	private UserDao userDao;

	@Autowired
	public UserServiceImpl(UserDao userDao) {
		super(userDao);
		this.userDao = userDao;
	}

	public User checkConnection(String login, String password) {
		return userDao.checkConnection(login, password);
	}

}
