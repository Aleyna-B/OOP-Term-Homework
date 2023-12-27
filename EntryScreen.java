package com.mycompany.ooptermhw;

public class EntryScreen extends InputControl{	
	private String options = "(1)- A weekday of mine\n"
									+ "(2)- A weekend of mine\n"
									+ "(3)- Food\n"
									+ "(4)- Studies\n"
									+ "(5)- Entertainment\n"
									+ "(6)- Health\n"
									+ "(7)- Games\n"
									+ "(8)- Other";
	public boolean takeInput() { 
	  this.setOpt(0); 		//preventing unexpected values 
	  System.out.println("Choose an option below to get to know me.\nIf you do not "
	  +"wish to talk anymore, you can of course press 0 to exit");
	  System.out.println(options);
	  return baseControl();
	}
	
	public void intervalControl()
	{
		if(this.getOpt()<0 || this.getOpt()>8)
		{
			System.out.println("I think you accidentally pressed something you should not have.\n"
					+ "The options you can choose are from 0 to 8\n");
		}
	}
	
	public EntryScreen()	//empty constructor because Uraz Hoca wanted so
	{
	}
}

