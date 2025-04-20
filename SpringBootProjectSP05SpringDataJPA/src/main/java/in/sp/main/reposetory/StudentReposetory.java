package in.sp.main.reposetory;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sp.main.entities.Student;

public interface StudentReposetory extends JpaRepository<Student, Long> {
	//JpaRepository<T, ID> → Provides full CRUD operations, pagination, and sorting.
	
	
}
