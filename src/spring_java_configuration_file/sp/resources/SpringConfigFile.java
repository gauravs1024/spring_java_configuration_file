package spring_java_configuration_file.sp.resources;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring_java_configuration_file.Student;
@Configuration
public class SpringConfigFile {
	// you can access the class by @Bean but in this way you have to pass the object file in the
	//in the getBean("class_file_name.class")
//	@Bean
//	public  Student StudId() {
//		Student std= new Student();
//		std.setName("Gaurav");
//		std.setRollno(20);
//		std.setEmail("gauravs1024@gmail.com");
//		return std;
//	}
		
	// There is a another way you can access the class in which you can modify the annotation
		
		@Bean("stdobj2")
		public  Student StudId2() {
			Student std= new Student();
			std.setName("Amit");
			std.setRollno(89);
			std.setEmail("Amit123@gmail.com");
			return std;
	}
		@Bean("stdobj3")
		public  Student StudId3() {
			Student std= new Student();
			std.setName("Nisha");
			std.setRollno(21);
			std.setEmail("Nisha123@gmail.com");
			return std;
	}
}
