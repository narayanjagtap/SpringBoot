package in.sp.main.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.main.beans.Student;

@Configuration
public class AppConfig {
	@Bean
	public CommandLineRunner cmdLineRunner() {
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				// TODO Auto-generated method stub
				System.out.println("----------------------");
				stdBean1().displayStdDetails();
				System.out.println("----------------------");
				stdBean2().displayStdDetails();
				System.out.println("----------------------");
			}
		};
	}

	@Bean
	public Student stdBean1() {
		return new Student("Narayan Jagtap", 10, 90);
	}
	
	@Bean
	public Student stdBean2() {
		return new Student("Narayan Jagtap", 10, 90);
	}
}
