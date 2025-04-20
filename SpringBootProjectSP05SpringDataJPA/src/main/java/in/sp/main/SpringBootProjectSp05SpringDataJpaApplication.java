package in.sp.main;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.sp.main.entities.Student;
import in.sp.main.services.StudentServices;
import in.sp.main.services.StudentServicesImpl;

@SpringBootApplication
public class SpringBootProjectSp05SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootProjectSp05SpringDataJpaApplication.class, args);
		StudentServices stdService = context.getBean(StudentServicesImpl.class);

		// ----------Insert Operation------------
//		Student std = new Student();
//		std.setName("Narayana");
//		std.setRollno(102);
//		std.setMarks(99.99f);
//		
//		boolean status = stdService.addStudentDetails (std);
//		
//		if(status)
//		{
//		System.out.println("Student inserted successfully");
//		}
//		else
//		{
//		System.out.println("Student not inserted due to some error");
//		}
		
		

		// --------Select Operation 1----------
//		List<Student> stdList = stdService.getAllStdDetails();
//		
//		for (Student std: stdList) 
//		{
//			System.out.println("Id: "+std.getId());
//			System.out.println("Name : "+std.getName());
//			System.out.println("Rollno: "+std.getRollno());
//			System.out.println("Marks: "+std.getMarks());
//			
//			System.out.println("---------------------------------");
//		}

		// --------Select Operation 2----------
//		Student std = stdService.getStdDetails(1L);
//		
//		System.out.println("Id: "+std.getId());
//		System.out.println("Name : "+std.getName());
//		System.out.println("Rollno: "+std.getRollno());
//		System.out.println("Marks: "+std.getMarks());

		
		
//		//----------update operation--------
//		boolean status = stdService.updateStdDetails(1L, 80.7f);
//		
//		if (status) {
//			System.out.println("Student details Updated successfully...");
//		}
//		else {
//			System.out.println("Student details are not updated");
//		}
		
		

		// ----------update operation--------
		boolean status = stdService.deleteStdDetails(1L);

		if (status) {
			System.out.println("Student details Deleted successfully...");
		} else {
			System.out.println("Student details are not Delete due to some error");
		}
	}
}
