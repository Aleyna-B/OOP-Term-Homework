package com.mycompany.ooptermhw.entertainment;
import com.mycompany.ooptermhw.ISubAnswer;
import com.mycompany.ooptermhw.InputControl;

public class Arts extends InputControl implements ISubAnswer{
	public Arts() {}
	public void baseAnswer()
	{
		System.out.println("I listen to classical music regulary. I actually play the violin myself!\n"
				+ "Haven't been playing for a few years now, i need to get the bow repaired.\n"
				+ "I of course listen to other kinds of music too but i am not sure if we can count modern music as arts.\n"
				+ "Other than that i guess i like looking at sculptures and paintings.\n"
				+ "What do you like?\n(1)- Music\n(2)- Visual arts\n(3)- Nothing really");
		baseControl();
		if(this.getOpt()==1) System.out.println("You should definitely give this a listen then.\n"
				+ "She is my favourite. https://youtu.be/2Q_DzWUvcL8?feature=shared \n");
		else if(this.getOpt()==2) {
		System.out.println("Well it does get boring after some time doesn't it.\n"
				+ "(1)- Yes (2)- No");
		baseControl();
		if(this.getOpt()==2) System.out.println("You must really like it then! You might like this: https://youtu.be/h-7rZ4G1f0w?feature=shared \n"
				+ "He recently got divorced because stalkers kept harassing his wife.Fame can easily become a curse.\n");
		else if(this.getOpt()==1||this.getOpt()==3) System.out.println("Yeah..");
		}
		else if(this.getOpt()==3) System.out.println("That's sad for you man.\n");
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
