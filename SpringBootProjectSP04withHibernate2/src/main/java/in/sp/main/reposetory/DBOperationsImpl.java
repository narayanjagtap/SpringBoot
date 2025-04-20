package in.sp.main.reposetory;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import in.sp.main.config.HibernateConfig;
import in.sp.main.entities.User;

@Repository
public class DBOperationsImpl implements DBOperations {

	@Override
	public User getUserDetails(Long id) {
		User user = null;
		try (
				Session session = HibernateConfig.getSessionFactory().openSession();
				)
		{
			user = session.get(User.class, id);
		} 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return user;
	}

}
