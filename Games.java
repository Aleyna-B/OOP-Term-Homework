package com.mycompany.ooptermhw.entertainment;
import com.mycompany.ooptermhw.ISubAnswer;
import com.mycompany.ooptermhw.InputControl;

public class Games extends InputControl implements ISubAnswer{
	public Games() {}
	public void baseAnswer()
	{
		System.out.println("I like playing board games or mind games with friends from time to time,\n"
				+ "but i am not really into video games. I just can't play them.\n"
				+ "What kinds of games do you play?\n"
				+ "(1)- Video games\n(2)- Board games\n(3)- Mind games\n(4)- Physical games");
		baseControl();
		
		if(this.getOpt()==1) {
			System.out.println("What type?\n(1)- Online games\n(2)- Mobile games\n(3)- PC games\n(4)- Console games");
			baseControl();
			System.out.println("It is great i think...I don't really know much but good for you!\n"
					+ "I am sure there is a debate going on about which is better but \nit is always better if you don't"
					+ "engage in social media craziness.\n");
			}
		
		else if(this.getOpt()==2) System.out.println("Woah a monopoly master\n");
		else if(this.getOpt()==3) {
			System.out.println("Oh do you know how to play chess. I am bad at it. You can help me maybe.\n(1)- Yes\n(2)- No");
			baseControl();
			if(this.getOpt()==1) System.out.println("Cool!\n");
			else if(this.getOpt()==2||this.getOpt()==3||this.getOpt()==4) 
				System.out.println("Too bad, here is how it is: Each player strategically moves 16 pieces "
					+ "on a checkered board\n aiming to checkmate the opponent's king, protecting their own, "
					+ "using specific moves\n for each pieceto control the board and capture the opponent's pieces.\n");
			}
		
		else if(this.getOpt()==4) {
			System.out.println("That isn't for me. I can hurt myself just by walking. Do you play"
					+ " basketball?\n(1)- Yes\n(2)- No");
			baseControl();
			if(this.getOpt()==1) System.out.println("You must look like a tower that is about to collapse\n");
			else if(this.getOpt()==2||this.getOpt()==3||this.getOpt()==4) 
				System.out.println("Shorty\n");
			}
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
