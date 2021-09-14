package com.bitwise;

public class Course {
	int courseId;
	Courses courseName;
	int fees;

	public Course(final int courseId, final Courses courseName, final int fees) {
		this.courseId = courseId;
		this.courseName = courseName;
		setFees(fees);
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(final int courseId) {
		this.courseId = courseId;
	}

	public Courses getCourseName() {
		return courseName;
	}

	public void setCourseName(final Courses courseName) {
		this.courseName = courseName;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(final int fees) {
		if (courseName == Courses.SCINECECOURSE) {
			this.fees = (int) (fees * 0.10);
		} else if (courseName == Courses.ARTSCOURSE) {
			this.fees = (int) (fees * 0.5);
		}else {
			this.fees= fees;
		}
	}
}
