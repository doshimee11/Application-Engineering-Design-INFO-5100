/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author meetdoshi
 */

public class Encounter {
    
    VitalSigns vitals;
    private LocalDate lastHospitalVisitDate;
    private long encounterID;
    static long encounterCount = 0;
    
    public Encounter(VitalSigns vitals) {
        this.lastHospitalVisitDate = LocalDate.now();
        this.vitals = vitals;
        encounterCount = encounterCount + 1;
        this.encounterID = encounterCount;    
    }
    
    public VitalSigns getVitals() {
        return vitals;
    }

    public void setVitals(VitalSigns vitals) {
        this.vitals = vitals;
    }

    public LocalDate getLastHospitalVisitDate() {
        return lastHospitalVisitDate;
    }

    public void setLastHospitalVisitDate(LocalDate lastHospitalVisitDate) {
        this.lastHospitalVisitDate = lastHospitalVisitDate;
    }

    public long getEncounterID() {
        return encounterID;
    }

    public void setEncounterID(long encounterID) {
        this.encounterID = encounterID;
    }

    public static long getEncounterCount() {
        return encounterCount;
    }

    public static void setEncounterCount(long encounterCount) {
        Encounter.encounterCount = encounterCount;
    }
    
}