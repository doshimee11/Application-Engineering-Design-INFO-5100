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

public class Community {
    
    private String communityName;
    private ArrayList<House> houseList;
    private ArrayList<Hospital> hospitalList;
    
    public Community(){
    }
    
    public Community(String communityName){
        this.houseList = new ArrayList<>();
        this.hospitalList = new ArrayList<>();
        this.communityName = communityName;
    }
    
    public House findPersonInCommunity(Person person){
        for(House house: this.getHouseList())
            if(house.getHouseFamilyMembers().contains(person))
                return house;
        return null;
    }
    
    public ArrayList<Doctor> findDoctorInCommunity(Doctor doctor){
        for(Hospital hospital: this.getHospitalList())
            return hospital.getDoctorInHospital();
        return null;
    }
    
    public House createNewHouse(int houseNumber, int houseUnitNumber, String houseStreetName, String houseCommunity, String houseCity){
        House newHouse = new House(houseNumber, houseUnitNumber, houseStreetName, houseCommunity, houseCity);
        this.getHouseList().add(newHouse);
        return newHouse;
    }
    
    public Hospital createNewHospital(int hospitalNumber, String hospitalStreetName, String hospitalCommunity, String hospitalCity){    
        Hospital newHospital = new Hospital(hospitalNumber, hospitalStreetName, hospitalCommunity, hospitalCity);
        this.getHospitalList().add(newHospital);
        return newHospital;
    }
    
    public ArrayList<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(ArrayList<House> houseList) {
        this.houseList = houseList;
    }

    public ArrayList<Hospital> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(ArrayList<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }
    
}