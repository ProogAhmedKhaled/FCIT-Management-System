/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcitmain;

import java.util.Date;

/**
 *
 * @author AHMED 50070
 */
public class Student extends Person {

    String department;
    int semester;
    double cgpa;
    Teacher teacher;
    Invigilator inviligator;
    Course[] course;
    Courselab[] courselap;
    Date enrollData;
    ExamVenue examvenue;

    public int getTotalCourseHrs() {

        return 0;
    }

    public int getTotalCourseLapHrs() {

        return 0;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Invigilator getInviligator() {
        return inviligator;
    }

    public void setInviligator(Invigilator inviligator) {
        this.inviligator = inviligator;
    }

    public Course[] getCourse() {
        return course;
    }

    public void setCourse(Course[] course) {
        this.course = course;
    }

    public Courselab[] getCourselap() {
      
     
        return courselap;
    }

    public void setCourselap(Courselab[] courselap) {
       
        
        this.courselap = courselap;
    }

    public Date getEnrollData() {
        return enrollData;
    }

    public void setEnrollData(Date enrollData) {
        this.enrollData = enrollData;
    }

    public ExamVenue getExamvenue() {
        return examvenue;
    }

    public void setExamvenue(ExamVenue examvenue) {
        this.examvenue = examvenue;
    }

    public double calTotalHours() {
        return 0;
    }

    public String printStudentBasicInfo() {

      return toString();
    }

    @Override
    public String toString() {
        
        return  " " + "ID: " + getId() + " , Name: " + getName() + " , Nationality: " + getNationality()
                + " , Date of Birth: " + getDateOfBirt() + " , Gender: " + getGender() + " , Phone: " + getPhone()
                + " , Address: " + getAddress()+
                "\n\t\t\t--------------------------------\n"
                + "Department: " + getDepartment() + ", Semester: " + getSemester() + "\nCgpa: " + getCgpa()
                + "\nEnroll Data: " + getEnrollData() +  "\n";
                
 
               
    }

}
