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

public class House {
    
    private int houseNumber;
    private int houseUnitNumber;
    private String houseStreetName;
    private String houseCommunity;
    private String houseCity;
    private long houseZIPCode;
    ArrayList<Person> houseFamilyMembers;
    
    public House(int houseNumber, int houseUnitNumber, String houseStreetName, String houseCommunity, String houseCity){
        this.houseNumber = houseNumber;
        this.houseUnitNumber = houseUnitNumber;
        this.houseStreetName = houseStreetName;
        this.houseCommunity = houseCommunity;
        this.houseCity = houseCity;
        this.houseFamilyMembers = new ArrayList<Person>();
    }
    
    public void addPersonToHouse(Person member){
        this.getHouseFamilyMembers().add(member);
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getHouseUnitNumber() {
        return houseUnitNumber;
    }

    public void setHouseUnitNumber(int houseUnitNumber) {
        this.houseUnitNumber = houseUnitNumber;
    }

    public String getHouseStreetName() {
        return houseStreetName;
    }

    public void setHouseStreetName(String houseStreetName) {
        this.houseStreetName = houseStreetName;
    }

    public String getHouseCommunity() {
        return houseCommunity;
    }

    public void setHouseCommunity(String houseCommunity) {
        this.houseCommunity = houseCommunity;
    }

    public String getHouseCity() {
        return houseCity;
    }

    public void setHouseCity(String houseCity) {
        this.houseCity = houseCity;
    }

    public long getHouseZIPCode() {
        return houseZIPCode;
    }

    public void setHouseZIPCode(long houseZIPCode) {
        this.houseZIPCode = houseZIPCode;
    }

    public ArrayList<Person> getHouseFamilyMembers() {
        return houseFamilyMembers;
    }

    public void setHouseFamilyMembers(ArrayList<Person> houseFamilyMembers) {
        this.houseFamilyMembers = houseFamilyMembers;
    }
    
}