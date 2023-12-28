package com.mycompany.ooptermhw.food;
import java.util.ArrayList;

import com.mycompany.ooptermhw.InputControl;

public class ForFood extends InputControl{
			
	private ArrayList<String> options = new ArrayList<String>(); {
	options.add("Do you want to be deeply informed about my eating habits or are you normal?\n");
	options.add("(1)- Thanks this is enough.\n");
	options.add("(2)- What is your favourite desert?\n");
	options.add("(3)- What is your favourite soup?\n");
	options.add("(4)- What kinds of beverages do you usually have?\n");
	}
	
	public ForFood()
	{
		
		System.out.println("I nearly always eat eggs for breakfast because proteins keeps you full but i am actually starting to get an ick from it.\n"
				+ "For other meals i eat whatever i am given, i am not realy a picky eater but meat meals have a special place for me.\n"
				+ "I think i had one last week.\nI also have a sweet tooth.\n");
		foodMenu();		
	}
	
	public void foodMenu()
	{
		options.forEach(op -> System.out.print(op));
		if(baseControl())
		{
			switch (this.getOpt())
			{
			case 1: System.out.println("Enjoy all your meals then!\n");
			return;
			
			case 2: Deserts desert = new Deserts();;
					desert.baseAnswer();
					this.foodMenu();
			break;
			
			case 3:	Soup soup = new Soup();;
					soup.baseAnswer();
					this.foodMenu();
			break;
			
			case 4: Beverages beve = new Beverages();
					beve.baseAnswer();
					this.foodMenu();
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
			foodMenu();
		}
	}
}
