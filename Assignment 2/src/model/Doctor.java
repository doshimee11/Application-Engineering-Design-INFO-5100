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

public class Doctor {
    
    private long doctorID;
    Person person;
    static long doctorCount = 0;
    String doctorPassword;
    ArrayList<Patient> patientToDoctor;
    
    public Doctor(Person person){   
        doctorCount += 1;
        this.doctorID = doctorCount;
        this.person = person;
        this.doctorPassword = (person.getPersonName()).concat("123");
        this.patientToDoctor = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientToDoctor() {
        return patientToDoctor;
    }

    public long getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(long doctorID) {
        this.doctorID = doctorID;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public static long getDoctorCount() {
        return doctorCount;
    }

    public static void setDoctorCount(long doctorCount) {
        Doctor.doctorCount = doctorCount;
    }

    public String getDoctorPassword() {
        return doctorPassword;
    }

    public void setDoctorPassword(String doctorPassword) {
        this.doctorPassword = doctorPassword;
    }
    
    public boolean matchByName(String name){
        return this.person.matchByPersonName(name);
    }
    
    public boolean matchById(int id){
        return this.getDoctorID() == doctorID;
    }
    
    public void BookPatientAppointment(Patient patient){
        this.patientToDoctor.add(patient);
    }
    
}