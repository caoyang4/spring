package com.young.learn.config;

import com.young.learn.dao.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author caoyang
 * @create 2023-10-11 19:58
 */
@Configuration
public class Config {

	@Bean
	public User getUser(){
		User user = new User();
		user.setAge(18);
		user.setName("young");
		return user;
	}

}
