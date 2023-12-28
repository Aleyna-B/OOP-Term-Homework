package com.mycompany.ooptermhw.study;
import com.mycompany.ooptermhw.ISubAnswer;
import com.mycompany.ooptermhw.InputControl;

public class Schedule extends InputControl implements ISubAnswer{
	public void baseAnswer()
	{
		System.out.println("I try to revise the topics every week as much as i can.\n"
				+ "If it is a subject that i do not really like or if a have "
				+ "a data structures homework, it gets harder to study. I try not to use "
				+ "social media to not waste my time but i sometimes fail to do so.\n"
				+ "Was this answer satisfactory?\n(1)- Yes (2)- No");
		baseControl();
		if(this.getOpt()==1) System.out.println("Alright then.\n");
		else if(this.getOpt()==2) {
		System.out.println("What else can i say...\nDid you know that there are at least 300 horse breeds out there?\n"
				+ "(1)- Yes (2)- No");
		baseControl();
		if(this.getOpt()==1) System.out.println("Wow...Why?\n");
		else if(this.getOpt()==2) System.out.println("Well this should satisfy your hunger to have profound knowledge.\n");
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
	
	public Schedule() {}
}
