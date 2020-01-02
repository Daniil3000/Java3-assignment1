package assignment1.model;

public class Teacher {
	private String name;
	private Student1 std1;
	private Student2 std2;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Student1 getStd1() {
		return std1;
	}

	public void setStd1(Student1 std1) {
		this.std1 = std1;
	}

	public Student2 getStd2() {
		return std2;
	}

	public void setStd2(Student2 std2) {
		this.std2 = std2;
	}
	
	public Teacher() {}
	
	public Teacher(String name) {
		this.name = name;
	}
	
	public String getTeacherInfo() {
		return this.name;
	}
	
	public String getStudentInfo() {
		return "1st student: student number: " + this.std1.getStudentNumber() + ", name: " + this.std1.getName() + ";\n2nd student: student number: " + this.std2.getStudentNumber() + ", name: " + this.std2.getName() + ".";
	}

}
