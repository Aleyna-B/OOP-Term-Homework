package com.mycompany.ooptermhw.other;
import com.mycompany.ooptermhw.ISubAnswer;
import com.mycompany.ooptermhw.InputControl;

public class Pet extends InputControl implements ISubAnswer{
	public Pet()
	{
	}
	public void baseAnswer()
	{
		System.out.println("I have the cutest cat in the world. His fur is very dense and long so it is really enjoyable petting him if he is not grumpy.\n"
				+ "However, whenever he gets diarrhea things get a little messy because of the long fur.\n"
				+ "But it is ok we love him. He also loves eating a lot. He will jump on the kitchen counter when \nwe are not looking and steal food."
				+ "How cute!\nDo you have a pet.");
		System.out.println("(1)- Cat(s)\n(2)- Dog(s)\n(3)- Birb\n(4)- Fish\n(4)- Guinea pig(s)\n(5)- None");
		baseControl();
		if(this.getOpt()==1) System.out.println("No kidding?! You gotta tell me everything about yours sometime!\n");		
		else if(this.getOpt()==2) System.out.println("Doggos are usually more friendly than cattos but that also means a lot of poopie walks!\n");
		else if(this.getOpt()==3) 
		{
			System.out.println("Oh can it talk? Talking birbs can be either funny or scary.\n(1)- Yes\n(2)- No\n");
			baseControl();
			if(this.getOpt()==1) System.out.println("A lot of screaming in the house!");
			else if(this.getOpt()==2)System.out.println("Oh..Is it maybe depressed..?");
		}
		else if(this.getOpt()==4) System.out.println("I knew a friend who had guinea pigs.\n");
		else if(this.getOpt()==5) System.out.println("Aww that can get lonely i guess but it is better to not have any if you are not sure if you can take good care of them.\n");
	}
	
	public void intervalControl()
	{
		if(this.getOpt()<1 || this.getOpt()>5)
		{
			System.out.println("I think you accidentally pressed something you should not have.\n"
					+ "The options you can choose are from 1 to 5\n");
		}
	}

}
