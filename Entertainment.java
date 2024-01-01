package com.mycompany.ooptermhw.entertainment;
import java.util.ArrayList;
import com.mycompany.ooptermhw.InputControl;

public class Entertainment extends InputControl{
	private ArrayList<String> options = new ArrayList<String>(); {
		options.add("Here are few things that might entertain you\n");
		options.add("(1)- Thanks i am entertained enough today.\n");
		options.add("(2)- Games\n");
		options.add("(3)- Arts\n");
		options.add("(4)- TV\n");
		}
	
	public Entertainment()
	{	
		System.out.println("There are crazy stuff to do in the age of internet and media to keep one entertained\n"
				+ "but i usually can't spare a lot of time for it.\nProbably i lack planning skills or life is just that busy.");
		EntertainMenu();		
	}
	
	public void EntertainMenu()
	{
		options.forEach(op -> System.out.print(op));
		if(baseControl())
		{
			switch (this.getOpt())
			{
			case 1: System.out.println("What an entertained person!\n");
			return;
			
			case 2: Games game = new Games();
					game.baseAnswer();
					this.EntertainMenu();
			break;
			
			case 3: Arts art = new Arts();
					art.baseAnswer();
					this.EntertainMenu();
			break;
			
			case 4: TV tv = new TV();
					tv.baseAnswer();
					this.EntertainMenu();
			break;
			}
		}
	}
	
	public void intervalControl()
	{
		if(this.getOpt()<1 || this.getOpt()>4)
		{
			System.out.println("I think you accidentally pressed something you should not have.\n"
					+ "The options you can choose are from 1 to 4\n");
			EntertainMenu();
		}
	}
}
