package actor;

import academic.Course;
import academic.IAttendant;
import java.util.*;
public class Student extends Person implements IAttendant{
	private List<Course> courses = new ArrayList<>();

	public Student(String nim,String name,String dob) {
		super(name, dob);
	}
	
	@Override
	public void attend() {
        System.out.println("Student " + name + " has attended.");
    }
	
	public void showCredits(int semester) {
//        System.out.println("Credits for " + name + " in semester " + semester + ": 2");
		System.out.println(name + "'s credit: ");
		int total = 0;
		for(Course course: courses) {
			if (course.getCredit() == semester) {
				System.out.println(" - "+course.getCourseName()+" ("+course.getCourseCode()+")");
				total += course.getCredit();
			}
		}
		System.out.println("Total credit: "+ total);
	}
	
	public void addCourseToStudent(Course course) {
		courses.add(course);
	}
	
}
