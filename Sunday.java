package com.mycompany.ooptermhw.dairy;

public class Sunday extends Days implements IWeekend {
    public String Studies()
    {
        return"Data Structures";
    }
    @Override
    public String toString() {
        return String.format("This was my sunday:\nDate: %s \nWake up hour: %s\nSleep hour: %s\nBreakfast: %s\nStudiess: %s\nOther activities: %s \n", 
                this.getDate(),this.getWakeUpHour(),this.getSleepHour(),this.getBreakfast(),this.Studies(),this.getOtherActs());
    }
    public Sunday() {
        this.setDate("17.12.2023");
        this.setWakeUpHour("09.20");
        this.setSleepHour("00.50");
        this.setBreakfast("eggs");
        this.setDinner("pasta");
        this.setOtherActs("feeding the cat in the morning,joining GDG at Hacettepe,killing time,cleaning the cat litter");
        System.out.println(this.toString());
    }  
    
}
