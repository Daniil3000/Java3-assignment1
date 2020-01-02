package assignment1.model;

public class Student1 {
	private Integer studentNumber;
	private String name;
	
	public Integer getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(Integer studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Student1(Integer stdNo, String stdName) {
		this.studentNumber = stdNo;
		this.name = stdName;
	}
	
	public Student1() {}

}
