package assignment1.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import assignment1.model.Teacher;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("mybeans.xml");
		
		Teacher teacher = (Teacher)context.getBean("teacherBean");
		// Teacher's info
		System.out.println("Teacher name is " + teacher.getTeacherInfo());
		// Information about teacher's students
		System.out.print(teacher.getStudentInfo());
		
		((ClassPathXmlApplicationContext)(context)).close();
	}
}
