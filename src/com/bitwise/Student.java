package com.bitwise;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Student {
	private static int rollNo = 100; //rollNo start from 100
	private String firstName;
	private String lastName;
	private String date;

	public Student(String firstName, String lastName, String date) {
		this.firstName = firstName;
		this.lastName = lastName;
		setDate(date);
		rollNo++; //rollNo get increment by 1
	}

	public static int getRollNo() {
		return rollNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getDate() {
		return date;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	private void setDate(final String date) {
		if (dateValidation(date) == true) {
			System.out.println("Date is valid");
			this.date = date;
		} else {
			System.out.println("Date is invalid");
		}
	}

	private static boolean dateValidation(String date) {
		boolean status = false;
		if (checkDate(date)) {
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			dateFormat.setLenient(false);
			try {
				dateFormat.parse(date);
				status = true;
			} catch (Exception e) {
				status = false;
			}
		}
		return status;
	}

	static boolean checkDate(String date) {
		String pattern = "(0?[1-9]|[12][0-9]|3[01])\\/(0?[1-9]|1[0-2])\\/([0-9]{4})";
		boolean flag = false;
		if (date.matches(pattern)) {
			flag = true;
		}
		return flag;
	}
}
