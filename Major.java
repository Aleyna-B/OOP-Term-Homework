package com.mycompany.ooptermhw.study;
import com.mycompany.ooptermhw.ISubAnswer;
import com.mycompany.ooptermhw.InputControl;

public class Major extends InputControl implements ISubAnswer{
	public void baseAnswer()
	{
		System.out.println("I actually like my major alright. I am quite into the programming side of things.\nAre you also a cs major?\n(1)- Yes\n(2)- No");
		baseControl();
		if(this.getOpt()==1) System.out.println("Oh how nice!\n");
		else if(this.getOpt()==2) 
		{
		System.out.println("No worries, you can always change it.");	
		}
	}
	
	public void intervalControl()
	{
		if(this.getOpt()<1 || this.getOpt()>2)
		{
			System.out.println("I think you accidentally pressed something you should not have.\n"
					+ "The options you can choose are from 1 to 2\n");
		}
	}
}
