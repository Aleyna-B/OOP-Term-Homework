package com.mycompany.ooptermhw.other;
import com.mycompany.ooptermhw.InputControl;

public class Other extends InputControl{
	public Other()
	{
		System.out.println("Let's see what else i can tell you about.\n");
		otherMenu();
	}
	
	public void otherMenu()
	{
		System.out.println("(1)- Family\n(2)- Pets\n(3)- Changed my mind");
		if(baseControl())
		{
			switch (this.getOpt())
			{
			case 1: Family fam = new Family();
					fam.baseAnswer();
					this.otherMenu();
			return;
			
			case 2: Pet p = new Pet();
					p.baseAnswer();
					this.otherMenu();
			break;
			
			case 3: System.out.println("Okey-dokey artichokey!");
			break;
			}
		}
	}
		
	public void intervalControl()
	{
		if(this.getOpt()<1 || this.getOpt()>3)
		{
			System.out.println("I think you accidentally pressed something you should not have.\n"
					+ "The options you can choose are from 1 to 3\n");
			otherMenu();
		}
	}
}
