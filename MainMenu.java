package com.mycompany.ooptermhw;
import com.mycompany.ooptermhw.Dairy.*;

public class MainMenu {
	EntryScreen es = new EntryScreen();
	private int controller;
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


