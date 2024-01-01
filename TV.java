package com.mycompany.ooptermhw.entertainment;
import com.mycompany.ooptermhw.ISubAnswer;
import com.mycompany.ooptermhw.InputControl;

public class TV extends InputControl implements ISubAnswer{
	public TV() {}
	public void baseAnswer()
	{
		System.out.println("I love watching sitcoms mainly because there are easy to watch and don't give me anxiety.\n"
				+ "I do not prefer watching Turkish TV though, as there is always some mindless thing going on.\n"
				+ "I also watch anime sometimes. I prefer lighthearted ones in anime as well.\n"
				+ "Do you have a favourite from famous sitcoms?\n"
				+ "(1)- No\n(2)- Friends\n(3)- HIMYM\n(4)- TBBT");
		baseControl();
		if(this.getOpt()==1) System.out.println("That's fair, everyone has different tastes!\n");
		else if(this.getOpt()==2) System.out.println("That's an all time favourite.\n");
		else if(this.getOpt()==3) System.out.println("Cool, never watched it though.\n");
		else if(this.getOpt()==4) System.out.println("That one has a special place for me. It got kinda boring after sixth season though.\n");
	}
	
	public void intervalControl()
	{		
		if(this.getOpt()<1 || this.getOpt()>4)
		{
			System.out.println("I think you accidentally pressed something you should not have.\n"
					+ "The options you can choose are from 1 to 4\n");
		}
	}
}
