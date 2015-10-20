package cn.bbs.dao;

import cn.bbs.model.User;

public interface UserDAO {
	
	int getMatchCount(String userName,String password);
	
	User findUserByUserName(String userName);

	
	void updateLoginInfo(User user);
}
