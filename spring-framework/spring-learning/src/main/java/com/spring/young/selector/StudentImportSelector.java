package com.spring.young.selector;

import com.spring.young.dao.Student;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author caoyang
 * @create 2023-10-12 10:36
 */
public class StudentImportSelector implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		System.out.println("调用 StudentImportSelector 的 selectImports 方法获取一批类限定名");
		return new String[]{Student.class.getName()};
	}

}
