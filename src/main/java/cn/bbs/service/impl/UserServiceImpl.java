package cn.bbs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.bbs.dao.UserDAO;
import cn.bbs.model.User;
import cn.bbs.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private UserDAO userDAO;
	public int getMatchCount(String userName, String password) {
		// TODO Auto-generated method stub
		return 0;
	}

	public User findUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateLoginInfo(User user) {
		// TODO Auto-generated method stub
		
	}
	
	@Autowired
	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	
}
