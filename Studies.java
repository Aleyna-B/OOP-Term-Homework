package com.mycompany.ooptermhw.study;
import java.util.ArrayList;
import com.mycompany.ooptermhw.InputControl;

public class Studies extends InputControl{
	private ArrayList<String> options = new ArrayList<String>(); {
		options.add("Do you want to understand the level of nerdiness?\n");
		options.add("(1)- No i think you are lame.\n");
		options.add("(2)- How do you usually manage your study schedule and workload?\n");
		options.add("(3)- What have you been working on lately?\n");
		options.add("(4)- Do you have a favourite subject?\n");
		options.add("(5)- How have you been liking your major so far?\n");
		}
	
	public Studies()
	{	
		System.out.println("I am a computer science student.I can be quite nerdy.\n"
				+ "Even though i sometimes complain about it, deep down i like studying.\n"
				+ "When i don't use my head for some time, it feels like my brain is melting.");
		studyMenu();		
	}
	
	public void studyMenu()
	{
		options.forEach(op -> System.out.print(op));
		if(baseControl())
		{
			switch (this.getOpt())
			{
			case 1: System.out.println("Oh stop using the application then meanie!\n");
			return;
			
			case 2: Schedule sch = new Schedule();
					sch.baseAnswer();
					this.studyMenu();
			break;
			
			case 3:	Work work = new Work();
					work.baseAnswer();
					this.studyMenu();
			break;
			
			case 4: FavSubject fav = new FavSubject();
					fav.baseAnswer();
					this.studyMenu();
			break;
			
			case 5: Major major = new Major();
					major.baseAnswer();
					this.studyMenu();
			break;
			}
		}
	}
	
	public void intervalControl()
	{
		if(this.getOpt()<1 || this.getOpt()>5)
		{
			System.out.println("I think you accidentally pressed something you should not have.\n"
					+ "The options you can choose are from 1 to 5\n");
			studyMenu();
		}
	}
}
