package Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring_java_configuration_file.Student;
import spring_java_configuration_file.sp.resources.SpringConfigFile;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context =new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		// 1st way to access the object
//		Student std=(Student)context.getBean("StudId");
//		std.disp();
//		
//		// 2nd way to access the object
//		
//		Student std2=context.getBean(Student.class);
//		std2.disp();
		
		//3rd way to access the object
		Student std3=(Student)context.getBean("stdobj2");
		std3.disp();
		
		Student std4=(Student)context.getBean("stdobj3");
		std4.disp();
		
	}
}
