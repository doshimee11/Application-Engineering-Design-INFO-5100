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

public class Hospital {
    
    private int hospitalNumber;
    private String hospitalStreetName;
    private String hospitalCommunity;
    private String hospitalCity;
    private long hospitalZIPCode;
    ArrayList<Doctor> doctorInHospital;
    
    public Hospital(){
    }
    
    public Hospital (int hospitalNumber, String hospitalStreetName, String hospitalCommunity, String hospitalCity){
        this.hospitalNumber = hospitalNumber;      
        this.hospitalStreetName = hospitalStreetName;
        this.hospitalCommunity = hospitalCommunity;
        this.hospitalCity = hospitalCity;      
        this.doctorInHospital = new ArrayList<Doctor>();
    }
    
    public Doctor addDoctorToHospital(Doctor doctor){
        this.getDoctorInHospital().add(doctor);
        return doctor;
    }
    
    public int getHospitalNumber() {
        return hospitalNumber;
    }

    public void setHospitalNumber(int hospitalNumber) {
        this.hospitalNumber = hospitalNumber;
    }

    public String getHospitalStreetName() {
        return hospitalStreetName;
    }

    public void setHospitalStreetName(String hospitalStreetName) {
        this.hospitalStreetName = hospitalStreetName;
    }

    public String getHospitalCommunity() {
        return hospitalCommunity;
    }

    public void setHospitalCommunity(String hospitalCommunity) {
        this.hospitalCommunity = hospitalCommunity;
    }

    public String getHospitalCity() {
        return hospitalCity;
    }

    public void setHospitalCity(String hospitalCity) {
        this.hospitalCity = hospitalCity;
    }

    public long getHospitalZIPCode() {
        return hospitalZIPCode;
    }

    public void setHospitalZIPCode(long hospitalZIPCode) {
        this.hospitalZIPCode = hospitalZIPCode;
    }

    public ArrayList<Doctor> getDoctorInHospital() {
        return doctorInHospital;
    }

    public void setDoctorInHospital(ArrayList<Doctor> doctorInHospital) {
        this.doctorInHospital = doctorInHospital;
    }
    
}