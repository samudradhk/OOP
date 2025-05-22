package actor;

import academic.Course;
import academic.IAttendee;
import java.util.*;


public class Lecturer extends Person implements IAttendee{
	private String codeLec;
	private List<Course> courses = new ArrayList<>();
	
	
	public Lecturer(String codeLec, String name, String dob) {
		super(name, dob);
		this.codeLec = codeLec;
	}

	@Override
	public void takeAttendance() {
		System.out.println("Lecturer " + name + " took today's attendance.");
	}
	
	public void addCourse(Course course) {
		courses.add(course);
	}
	public void showCourse(int semester) {
        System.out.println("Lecture "+name+" teaching: ");
        int total = 0;
        for(Course course: courses) {
        	System.out.println(" -"+course.getCourseName()+ " ("+course.getCourseCode()+")");
        	total += course.getCredit();
        }
        System.out.println("Total credit this semester: "+total);
    }
}
