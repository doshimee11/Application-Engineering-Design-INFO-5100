/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author meetdoshi
 */
public class Employee {
    
    private String name;
    private int employeeID;
    private int age;
    private String gender;
    private Date startDate;
    private String level;
    private String teamInfo;
    private String positionTitle;
    private long cellPhoneNumber;
    private String emailAddress;
    private String photo;

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int EmployeeID) {
        this.employeeID = EmployeeID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int Age) {
        this.age = Age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String Gender) {
        this.gender = Gender;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date StartDate) {
        this.startDate = StartDate;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String Level) {
        this.level = Level;
    }

    public String getTeamInfo() {
        return teamInfo;
    }

    public void setTeamInfo(String TeamInfo) {
        this.teamInfo = TeamInfo;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(String PositionTitle) {
        this.positionTitle = PositionTitle;
    }

    public long getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(long CellPhoneNumber) {
        this.cellPhoneNumber = CellPhoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String EmailAddress) {
        this.emailAddress = EmailAddress;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String Photo) {
        this.photo = Photo;
    }
    
    
}
