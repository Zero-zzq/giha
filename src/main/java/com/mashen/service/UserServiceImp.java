package com.mashen.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mashen.dao.IUserDao;
import com.mashen.model.User;

@Transactional(rollbackFor=java.lang.Exception.class)
@Service(value="userServiceImp")
public class UserServiceImp implements IUserService {
	@Resource(name="userDaoImp")
	private IUserDao userDao;
	
	public void add() {
		User user = new User();
		user.setId("1");
		user.setName("zzq");
		userDao.add(user);
	}

}
