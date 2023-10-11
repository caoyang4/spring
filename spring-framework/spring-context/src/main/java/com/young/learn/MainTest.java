package com.young.learn;

import com.young.learn.config.Config;
import com.young.learn.dao.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author caoyang
 * @create 2023-10-11 20:02
 */
public class MainTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		User user = context.getBean(User.class);
		System.out.println(user);

	}

}
