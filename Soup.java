package com.mycompany.ooptermhw.food;
import java.util.ArrayList;

import com.mycompany.ooptermhw.ISubAnswer;
import com.mycompany.ooptermhw.InputControl;

public class Soup extends InputControl implements ISubAnswer{
	private int souptype=0;
	public void baseAnswer()
	{
		System.out.println("I guess i like mushroom soup.\nApparently you can put in lots of ingrediends in it\n"
				+ "as well as differents kinds of mushrooms.\nIn some cultures, mushroom soup has even traditional or ceremonial significance."
				+ "\nWhat soup do you like?\n(1)- Mercimek(Lentil)\n(2)- Tomato\n(3)- Tarhana");
		baseControl();
		this.setSouptype(getOpt());
		extraAnswer(this.getSouptype());
	}
	
	public void intervalControl()
	{
		if(this.getOpt()<1 || this.getOpt()>3)
		{
			System.out.println("I think you accidentally pressed something you should not have.\n"
					+ "The options you can choose are from 0 to 3\n");
		}
	}

	ArrayList<String> recipes = new ArrayList<String>();
	{
		recipes.add("Sauté onions, carrots, and celery until soft.\nAdd rinsed lentils, broth, "
				+ "and diced tomatoes. Simmer until lentils are tender.\nSeason with salt, pepper, "
				+ "and a dash of cumin for depth.\nGarnish with fresh parsley before serving.\n");
		recipes.add("Sauté onions and garlic until golden. Add canned tomatoes, broth.\nSimmer, then "
				+ "blend until smooth. Finish with a swirl of cream and fresh basil.\n");
		recipes.add("Mix tarhana with water or broth, simmering until it thickens.\nAdd chopped "
		+ "vegetables like peppers, onions, and tomatoes.\nSeason with salt, pepper, and a hint of paprika.\n");
	}
	public void extraAnswer(int souptype)
	{
		System.out.println("Do you know how to make it?");
		System.out.println("(1)- Yes\n(2)- Not sure\n(3)- No");
		baseControl();
		if(this.getOpt()==1) System.out.println("Then cook me some one day!\n");
		else if(this.getOpt()==3) System.out.println("That means no soup for you!\n");
		else if(this.getOpt()==2)System.out.println(recipes.get(souptype));
	}

	public Soup() {}
	public int getSouptype() {
		return souptype;
	}

	public void setSouptype(int souptype) {
		this.souptype = souptype;
	}
}
