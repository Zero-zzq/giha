package com.mashen.dao;


import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mashen.model.User;

@Repository(value="userDaoImp")
public class UserDaoImp implements IUserDao {
	
	@Resource(name="jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	public void add(User user) {
		String sql = "insert into User(userId,userName) value("+user.getId()+",'"+user.getName()+"')";
		jdbcTemplate.execute(sql);
	}

}
