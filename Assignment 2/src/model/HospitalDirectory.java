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

public class HospitalDirectory {
    
    ArrayList<Hospital> hospitalList;
    
    public HospitalDirectory(){
        hospitalList = new ArrayList<Hospital>();
    }
    
    public Hospital createNewHospital(int hospitalNumber, String hospitalStreetName, String hospitalCommunity, String hospitalCity){
        Hospital newHospital = new Hospital(hospitalNumber, hospitalStreetName, hospitalCommunity, hospitalCity);
        hospitalList.add(newHospital);
        return newHospital;
    }
    
    public void addNewHospital(Hospital hospital){
        this.getHospitalList().add(hospital);
    }

    public ArrayList<Hospital> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(ArrayList<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }
    
}