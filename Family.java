package com.mycompany.ooptermhw.other;
import com.mycompany.ooptermhw.ISubAnswer;
import com.mycompany.ooptermhw.InputControl;

public class Family extends InputControl implements ISubAnswer{
	public Family()
	{
	}
	public void baseAnswer()
	{
		System.out.println("I happen to have two parents and an older sibling."
				+ "\nWhat do you have at home.");
		System.out.println("(1)- Younger sibling(s)\n(2)- Older sibling(s)\n(3)- None");
		baseControl();
		if(this.getOpt()==1) System.out.println("You must be a good baby sitter. Good luck with that.\n");		
		else if(this.getOpt()==2) System.out.println("Ah, the joys of being the younger one – master of dodging hand-me-downs and bringing orders.\n");
		else if(this.getOpt()==3) System.out.println("You missed out on sibling shenanigans, huh? Solo adventures can be pretty epic too!\n");
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
