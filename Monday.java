/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooptermhw.dairy;

/**
 *
 * @author benza
 */
public class Monday extends Days implements IWeekday {
    public String Lessons()
    {
        return"English,Probability,Data Structures";
    }
    public String Lunch()
    {
        return "fish";
    }
    @Override
    public String toString() {
        return String.format("This was my monday:\nDate: %s \nWake up hour: %s\nSleep hour: %s\nBreakfast: %s\nLunch: %s\nLessons: %s\nOther activities: %s \n", 
                this.getDate(),this.getWakeUpHour(),this.getSleepHour(),this.getBreakfast(),this.Lunch(),this.Lessons(),this.getOtherActs());
    }
    public Monday() {
        this.setDate("18.12.2023");
        this.setWakeUpHour("07.45");
        this.setSleepHour("00.30");
        this.setBreakfast("eggs");
        this.setDinner("meatballs");
        this.setOtherActs("feeding the cat in the morning,chatting with friends,washing dishes,helping clean the bathroom,cleaning the cat litter");
        System.out.println(this.toString());
    }  
    
}
