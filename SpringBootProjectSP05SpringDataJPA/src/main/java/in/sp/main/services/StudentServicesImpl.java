package in.sp.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.main.entities.Student;
import in.sp.main.reposetory.StudentReposetory;

@Service
public class StudentServicesImpl implements StudentServices {
	
	
	@Autowired
	private StudentReposetory studentReposetory;
	

	@Override
	public boolean addStudentDetails(Student std) {
		boolean status = false;
		try {
			studentReposetory.save(std);
			status = true;
		} 
		catch (Exception e) {
			e.printStackTrace();
			status = false;
		}
		return status;
	}

	
	@Override
	public List<Student> getAllStdDetails() {
		
		return studentReposetory.findAll();
	}


	@Override
	public Student getStdDetails(long id) {
		Optional<Student> optional = studentReposetory.findById(id);
		
		if(optional.isPresent())
		{
			return optional.get();
		}
		else {
			return null;
		}
	}


	@Override
	public boolean updateStdDetails(long id, float marks) {
		
		Student std = getStdDetails(id);
		
		if(std != null)
		{
			std.setMarks(marks);
			studentReposetory.save(std);
			return true;
		}
		return false;
	}


	@Override
	public boolean deleteStdDetails(long id) {
		boolean status = false;
		try {
			studentReposetory.deleteById(id);
			status = true;
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			status = false;
		}
		return status;
	}
	
}
