/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcitmain;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author O_o
 */
public class FCITManagementSystem {

    static Teacher Teacher = null;
    static Invigilator Inviligator = null;
    static ExamVenue Exam = null;
    static Student Student = null;
    static Courselab Course_Lab = null;
    static Course course = null;

////////////////////////// in this method we read from file and set value in to teacher class ////////////////////////
    public static Teacher getTeacher(Scanner input) {

        Teacher = new Teacher();

        double teachingHours;
        int officeNumber, id, phone, year, month, day;
        Boolean onLeave;
        Date dateOfBirth;
        char gender;

        /// read  fields from file
        String degree = input.next();
        String department = input.next();
        teachingHours = input.nextDouble();
        String jobTitle = input.next();
        officeNumber = input.nextInt();
        onLeave = input.nextBoolean();
        id = input.nextInt();
        String name = input.next();
        String nationality = input.next();
        year = input.nextInt();
        month = input.nextInt();
        day = input.nextInt();
        gender = input.next().charAt(0);
        phone = input.nextInt();
        String address = input.next();

        // set Teacher information 
        Teacher.setDegree(degree);
        Teacher.setDepartment(department);
        Teacher.setTeachingHours(teachingHours);
        Teacher.setJobTitlie(jobTitle);
        Teacher.setOfficeNumber(officeNumber);
        Teacher.setOnLeave(onLeave);
        Teacher.setId(id);
        Teacher.setName(name);
        Teacher.setNationality(nationality);
        dateOfBirth = new Date(year, month, day);
        Teacher.setDateOfBirt(dateOfBirth);
        Teacher.setGender(gender);
        Teacher.setPhone(phone);
        Teacher.setAddress(address);

        /// return teacher that i  set 
        return Teacher;
    }

    //////////// in this method we read from file and set value in to invilgator class and return invilgator /////////////////////
    public static Invigilator getInviligator(Scanner input) {

        Inviligator = new Invigilator();

        // define variables to store info of invilgator
        Boolean onLeave;
        Date dateOfBirth;

        /// read Fields from Fiele 
        int invigilatonExperienceYears = input.nextInt(); // read Number of expirence 
        String invigilatonSkill = input.next(); // read skills
        String jobTitle = input.next(); // read title
        int officeNumber = input.nextInt();
        onLeave = input.nextBoolean();
        int id = input.nextInt();
        String name = input.next();
        String nationality = input.next();
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();
        char gender = input.next().charAt(0);
        int phone = input.nextInt();
        String address = input.next();

        //// Set Fields that  i read from file for invilgator 
        Inviligator.setInviligatonExperience(invigilatonExperienceYears);
        Inviligator.setInvilgatonExpertise(invigilatonSkill);
        Inviligator.setJobTitlie(jobTitle);
        Inviligator.setOfficeNumber(officeNumber);
        Inviligator.setOnLeave(onLeave);
        Inviligator.setId(id);
        Inviligator.setName(name);
        Inviligator.setNationality(nationality);
        dateOfBirth = new Date(year, month, day);
        Inviligator.setDateOfBirt(dateOfBirth);
        Inviligator.setGender(gender);
        Inviligator.setPhone(phone);
        Inviligator.setAddress(address);

        return Inviligator;
    }
//\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\///

    public static ExamVenue getExamVenue(Scanner input) {

        Exam = new ExamVenue();

        // read fields of Exam
        int examvenue = input.nextInt();
        String Floor = input.next();
        String BuilidingNo = input.next();

        // set fields of ExamVenue 
        Exam.setExamvenueNo(examvenue);
        Exam.setFloor(Floor);
        Exam.setBuildingNo(Integer.parseInt(BuilidingNo));

        return Exam;

    }
//\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\///

