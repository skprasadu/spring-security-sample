package com.hackerrank.springsecurity.dto;

import java.util.List;

public class Course {
    private int courseId;
    private String courseName;
    private String nameOfInstructor;
    private String roomNumber;
    private List<String> prerequisites;

    public Course() {
    }

    public Course(int courseId, String courseName, String nameOfInstructor, String roomNumber, List<String> prerequisites) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.nameOfInstructor = nameOfInstructor;
        this.roomNumber = roomNumber;
        this.prerequisites = prerequisites;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getNameOfInstructor() {
        return nameOfInstructor;
    }

    public void setNameOfInstructor(String nameOfInstructor) {
        this.nameOfInstructor = nameOfInstructor;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public List<String> getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(List<String> prerequisites) {
        this.prerequisites = prerequisites;
    }
}
