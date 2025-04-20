package in.sp.main.reposetores;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sp.main.entity.User;

public interface UserReposetory extends JpaRepository<User, Integer> {
	//in this interface shows no. of methods due to JpaRepository<T, ID> → Provides full CRUD operations, pagination, and sorting.
	
}
