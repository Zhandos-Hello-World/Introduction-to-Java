package com.company;
import java.util.ArrayList;
public class Course {
    private String courseName;;
    private ArrayList<String> students = new ArrayList<>();
    private int numberOfStudents;


    public Course(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(String student){
        students.add(student);
        numberOfStudents++;
    }

    public ArrayList<String> getStudentsArrayList(){
        return students;
    }
    public String[] getStudents(){
        String []arr = new String[students.size()];
        for(int i = 0; i < students.size(); i++){
            arr[i] = students.get(i);
        }
        return arr;
    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }

    public String getCourseName(){
        return courseName;
    }
    public void dropStudent(String student){
        students.remove(student);
    }
    public void clear(){
        students.clear();
    }
}

