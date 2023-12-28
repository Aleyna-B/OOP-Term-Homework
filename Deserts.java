package com.mycompany.ooptermhw.food;
import com.mycompany.ooptermhw.ISubAnswer;
import com.mycompany.ooptermhw.InputControl;

public class Deserts extends InputControl implements ISubAnswer{
	public Deserts()
	{
	}
	public void baseAnswer()
	{
		System.out.println("I personally like Atacama.\nI recently found out that NASA uses this place to test their instruments for Mars."
				+ "\nWhat is yours?");
		System.out.println("(1)- Atacama\n(2)- Gobi\n(3)- Sahara");
		baseControl();
		if(this.getOpt()==1)
		{
			System.out.println("I said it first.\n");
		}
		else if(this.getOpt()==2 || this.getOpt()==3) System.out.println("Atacama is better but it is your choice of course.\n");
	}
	
	public void intervalControl()
	{
		if(this.getOpt()<1 || this.getOpt()>3)
		{
			System.out.println("I think you accidentally pressed something you should not have.\n"
					+ "The options you can choose are from 1 to 3\n");
		}
	}
}
