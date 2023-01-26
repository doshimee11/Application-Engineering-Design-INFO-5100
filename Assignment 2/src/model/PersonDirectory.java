/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author meetdoshi
 */

public class PersonDirectory {
    
    ArrayList<Person> personList;
    
    public PersonDirectory(){
        personList = new ArrayList<Person>();
    }
    
    public void addPersonToPersonDirectory(Person person){
        personList.add(person);
    }
    
    public Person createNewPerson(String personName, LocalDate personDOB, long personCellPhoneNumber, String personCommunity){
        Person newPerson = new Person(personName, personDOB, personCellPhoneNumber, personCommunity);
        personList.add(newPerson);
        return newPerson;
    }
    
    public ArrayList<Person> getPersonList() {
        return personList;
    }
    
    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
}