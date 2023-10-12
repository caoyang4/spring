package com.spring.young.definition;

import com.spring.young.dao.Student;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author caoyang
 * @create 2023-10-12 15:27
 */
public class StudentBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
		System.out.println("enter registerBeanDefinitions");
		AbstractBeanDefinition definition = BeanDefinitionBuilder.rootBeanDefinition(Student.class).addPropertyValue("classNumber", "1101").getBeanDefinition();
		registry.registerBeanDefinition("student", definition);
		System.out.println("exit registerBeanDefinitions");

	}
}
