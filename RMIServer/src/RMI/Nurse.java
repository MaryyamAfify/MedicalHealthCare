/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

import java.util.*;

public class Nurse {
    private String AssignedDoctor;
    private Account account;

    public Nurse() {
    }

    public Nurse(String AssignedDoctor, Account account) {
        this.AssignedDoctor = AssignedDoctor;
        this.account = account;
    }

    public String getAssignedDoctor() {
        return AssignedDoctor;
    }

    public void setAssignedDoctor(String AssignedDoctor) {
        this.AssignedDoctor = AssignedDoctor;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    
    public ArrayList<Doctor> selectSpecialization(String S){
    
        return null;
    }
}