    public static Courselab getCourseLab(Scanner input) {

        Course_Lab = new Courselab();

        int labId;
        double hours;
        String name;

        // read fields of course lap 
        labId = input.nextInt();
        name = input.next();
        hours = input.nextDouble();

        /// set fields of course lap 
        Course_Lab.setLabID(labId);
        Course_Lab.setLabName(name);
        Course_Lab.setHours(hours);

        return Course_Lab;
    }

//\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\///
    public static Course getCourseRecord(Scanner input) {

        course = new Course();

        int courseCode;
        String courseTitle;
        double hours;

        /// read fields of course 
        courseCode = input.nextInt();
        courseTitle = input.next();
        hours = input.nextDouble();

        // set fields of course 
        course.setCoursecode(courseCode);
        course.setCoursetitle(courseTitle);
        course.setHours(hours);

        return course;
    }

//\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\///
    public static Student getStudentRecord(Scanner input) {

        Student = new Student(); // Define Object of Student 

        // define Date of Student 
        Date EnrollDate, dateOfBirth;

        ///////////////////////////////////////////////////
        // start reading fields from file arranged
        String department = input.next();
        int semester = input.nextInt();
        double cpga = input.nextDouble();

        //read   date of Enroll Student 
        int Eyear = input.nextInt(); // read  year of Enroll Date 
        int Emonth = input.nextInt(); // read  Month of Enroll Date 
        int Eday = input.nextInt();// read  Day of Enroll Date 

        int Student_ID = input.nextInt(); // read id 
        String Student_Name = input.next(); // read name of Student 
        String Std_nationality = input.next(); // read nationality of Student

        //read   date of birth of Student 
        int Dateyear = input.nextInt();
        int Datemonth = input.nextInt();
        int Dateday = input.nextInt();

        char gender = input.next().charAt(0); // read  gender as a String  M or F and convert it to char 
        int phone = input.nextInt(); // read phone

        String address = input.next(); // read address

        int totalCourse = input.nextInt();
        int totalCourseLab = input.nextInt();

        /////////////////////////////////////////////////////////////
        ///Start set fields that i read from file to Student object /////
        Student.setDepartment(department); // set department
        Student.setId(Student_ID); // set id of Student
        Student.setCgpa(cpga); // set Cpga to Student
        Student.setName(Student_Name); // set name 
        Student.setNationality(Std_nationality); // set nationality to Student
        Student.setSemester(semester); // set semister to Student

        EnrollDate = new Date(Eyear, Emonth, Eday); // Define Date object for Enroll Date 
        dateOfBirth = new Date(Dateyear, Datemonth, Dateday);  // Define Date object but for Date Of birth for a Student 

        Student.setEnrollData(EnrollDate); // set Enroll Date
        Student.setDateOfBirt(dateOfBirth); // set Date Of Birth
        Student.setGender(gender);  // set Gender
        Student.setPhone(phone);// set phone
        Student.setAddress(address); // set address

        /// End of Setting Fields and return Student //// 
        return Student;
    }

    //\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\///
    public static void print_Report(PrintWriter print, Student... student1) throws Exception {

        /// Create Directory To Save Report for Each Student 
        File dir = new File("AllReportsFor25Students");
        if (!dir.exists()) {
            dir.mkdir();
        }

        for (Student This_Student : student1) {

            Teacher This_Teacher = This_Student.getTeacher();
            Invigilator This_Invilgator = This_Student.getInviligator();
            Course[] CourseList = This_Student.getCourse();
            Courselab[] Course_Lab_List = This_Student.getCourselap();
            ExamVenue Exam_List = This_Student.getExamvenue();

            File Student_Report = new File("AllReportsFor25Students/" + This_Student.getName().charAt(0) + This_Student.getName().charAt(1)
                    + This_Student.getId() + "_Student_Report" + ".txt");

            print = new PrintWriter(new BufferedWriter(new FileWriter(Student_Report)));

            print.write("------------- Welcome to FCIT Management System -----------\n");
            print.write("--------- Current Date :  " + new Date().toString() + "--------\n");
            print.write("Command: Print_Report");

            /////////////////////// Student Details ////////////////////////
            print.write(" Student Detail are as Follows: \n");

            print.write(This_Student.toString() + "\n"); // print info of Student

            print.write("-------------------------------------------------------------\n");

            /////////////////////// Teacher Details ////////////////////////
            print.write(" Teacher Detail are as Follows: \n");

            print.write(This_Teacher.toString() + "\n");

            print.write("--------------------------------------------------------------\n");

            /////////////////////// Invigator Details ////////////////////////
            print.write(" Invilgator Detail are as Follows: \n");

            print.write(This_Invilgator.toString() + "\n");

            print.write("---------------------------------------------------------------");

            /////////////////////// Course_Lab Details ////////////////////////
            print.println("\t---Course Lab Details are as follows:---");

            for (int j = 0; j < CourseList.length; j++) {

                Courselab thisCourse_Lab = Course_Lab_List[j];

                if (thisCourse_Lab == null) {
                    break;
                }

                //Lab Code:
                print.write(thisCourse_Lab.toString() + "\n");

            }

            print.println("\n------------------------------------------------------------");

            /////////////////////// Course Details ////////////////////////
            print.print("--- Course Details are as follows:--- \n");
            for (Course CourseItem : CourseList) {
                if (CourseItem == null) {
                    break;
                }
                print.write(CourseItem.toString() + "\n");
            }

            print.write("-----------------------------------------------------------------\n");

            print.write("---Exam Venue Details are as follows:---  \n");

            /////////////////////// //Exam Venue Details ////////////////////////
            print.write(Exam_List.toString() + "\n");

            print.close();
        }
    }

