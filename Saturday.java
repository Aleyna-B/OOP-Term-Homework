package com.mycompany.ooptermhw.Dairy;

public class Saturday extends Days implements IWeekend {
    public String Studies()
    {
        return"Springboot";
    }
    @Override
    public String toString() {
        return String.format("This was my saturday:\nDate: %s \nWake up hour: %s\nSleep hour: %s\nBreakfast: %s\nStudiess: %s\nOther activities: %s \n", 
                this.getDate(),this.getWakeUpHour(),this.getSleepHour(),this.getBreakfast(),this.Studies(),this.getOtherActs());
    }
    public Saturday() {
        this.setDate("16.12.2023");
        this.setWakeUpHour("14.15");
        this.setSleepHour("02.27");
        this.setBreakfast("eggs");
        this.setDinner("meat and bulgur with chickpeas");
        this.setOtherActs("working on my linkedin profile and resume,making brownie,cleaning the cat litter");
        System.out.println(this.toString());
    }  
    
}
