package in.sp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.sp.main.entities.User;
import in.sp.main.reposetory.DBOperations;

@SpringBootApplication
public class SpringBootProjectSp04withHibernateApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootProjectSp04withHibernateApplication.class, args);
		DBOperations dbop = context.getBean(DBOperations.class);
		
		User user = dbop.getUserDetails(1L);
		
		if (user != null) {
			System.out.println(user.getName());
			System.out.println(user.getEmail());
		}else {
			System.out.println("User not found...");
		}
	}

}
	