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
public class ExamVenue {

    private int examvenueNo;
    private String floor;
    private int buildingNo;

    public int getExamvenueNo() {
        return examvenueNo;
    }

    public void setExamvenueNo(int examvenueNo) {
        this.examvenueNo = examvenueNo;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public int getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(int buildingNo) {
        this.buildingNo = buildingNo;
    }

    @Override
    public String toString() {
        return "Exam Venue No.: " + getExamvenueNo() + " , Floor: " + getFloor() + ", Building No.:" + getBuildingNo() + "\n";
    }

}
