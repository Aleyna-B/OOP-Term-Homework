/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooptermhw.Dairy;

/**
 *
 * @author benza
 */
public class Tuesday extends Days implements IWeekday {
    public String Lessons()
    {
        return"Differencial equations";
    }
    public String Lunch()
    {
        return"pasta,chicken doner";
    }
    @Override
    public String toString() {
        return String.format("This was my tuesday:\nDate: %s \nWake up hour: %s\nSleep hour: %s\nBreakfast: %s\nLunch: %s\nLessons: %s\nOther activities: %s \n", 
                this.getDate(),this.getWakeUpHour(),this.getSleepHour(),this.getBreakfast(),this.Lunch(),this.Lessons(),this.getOtherActs());
    }
    public Tuesday() {
        this.setDate("19.12.2023");
        this.setWakeUpHour("08.20");
        this.setSleepHour("02.00");
        this.setBreakfast("eggs,croissant");
        this.setDinner("celery,cake");
        this.setOtherActs("chatting with friends,playing board games with friends in Bahçelievler,chatting with the cat,tidying up the kitchen,cleaning the cat litter,taking a shower");
        System.out.println(this.toString());
        
    }
}
