package in.sp.main.beans;

public class Student {
	private String name;
	private int rollno;
	private float marks;
	
	public Student(String name, int rollno, float marks) {
		this.name=name;
		this.rollno=rollno;
		this.marks=marks;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	public void displayStdDetails() {
		System.out.println("Name : " + name);
		System.out.println("Roll no : " + rollno);
		System.out.println("Marks : " + marks);
	}
}
