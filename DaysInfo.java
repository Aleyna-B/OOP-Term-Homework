package com.mycompany.ooptermhw.Dairy;

import java.util.ArrayList;
import java.util.List;

public class DaysInfo {
		
	private List<Days> allDays = new ArrayList<Days>();
	public DaysInfo(String weekdays) {	//constructor to create weekday classes 
		Monday mon = new Monday();
		Tuesday tue = new Tuesday();
		Wednesday wed = new Wednesday();
		Thursday thu = new Thursday();
		Friday fri = new Friday();
		this.allDays.add(mon);
		this.allDays.add(tue);
		this.allDays.add(wed);
		this.allDays.add(thu);
		this.allDays.add(fri);
	}
	
	public DaysInfo() { 	//default constructor creates classes
		Saturday sat = new Saturday();
		Sunday sun = new Sunday();
		this.allDays.add(sat);	
		this.allDays.add(sun);
	}

	public void printInfo()
		{	//calling each class' toString methods if an instance is currently in the list
			allDays.forEach(day -> System.out.println(day.toString()));
			allDays.clear();	//clearing the list for further usage
		}    
}