    //\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/ **Main Method ** \/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\///
    public static void main(String[] args) throws Exception {

        File input = new File("input.txt");

        File out = new File("StudentWrite.txt");
        Scanner read = new Scanner(input);
        PrintWriter write = new PrintWriter(new BufferedWriter(new FileWriter(out)), true);

        if (!input.exists()) {

            System.out.println("File  " + input + " Not Exist ");
            System.exit(0);
        }

        ///////////////////////////////////////////////
        final int No_Of_Teacher;
        final int No_Of_Invigilator;
        final int No_Of_ExamVenues;
        final int No_Of_Courselab;
        final int No_Of_Course;
        final int No_Of_Student;

        Teacher[] Teacher_Array; // array to set all Teacher that i ead from file
        Student[] Studen_Array; // array to set all Student that i ead from file
        Invigilator[] Invilgator_Array; // array to set all invilgator that i ead from file
        ExamVenue[] Exam_Array; // array to set all Exam that i read from file
        Course[] Course_Array; // array to set all courses that i read from file
        Courselab[] Lab_Array; // array to set all courselab that i read from file

        ///// Reading Numbers in First Line and assign value to no of every variable//////
        No_Of_Teacher = read.nextInt();
        No_Of_Invigilator = read.nextInt();
        No_Of_ExamVenues = read.nextInt();
        No_Of_Courselab = read.nextInt();
        No_Of_Course = read.nextInt();
        No_Of_Student = read.nextInt();

        //intilize array 
        Teacher_Array = new Teacher[No_Of_Teacher];
        Studen_Array = new Student[No_Of_Student];
        Invilgator_Array = new Invigilator[No_Of_Invigilator];
        Exam_Array = new ExamVenue[No_Of_ExamVenues];
        Course_Array = new Course[No_Of_Course];
        Lab_Array = new Courselab[No_Of_Courselab];

        ////////////////////////////////////////////////////
        // use it to get id of every field from file to use it to assign Teacher , invilgator ,examvenu , course lab ,courses to Student
        int Student_ID;

        write.write("--------------- Welcome to FCIT Management System --------------- \n");

        String Header; // flag to get header of each line like Add Teacher , Add Student and so on 

        /////// to get index in it's own array ////////////////////
        int Index_Of_Teacher = 0; // i use it to  fill the array of Teacher
        int Index_Of_Student = 0; // i use it to  fill the array of Student
        int Index_Of_Inv = 0; // i use it to  fill the array of invilgator
        int Index_of_Course = 0; // i use it to  fill the array of course
        int Index_of_lab = 0; // i use it to  fill the array of course lab 
        int Exam_index = 0; // i use it to  fill the array of Exam

        //\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\//
        //\/\/\/\/\/\/ loop that end whene Header become = Quit that ment it reache to end of the file /\/\/\/\/\/
        while (!(Header = read.next()).equals("Quit")) {

            //\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\** Add Teacher **/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\///           
            if (Header.equals("Add_Teacher")) {

                Teacher_Array[Index_Of_Teacher] = getTeacher(read); // get Teacher and store it in the array 

                write.write("----------------------------------------------------------------\n"
                        + "\n Command Add_Teacher: Add a new doctor record in the System \n"
                        + Teacher_Array[Index_Of_Teacher].toString()); // erite Teacher info in file

                Index_Of_Teacher++; // increment index of array

            } //\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\** Add Invigator **/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\//
            else if (Header.equals("Add_Invigilator")) {
                Invilgator_Array[Index_Of_Inv] = getInviligator(read); // get invilgators and store it in inviligators

                write.write("\n----------------------------------------------------------------\n"
                        + "\nCommand Add_Invigilator: Add a new invigilator record in the System   \n"
                        + Invilgator_Array[Index_Of_Inv].toString()); // write invilgator by invilgator  information in file

                Index_Of_Inv++;

            } //\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\** Add Ecam Venue **/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\///           
            else if (Header.equals("Add_ExamVenue")) {
                Exam_Array[Exam_index] = getExamVenue(read); // get Eaxm venue and store it in Exam 

                write.write("\n----------------------------------------------------------------\n"
                        + "Command Add_ExamVenue: Add a new exam venue record in the System\n"
                        + "Exam Venue Details are as follows:\n" + Exam_Array[Exam_index].toString()); // write it in file tostring() return info of examvenue

                Exam_index++;

            } //\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\** Add Lab of Course **/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\///           
            else if (Header.equals("Add_CourseLab")) {

                Lab_Array[Index_of_lab] = getCourseLab(read); // get course lab and store it in courselab array 

                write.write("\n----------------------------------------------------------------\n"
                        + "Command Add_CourseLab: Add a new course lab record in the System \n" + Lab_Array[Index_of_lab].toString());

                Index_of_lab++;

            } //\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\** Add Course **/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\///           
            else if (Header.equals("Add_Course")) {

                Course_Array[Index_of_Course] = getCourseRecord(read); // get Course and store it in array course

                write.write("\n----------------------------------------------------------------\n"
                        + "\nCommand Add_Course: Add a new course record in the System\n" + Course_Array[Index_of_Course].toString());

                Index_of_Course++; // increment index of course 

            } //\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\** Add Student **/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\///           
            else if (Header.equals("Add_Student")) {

                Student = getStudentRecord(read); // get Student information 

                Studen_Array[Index_Of_Student] = Student; // store Student in array of Student that i will use it later to search about specific Student and assigned another info to it like Teacher , course and so on 

                write.write("\n----------------------------------------------------------------\n"
                        + "\nCommand Add_Student: Add a new Student record in the System \n"
                        + Studen_Array[Index_Of_Student].printStudentBasicInfo()); // write to file and

                Index_Of_Student++;

            } //\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\** Add Teacher to The Student **/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\///           
            else if (Header.equals("Assign_Teacher_Student")) {
                int Teacher_ID = read.nextInt(); // get id of Teacher
                Student_ID = read.nextInt(); // get id of Student 

                write.write("----------------------------------------------------------------\n"
                        + "Command Assign_Teacher_Student: Successfully Processed by the System, Following are the details:\n");

                int std_index = 0;

                // loop on Student array and get name of Student 
                for (int i = 0; i < Studen_Array.length; i++) {
                    if (Studen_Array[i].getId() == Student_ID) {
                        std_index = i; // get index of  specific Student  to use it to set Teacher 
                        write.write("\n\t\tStudent: " + Studen_Array[i].getName() + "\n");
                    }
                }
                // loop on Teacher array and get name of Teacher 
                for (Teacher teacher11 : Teacher_Array) {
                    if (teacher11.getId() == Teacher_ID) {
                        Studen_Array[std_index].setTeacher(Teacher); // set Teacher to Student i get in above comment 
                        write.write("\t\tAssigned to Teacher: " + teacher11.getName() + "\n");
                        break;
                    }
                }

            } //\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\** Add Exam Venue to The Student **/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\///           
            else if (Header.equals("Assign_ExamVenue_Student")) {
                int Exam_ID = read.nextInt();
                Student_ID = read.nextInt();

                write.write("----------------------------------------------------------------\n"
                        + "Command Assign_ExamVenue_Student: Successfully Processed by the System, Following are the details:\n");

                int Std_index = 0;// getindex 
                // loop on Student array and get name of Student 
                for (int i = 0; i < Studen_Array.length; i++) {
                    if (Studen_Array[i].getId() == Student_ID) {
                        Std_index = i;
                        write.write("\n\t\tStudent: " + Studen_Array[i].getName() + "\n");
                    }
                }

                write.write("\tAssigned to ExamVenue:\n"
                        + "\tExam Venue Details are as follows:\n");

                // loop on Exam array and get info of Exam 
                for (ExamVenue Exam1 : Exam_Array) {
                    if (Exam1.getExamvenueNo() == Exam_ID) {
                        Studen_Array[Std_index].setExamvenue(Exam1);
                        write.write(Exam1.toString() + "\n");
                        break;
                    }
                }
            } //\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\** Add Inviligator to Student  **/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\///           
            else if (Header.equals("Assign_Invigilator_Student")) {
                int Invilgator_ID = read.nextInt();
                Student_ID = read.nextInt();

                write.write("----------------------------------------------------------------\n"
                        + "Command Assign_Invigilator_Student: Successfully Processed by the System, Following are the details:\n");

                int std_index = 0;
                // loop on Student array and get name of Student 
                for (int i = 0; i < Studen_Array.length; i++) {
                    if (Studen_Array[i].getId() == Student_ID) {
                        std_index = i;
                        write.write("\n\t\tStudent: " + Studen_Array[i].getName() + "\n");
                    }
                }
                // loop on invilgator array and get name of invilgator 
                for (Invigilator inv : Invilgator_Array) {
                    if (inv.getId() == Invilgator_ID) {
                        Studen_Array[std_index].setInviligator(inv);
                        write.write("\t\tAssigned to Invilgator: " + inv.getName() + "\n");
                        break;
                    }
                }

            } //\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\** Add Course Lab To Student  **/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\///           
            else if (Header.equals("Assign_CourseLab_Student")) {

                Student_ID = read.nextInt();

                String line = read.nextLine().trim(); // read 501 502 503 506 as a line 

                String[] course_Lab_id = line.split(" "); // seperate line accourding to space and stpre ot in array 

                Courselab course_lab[] = new Courselab[No_Of_Course];

                int course_i = 0;

                write.write("----------------------------------------------------------------\n"
                        + "Command Assign_CourseLab_Student: Successfully Processed by the System, Following are the details:\n");

                int Std_index = 0;
                // loop on Student array and get name of Student 
                for (int i = 0; i < Studen_Array.length; i++) {
                    if (Studen_Array[i].getId() == Student_ID) {
                        Std_index = i;
                        write.write("\n\t\tStudent: " + Studen_Array[i].getName() + "\n");
                    }
                }

                // loop on course lab  array and get info  of specific  course lab  
                for (int i = 0; i < course_Lab_id.length;i++) {
                    /* used this for loop to loop on the course_lab Assinged Array that contains  Course Codes that i read  from file */

                    if (!course_Lab_id[i].equals("")) {

                        int Course_Lab_ID = Integer.parseInt(course_Lab_id[i]);

                        for (int j = 0; j < Lab_Array.length; j++) {

   // compare course_lab id that i get from file with id of course_lab and store this lab_Array in array and print this course and the student that assigned to him 

                            if (Lab_Array[j].getLabID() == Course_Lab_ID) {
                                course_lab[course_i] = Lab_Array[j];// store course_Lab for this student in to array course_lab to make me able to set it into student class to can get it later 
                                course_i++;
                                write.write("\t Course Lab added: " + Lab_Array[j].toString() + "\n");
                                break;
                            }
                        }
                    }
                }
                Studen_Array[Std_index].setCourselap(course_lab);

            } //\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\** Add Course to Student  **/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\///           
            else if (Header.equals("Assign_Course_Student")) {

                Student_ID = read.nextInt(); // read ID of student 

                String line = read.nextLine().trim();

                String[] courses_Assigned = line.split(" "); // read code of the line and split   

                Course course[] = new Course[No_Of_Course];

                int course_i = 0;

                write.write("----------------------------------------------------------------\n"
                        + "Command Assign_Course_Student: Successfully Processed by the System, Following are the details:\n");

                int idx = 0;
                // loop on Student array and get name of Student 
                for (int i = 0; i < Studen_Array.length; i++) {
                    if (Studen_Array[i].getId() == Student_ID) {
                        idx = i;
                        write.write("\n\t\tStudent: " + Studen_Array[i].getName() + "\n");
                    }
                }

                for (int i = 0; i < courses_Assigned.length; i++) {

                    if (!courses_Assigned[i].equals("")) {

                        int Course_ID = Integer.parseInt(courses_Assigned[i]); // note that i read codes as a string because nexLine Method read all line return string

                        for (int j = 0; j < Course_Array.length; j++) {

                            // compare course id that i get from file with id of course and store this course in array and print this course and the student that assigned to him 
                            if (Course_Array[j].getCoursecode() == Course_ID) {

                                course[course_i] = Course_Array[j]; // store courses for this student in to array course to make me able to set it into student class to can get it later 

                                course_i++;

                                write.write("\t Course added: " + Course_Array[j].toString() + "\n");
                                break;
                            }
                        } // it used to loop the Courses that stord in to array " Course Array and set this course to student and print it into StudentWrite.txt file
                    }
                } // used this for loop to loop on the courseAssined Array that contains  Course Codes that i read  from file 
                Studen_Array[idx].setCourse(course);

            } else if (Header.equals("Print_Report")) {

                print_Report(write, Studen_Array);

            }

        }

        write.write("----------------------------------------------------------------\n"
                + "Thank you for using FCIT Management System, Good Bye!");
        write.close();

    }

}
