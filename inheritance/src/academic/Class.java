package academic;

import java.util.*;

import actor.Lecturer;
import actor.Student;

public class Class {
	private String classCode;
	private int semester;
	private String tahun;
	private List<Course> courses = new ArrayList<>();
	private List<Student> students = new ArrayList<>();
	private Map<Course, Lecturer> courseLecturerMap = new HashMap<>();
	
	public Class(String classCode, int semester, String tahun) {
		this.classCode = classCode;
		this.semester = semester;
		this.tahun = tahun;
	}
	
	public void addCourse(Course course) {
		courses.add(course);
	}

	public void addStudent(Student student) {
		students.add(student);
		// masukin daftar matkul ke akun student buat itung credit/total sks
		for(Course course: courses) {
			student.addCourseToStudent(course);
		}
	}

	public void addLecturer(Lecturer lecturer, Course course) {
		courseLecturerMap.put(course, lecturer);
		// masukin daftar matkul ke akun lecturer
		lecturer.addCourse(course);
	}  

	public void attend(IAttendant attendant) {
		attendant.attend();
	}

	public void takeAttendance(IAttendee attendee) {
		attendee.takeAttendance();
	}

	public void showTodayAttendance() {
		System.out.println("TODAY ATTENDANCE");
		for(Student student:students) {
			System.out.println("- "+student.getName());
		}
	}
	
}
