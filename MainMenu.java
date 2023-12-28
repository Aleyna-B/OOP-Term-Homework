package com.mycompany.ooptermhw;
import com.mycompany.ooptermhw.Dairy.DaysInfo;
import com.mycompany.ooptermhw.food.ForFood;
import com.mycompany.ooptermhw.study.Studies;

public class MainMenu {
	EntryScreen es = new EntryScreen();
	private int controller;		//to control the program
	public MainMenu(int controller)
	{		
		this.setController(controller);
	}
	
	public void Menu()//geri voide dönebilir
	{
		if(es.takeInput()) {
			switch (es.getOpt())
			{
			case 0: System.out.println("Goodbye!");
			setController(0);
			return;
			
			case 1: DaysInfo days = new DaysInfo("weekdays");
			break;
			
			case 2: DaysInfo end= new DaysInfo();
			break;
			
			case 3: ForFood ff = new ForFood();;
			break;
			
			case 4: Studies studies = new Studies();
			break;
			}
		}
}

	public int getController() {
		return controller;
	}

	public void setController(int controller) {
		this.controller = controller;
	}
}


