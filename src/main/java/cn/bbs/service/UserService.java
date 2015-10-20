package cn.bbs.service;

import cn.bbs.model.User;

public interface UserService {
	
	
	int getMatchCount(String userName,String password);
	
	User findUserByUserName(String userName);

	
	void updateLoginInfo(User user);
}
