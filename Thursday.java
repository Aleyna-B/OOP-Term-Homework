package com.mycompany.ooptermhw.Dairy;

public class Thursday extends Days implements IWeekday {
    public String Lessons()
    {
        return"Differencial equations";
    }
    public String Lunch()
    {
        return "coffee and free IEEE snacks";
    }
    @Override
    public String toString() {
        return String.format("This was my thursday:\nDate: %s \nWake up hour: %s\nSleep hour: %s\nBreakfast: %s\nLunch: %s\nLessons: %s\nOther activities: %s \n", 
                this.getDate(),this.getWakeUpHour(),this.getSleepHour(),this.getBreakfast(),this.Lunch(),this.Lessons(),this.getOtherActs());
    }
    public Thursday() {
        this.setDate("14.12.2023");
        this.setWakeUpHour("11.00");
        this.setSleepHour("01.27");
        this.setBreakfast("eggs and oatmeal");
        this.setDinner("lamb and pilaf with salad");
        this.setOtherActs("feeding the cat in the morning,chatting with friends,joining AI course,washing dishes,"
        		+ "studying electrical circuits,watching java lesson,cleaning the cat litter");
        System.out.println(this.toString());
    }  
    
}

