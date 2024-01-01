package com.mycompany.ooptermhw.food;
import com.mycompany.ooptermhw.ISubAnswer;
import com.mycompany.ooptermhw.InputControl;

public class Beverages extends InputControl implements ISubAnswer{
	public Beverages() {}
	public void baseAnswer()
	{
		System.out.println("In a day i have 1 or 2 cups of coffee or tea,but not all of them in one day"
				+ "\nDo you want to have some sometime? I won a coupon from a coffee place the other day.\n"
				+ "(1)- Yes\n(2)- No\n");
		baseControl();
		if(this.getOpt()==1) System.out.println("Nice\n");
		else if(this.getOpt()==2) System.out.println("Alright\n");
	}
	
	public void intervalControl()
	{
		if(this.getOpt()<1 || this.getOpt()>2)
		{
			System.out.println("I think you accidentally pressed something you should not have.\n"
					+ "The options you can choose are from 0 to 2. Yes or No\n");
		}
	}
}
