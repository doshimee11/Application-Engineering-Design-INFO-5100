/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author meetdoshi
 */

public class Patient {
    
    private String patientUserPassword;
    private long patientID;
    Person person;
    static long patientCount = 0;
    EncounterHistory encounterHistory;
    
    public Patient(){
    }
    
    public Patient(Person person){   
        patientCount += 1;
        this.patientID = patientCount;
        this.person = person;
        this.patientUserPassword = (person.getPersonName()).concat("123");
        this.encounterHistory = createNewEncounterHistory();
    }
    
    public EncounterHistory createNewEncounterHistory(){
        return new EncounterHistory(this);
    }
    
    public ArrayList<Encounter> getPatientEncounterHistory(){
        return this.encounterHistory.getEncountersList();    
    }
    
    public boolean matchByPatientName(String name){
        return this.person.matchByPersonName(name);
    }
    
    public boolean matchByContact(long cellPhoneNumber){
        return this.getPerson().getPersonCellPhoneNumber() == cellPhoneNumber;
    }
    
    public boolean matchByPatientId(int patientID){
        return this.getPatientID() == patientID;
    }

    public String getPatientUserPassword() {
        return patientUserPassword;
    }

    public void setPatientUserPassword(String patientUserPassword) {
        this.patientUserPassword = patientUserPassword;
    }

    public long getPatientID() {
        return patientID;
    }

    public Person getPerson() {
        return person;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }
    
}