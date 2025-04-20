package in.sp.main;

import java.io.ObjectInputFilter.Config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.sp.main.entities.User;

@SpringBootApplication
public class SpringBootProjectSp04withHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectSp04withHibernateApplication.class, args);
		
		Configuration cfg = new Configuration();
		cfg.configure("/in/sp/main/config/hibernate.cfg.xml");
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		//Transaction transaction = session.beginTransaction();
			//for getting data from database there is no need for "Transaction"
		
		try {
			User user = session.get(User.class, 1L);
			
			if (user != null) {
				System.out.println(user.getName());
				System.out.println(user.getEmail());
			}else{
				System.out.println("User NOT found");
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("DATA ARE DO NOT FETCH DUE TO SOME ERROR");
		}
	}

}
	