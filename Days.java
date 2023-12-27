/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooptermhw.Dairy;

/**
 *
 * @author benza
 */
public abstract class Days {
    private String date;
    private String wakeUpHour;
    private String sleepHour;
    private String breakfast;
    private String dinner;
    private String otherActs;     //other actions

    @Override
    public abstract String toString();
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWakeUpHour() {
        return wakeUpHour;
    }

    public void setWakeUpHour(String wakeUpHour) {
        this.wakeUpHour = wakeUpHour;
    }

    public String getSleepHour() {
        return sleepHour;
    }

    public void setSleepHour(String sleepHour) {
        this.sleepHour = sleepHour;
    }

    public String getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }

    public String getDinner() {
        return dinner;
    }

    public void setDinner(String dinner) {
        this.dinner = dinner;
    }

    public String getOtherActs() {
        return otherActs;
    }

    public void setOtherActs(String otherActs) {
        this.otherActs = otherActs;
    }
}
