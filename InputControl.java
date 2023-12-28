package com.mycompany.ooptermhw;
import java.util.Scanner;

public abstract class InputControl {
	private int opt=0;
	private String dispose;	
	Scanner scan = new Scanner(System.in);
	
	public boolean baseControl()
	{
		if(scan.hasNextInt())
		{
			this.setOpt(scan.nextInt());
			this.intervalControl();	
			return true;
		}
		else
		{
			this.setDispose(scan.next());//have to dispose the non-integer value or scanner crashes
			System.out.println("I think you accidentally pressed something else.\n"
					+ "Do you see anything other than integer numbers as an option?"
					+ "\nBe more careful not to break the system please, this is important for my GPA.\n");
			return false;
		}	
	}
	
	public abstract void intervalControl();	//to be implemented according to menus option interval 

	public int getOpt() {
		return opt;
	}
	public void setOpt(int opt) {
		this.opt = opt;
	}

	public String getDispose() {
		return dispose;
	}

	public void setDispose(String dispose) {
		this.dispose = dispose;
		this.dispose = null;	//so the garbage collector may dispose it earlier
	}
}
