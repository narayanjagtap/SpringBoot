package in.sp.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sp.main.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	//now here all cruid operation methods are available here due to JpaReposetory Interface.
	User findByEmail (String email);
}
