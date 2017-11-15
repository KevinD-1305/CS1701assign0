import java.util.Random; 										//import RNG
import java.util.Scanner;										//import scanner
//import edu.cmu.ri.createlab.terk.robot.finch.Finch; 			//import finch API

public class Simon {
	//private static Finch myF = null;							//initialise finch
	//myF = new Finch();										//create finch object
	public static Random rand = new Random(); 					//create Random object
	public static int levelCounter = 0, i = 0;					//implement level counter
	public static int[] rngArray = new int[20], inputArray = new int[20]; //implement arrays to hold I/O values
	public static boolean gameLoop = true;						//implement booleans to create looping game.
	
	
	public static void main(String args[]) //basic menu and utility class
	{
		while (gameLoop = true)	//game loops indefinitely until player chooses to exit. 
		{
			System.out.println("1) Start game");//display menu
			System.out.println("2) Options");
			System.out.println("3) Exit");
			Scanner inputText = new Scanner(System.in);//read user input
			
			if(inputText.toString() == "1")//user input is 1)start game
			{
				startGame();//call startGame function and begin 1 instance of a game. 
			}
			else if(inputText.toString() == "2")//user input is 2)options
			{
				optionsMenu();//display options menu
			}
			else if(inputText.toString() == "3")//user input is 3)exit
			{
				System.exit(0);
			}
			else//ensures the user input can only be one of the given values. 
			{
				System.out.println("Please input a value 1-3");
			}
		}
	}
	
	public static void startGame() //class for actual game code
	{
		for(i=0;i<20;i++)
		{
			rngArray[i] = rand.nextInt(3);	//fills array with values between 0 and 2, which correspond to the 3 finches in the game. 
		}
		
		for(levelCounter=1;levelCounter<20;levelCounter++)
		{ 
			System.out.println("Level " + levelCounter);	//start new level
			
			for (i=0;i<levelCounter;i++) //display <levelCounter> lights
			{
				if (rngArray[i] == 0) //display engine
				{
				//	myF.setLED(0,0,255,1000); //blue light 1 second
					System.out.println("blue");
				}
				else if (rngArray[i] == 1)
				{
				//	myF.setLED(0,255,0,1000); //green light 1 second
					System.out.println("green");
				}
				else if (rngArray[i] == 2)
				{
				//	myF.setLED(255,0,0,1000); //red light 1 second
					System.out.println("red");
				}
				else
				{
					System.out.println("end of level");
				}
				
				//myF.setLED(0,0,0,500); //half-second break between lights 
				
				//input component - consider a separate class for this. 
				Scanner debugInput = new Scanner(System.in); //debug input to be used if finches are unavailable 
				
			}
			//myF.quit(); //stops finch running, allowing script to run again. 
		}
	}
	public static void optionsMenu()//class for options menu
	{
		System.out.println("1) give me options");
	}
}
