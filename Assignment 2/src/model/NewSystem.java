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

public class NewSystem {
    
    private ArrayList<City> cityList;
    
    public NewSystem() {
        this.cityList = new ArrayList<City>();
    }
    
    public City addNewCity(String cityName){
        City city = new City(cityName);
        cityList.add(city);
        return city;
    }
    
    public void removePreviousCity(City city){
        cityList.remove(city);
    }
    
    public ArrayList<City> getCityList() {
        return cityList;
    }

    public void setCityList(ArrayList<City> cityList) {
        this.cityList = cityList;
    }
    
}
