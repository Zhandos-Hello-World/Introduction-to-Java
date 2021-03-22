package com.company;

public class Main {

    public static void main(String[] args) {
        Course p33 = new Course("E");
        p33.addStudent("person1");
        p33.addStudent("person2");
        p33.addStudent("person3");
        p33.addStudent("person4");
        Display(p33);
        p33.dropStudent("person1");
        Display(p33);
        p33.clear();
        Display(p33);
        }
    public static void Display(Course course){
        for(String str:course.getStudents()){
            System.out.println(str);
        }
        System.out.println("-------------");
    }
}
