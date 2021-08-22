package controller;

import dao.CourseDAO;
import dao.impl.CourseDAOImpl;
import model.Course;

public class CourseController {

	public static void main(String[] args) {
		
		CourseDAO cdao= new CourseDAOImpl();
		
		Course course= new Course(114,"Python Programming","Programming Language","399","Python.mp4");
		
		cdao.saveCourse(course);
		System.out.println("Inserted Successfully");
	}

}
