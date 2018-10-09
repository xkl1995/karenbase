package com.jc.serviceimpl;

import com.jc.dao.UserDao;
import com.jc.service.UserService;

public class UserServiceImpl implements UserService {

	 private UserDao  userdao;
	 
	public UserDao getUserdao() {
		return userdao;
	}

	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		userdao.update();
	}

}
