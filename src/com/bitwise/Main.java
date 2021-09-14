package com.bitwise;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start a new Project");
        Student student = new Student("Akshay", "Pokharkar","30/12/2019");
        Course course = new Course(1,Courses.SCINECECOURSE,1000);
        System.out.println(student.getDate());
    }
}
