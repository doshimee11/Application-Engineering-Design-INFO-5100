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

public class EncounterHistory {
    
    private ArrayList<Encounter> encountersList;
    
    public EncounterHistory() {
    }
    
    public EncounterHistory(Patient patient) {
        this.encountersList = new ArrayList<Encounter>();
    }
    
    public ArrayList<Encounter> getEncountersList() {
        return encountersList;
    }
    
    public Encounter addNewEncounter(VitalSigns vitals){
        Encounter newEncounter = new Encounter(vitals);
        encountersList.add(newEncounter);
        return newEncounter;
    }
    
    public void deletePreviousEncounter(Encounter encounters){
        this.getEncountersList().remove(encounters);
    }
    
}