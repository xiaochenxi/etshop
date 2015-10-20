package cn.bbs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.bbs.dao.LoginLogDAO;
import cn.bbs.model.LoginLog;
import cn.bbs.service.LoginLogService;

@Service
public class LoginLogServiceImpl implements LoginLogService {
	
	private LoginLogDAO loginLogDAO;
	public void insertLoginLog(LoginLog log) {
		// TODO Auto-generated method stub
		
	}
	
	@Autowired
	public LoginLogDAO getLoginLogDAO() {
		return loginLogDAO;
	}
	public void setLoginLogDAO(LoginLogDAO loginLogDAO) {
		this.loginLogDAO = loginLogDAO;
	}
	
	
}
