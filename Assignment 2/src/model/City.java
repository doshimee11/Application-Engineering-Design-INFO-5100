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

public class City {
    
    String cityName;
    ArrayList<Community> communityList;
    
    public City(String cityName){
        this.communityList = new ArrayList<Community>();
        this.cityName = cityName;
    }
    
    public Community newCommunity(String communityName){
        Community community = new Community(communityName);
        this.communityList.add(community);
        return community;
    }
    
    public Community getCommunityByObject(Community communityName){
        for(Community community: this.getCommunityList()){    
            if(community.getCommunityName().equals(communityName)){
                return community;
            }
        }
        return null;
    }
    
    public boolean CommunityExists(String communityName){
        for(Community community: this.getCommunityList()){
            if(community.getCommunityName().equals(communityName)){
                return true;
            }
        }
        return false;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(ArrayList<Community> communityList) {
        this.communityList = communityList;
    }
    
    @Override
    public String toString() {
        return cityName;
    }

}