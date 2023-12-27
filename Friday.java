package com.mycompany.ooptermhw.Dairy;

public class Friday extends Days implements IWeekday {
    public String Lessons()
    {
        return"Electrical Electronical Circuits";
    }
    public String Lunch()
    {
        return "chicken and pilaf";
    }
    @Override
    public String toString() {
        return String.format("This was my friday:\nDate: %s \nWake up hour: %s\nSleep hour: %s\nBreakfast: %s\nLunch: %s\nLessons: %s\nOther activities: %s \n", 
                this.getDate(),this.getWakeUpHour(),this.getSleepHour(),this.getBreakfast(),this.Lunch(),this.Lessons(),this.getOtherActs());
    }
    public Friday() {
        this.setDate("15.12.2023");
        this.setWakeUpHour("07.13");
        this.setSleepHour("02.35");
        this.setBreakfast("tomato omelette");
        this.setDinner("meat with chickpeas");
        this.setOtherActs("feeding the cat in the morning,wasting time,joining AI course,"
        		+ "studying Springboot,study EE circuits,watch anime,cleaning the cat litter");
        System.out.println(this.toString());
    }     
}
