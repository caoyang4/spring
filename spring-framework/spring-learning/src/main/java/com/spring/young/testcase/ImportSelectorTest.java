package com.spring.young.testcase;

import com.spring.young.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author caoyang
 * @create 2023-10-12 10:38
 */
public class ImportSelectorTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		String[] definitionNames = context.getBeanDefinitionNames();
		Arrays.stream(definitionNames).forEach(System.out::println);
	}

}
