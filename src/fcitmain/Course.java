/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcitmain;

/**
 *
 * @author AHMED 50070
 */
public class Course {

    private int coursecode;
    private String coursetitle;
    private double hours;

    public int getCoursecode() {
        return coursecode;
    }

    public void setCoursecode(int coursecode) {
        this.coursecode = coursecode;
    }

    public String getCoursetitle() {
        return coursetitle;
    }

    public void setCoursetitle(String coursetitle) {
        this.coursetitle = coursetitle;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Course Code: " + getCoursecode() + ", Course Title: " + getCoursetitle() + " , Hours:" + getHours() + "\n";
    }

}
