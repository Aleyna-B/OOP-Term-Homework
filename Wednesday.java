package com.mycompany.ooptermhw.Dairy;

public class Wednesday extends Days implements IWeekday {
    public String Lessons()
    {
        return"OOP Lab";
    }
    public String Lunch()
    {
        return "chocolate";
    }
    @Override
    public String toString() {
        return String.format("This was my wednesday:\nDate: %s \nWake up hour: %s\nSleep hour: %s\nBreakfast: %s\nLunch: %s\nLessons: %s\nOther activities: %s \n", 
                this.getDate(),this.getWakeUpHour(),this.getSleepHour(),this.getBreakfast(),this.Lunch(),this.Lessons(),this.getOtherActs());
    }
    public Wednesday() {
        this.setDate("13.12.2023");
        this.setWakeUpHour("11.00");
        this.setSleepHour("02.30");
        this.setBreakfast("eggs");
        this.setDinner("cauliflower");
        this.setOtherActs("feeding the cat in the morning,chatting with friends,washing dishes,listen to music and watch oop lesson"
        		+ "sprinboot project tutorials,pet the cat,cleaning the cat litter");
        System.out.println(this.toString());
    }  
    
}
