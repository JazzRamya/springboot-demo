package MainApplication;

import controller.MainController;

public class MainApp 
{
	
	//static private int i;
	public static void main(String[] args) 
	{
		//MainApp o = new MainApp();
		//MainApp.i = 10;
	    boolean exit=true;
	    do 
	    {
	    	MainController.displayOptions();
	    	System.out.println("Do you want to continue perss 1");
	    	int num=MainController.scanner.nextInt();
	    	exit=(num==1) ?true:false;	
	    }
	    while(exit);
	}
}
