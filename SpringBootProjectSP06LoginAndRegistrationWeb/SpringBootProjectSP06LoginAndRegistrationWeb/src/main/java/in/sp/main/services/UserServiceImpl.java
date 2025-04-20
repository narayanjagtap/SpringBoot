package in.sp.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.main.entity.User;
import in.sp.main.reposetores.UserReposetory;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired		//Autowired : It reduces manual object creation, improving flexibility and testability.
	private UserReposetory userReposetory;

	
	@Override
	public boolean registerUser(User user) {
	    try {
	    	userReposetory.save(user);
	        return true;
	    } catch (Exception e) {
	        System.out.println("Error during registration: " + e.getMessage());
	        e.printStackTrace();
	        return false;
	    }
	}

	
}
