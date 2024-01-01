package com.mycompany.ooptermhw;
import com.mycompany.ooptermhw.dairy.DaysInfo;
import com.mycompany.ooptermhw.entertainment.Entertainment;
import com.mycompany.ooptermhw.food.ForFood;
import com.mycompany.ooptermhw.other.Other;
import com.mycompany.ooptermhw.study.Studies;

public class MainMenu {
	EntryScreen es = new EntryScreen();
	private int controller;		//to control the program flow
	public MainMenu(int controller)
	{		
		this.setController(controller);
	}
	
	public void Menu()
	{
		if(es.takeInput()) {
			switch (es.getOpt())
			{
			case 0: System.out.println("Okey-dokey artichokey!\nGoodbye!");
			setController(0);	//controller is set to 0 so the while loop comes to end
			return;
			
			case 1: DaysInfo days = new DaysInfo("weekdays");
			break;
			
			case 2: DaysInfo end= new DaysInfo();
			break;
			
			case 3: ForFood ffood = new ForFood();;
			break;
			
			case 4: Studies studies = new Studies();
			break;
			
			case 5: Entertainment entert = new Entertainment();
			break;
			
			case 6: Other other = new Other();
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


