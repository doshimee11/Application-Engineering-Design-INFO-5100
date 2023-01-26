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

public class PatientDirectory {
    
    ArrayList<Patient> patientList;
    
    public PatientDirectory(){
        patientList = new ArrayList<Patient>();
    }
    
    public Patient getPatientById(int patientID){
        for(Patient p: patientList){
            if(p.matchByPatientId(patientID)){
                return p;
            }
        }
        return null;
    }
    
    public Patient createPatient(Person person){
        Patient newPatient = new Patient(person);
        patientList.add(newPatient);
        return newPatient;
    }
    
    public Patient searchPatientByName(String name){
        for(Patient p: patientList){
            if(p.matchByPatientName(name)){
                return p;
            }
        }
        return null;
    }
    
    public ArrayList<Patient> getPatientList() {
        return patientList;
    }
    
}