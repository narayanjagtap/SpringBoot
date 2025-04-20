package in.sp.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.sp.main.dao.UserDao;
import in.sp.main.entity.User;

@SpringBootApplication 
public class SpringBootProjectSp03JdbcCrudApplication implements CommandLineRunner
{
	@Autowired
	private UserDao userDao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectSp03JdbcCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//----------INSERTION OPERATION------------- 
		
//		User user1 = new User("Narayana", "narayan@gmail.com", "male", "latur");
//		//User user2 = new User("Sagar", "sagar@gmail.com", "male", "Jayphal");
//		boolean status = userDao.insertUser(user1);
//		if (status) {
//			System.out.println("User inserted successfully...");
//		}else {
//			System.out.println("user not inserted due to some error...");
//		}
		
		
		//---------UPDATAION OPERATION 1-----------
		
//		User user = new User("Narayana", "narayan@gmail.com", "male", "Pune");
//		boolean status = userDao.updateUser(user);
//		if(status) {
//		    System.out.println("updation success");
//		} else {
//		    System.out.println("updation failed");
//		}
		
		//-------UPDATION OPERATION 2-------
//		User user = userDao.getUserByEmail("narayan@gmail.com");
//		user.setCity("Pune");
//
//		boolean status = userDao.updateUser(user);
//		if(status)
//		{
//		    System.out.println("updation success");
//		}
//		else
//		{
//		    System.out.println("updation failed");
//		}

		
		
		// --------DELETION OPERATION--------
		
//		boolean status = userDao.deleteUserByEmail("narayan@gmail.com");
//		if(status)
//		{
//		    System.out.println("deletion success");
//		}
//		else
//		{
//		    System.out.println("deletion failed");
//		}
		
		
		// -------SELECT ONE USER-------
		
//		User user = userDao.getUserByEmail("sagar@gmail.com");
//		System.out.println("Name : " + user.getName());
//		System.out.println("Email : " + user.getEmail());
//		System.out.println("Gender : " + user.getGender());
//		System.out.println("City : " + user.getCity());

		
		//-------SELECT ALL USERS-------
		
		List<User> list = userDao.getAllUsers();
		for(User user : list)
		{
		    System.out.println("Name : " + user.getName());
		    System.out.println("Email : " + user.getEmail());
		    System.out.println("Gender : " + user.getGender());
		    System.out.println("City : " + user.getCity());
		    System.out.println("-----------------------");
		}

	}

}
