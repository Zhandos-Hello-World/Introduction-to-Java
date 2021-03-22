package com.company;

public class Course implements Cloneable{
    private String courseName;;
    private String[]students = new String[1];
    private int numberOfStudents;
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public Course(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(String student){
        if(numberOfStudents == students.length){
            String[]temp = new String[students.length + 1];
            for(int i = 0; i < numberOfStudents; i++){
                temp[i] = students[i];
            }
            students = temp;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents(){
        return students;
    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }

    public String getCourseName(){
        return courseName;
    }
    public void dropStudent(String student){
        int q = 0;
        for(int i = 0; i < students.length; i++){
            if(students[i].equals(student)){
                q++;
            }
        }
        int indexTemp = 0;
        String []temp = new String[students.length - q];
        for(int i = 0; i < students.length; i++){
            if(!students[i].equals(student)){
                temp[indexTemp] = students[i];
                indexTemp++;
            }
        }
        students = temp;
    }
    public void clear(){
        students = new String[0];
    }
}

