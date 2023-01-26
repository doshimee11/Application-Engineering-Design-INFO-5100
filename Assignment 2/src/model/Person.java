/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author meetdoshi
 */
public class Person {

    private String personName;
    private int personAge;
    private LocalDate personDOB;
    private long personCellPhoneNumber;
    private String personCommunity;
    
    public Person(){
    }
    
    public Person(String personName, LocalDate personDOB, long personCellPhoneNumber, String personCommunity) {
        this.personName = personName;
        this.personAge = calculateAge(personDOB);
        this.personDOB = personDOB;
        this.personCellPhoneNumber = personCellPhoneNumber;
        this.personCommunity = personCommunity;
    }

    @Override
    public String toString() {
        return personName;
    }
    
    public int calculateAge(LocalDate birthDate){
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
    
    public boolean matchByPersonName(String personName) {
        return this.getPersonName().equals(personName);
    }
    
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public LocalDate getPersonDOB() {
        return personDOB;
    }

    public void setPersonDOB(LocalDate personDOB) {
        this.personDOB = personDOB;
    }

    public long getPersonCellPhoneNumber() {
        return personCellPhoneNumber;
    }

    public void setPersonCellPhoneNumber(long personCellPhoneNumber) {
        this.personCellPhoneNumber = personCellPhoneNumber;
    }

    public String getPersonCommunity() {
        return personCommunity;
    }

    public void setPersonCommunity(String personCommunity) {
        this.personCommunity = personCommunity;
    }
    
}