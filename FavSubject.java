package com.mycompany.ooptermhw.study;
import com.mycompany.ooptermhw.ISubAnswer;
import com.mycompany.ooptermhw.InputControl;

public class FavSubject extends InputControl implements ISubAnswer{
	public void baseAnswer()
	{
		System.out.println("I am not sure about favourite subjects. Definetely not abstract maths classes "
				+ "or data structures.\nCan be OOP or EE circuits.\nDid this answer your question?\n(1)- Yes\n(2)- No");
		baseControl();
		if(this.getOpt()==1) System.out.println("Marvellous.\n");
		else if(this.getOpt()==2) 
		{
		System.out.println("Do you know the video about english being someones favourite language?\n(1)- Yes\n(2)- No");	
		baseControl();
		if(this.getOpt()==1) System.out.println("Hahah\n");
		else if(this.getOpt()==2) System.out.println("Watch this: https://youtu.be/39UDZMgPg5k?feature=shared \n");
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
	
	public FavSubject() {}
}
