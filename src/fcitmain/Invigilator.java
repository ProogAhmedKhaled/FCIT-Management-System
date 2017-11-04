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
public class Invigilator extends Employee {

    int inviligatonExperience;
    String invilgatonExpertise;

    public int getInviligatonExperience() {
        return inviligatonExperience;
    }

    public void setInviligatonExperience(int inviligatonExperience) {
        this.inviligatonExperience = inviligatonExperience;
    }

    public String getInvilgatonExpertise() {
        return invilgatonExpertise;
    }

    public void setInvilgatonExpertise(String invilgatonExpertise) {
        this.invilgatonExpertise = invilgatonExpertise;
    }

    @Override
    public String toString() {
        return  super.toString() + "" + " , inviligatonExperience: " + getInviligatonExperience() + " , invilgatonExpertise: " + getInvilgatonExpertise() + "\n";
    }

}
