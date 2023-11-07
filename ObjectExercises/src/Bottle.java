import java.util.Scanner;

public class Bottle {
	
	// VARIABLES
	int waterLevel;
	String color;
	boolean isFull;
	
	//CONSTRUCTORS
	public Bottle()
	{
		waterLevel = 0;
		color = "";
		isFull = true;
		
	}
	
	public Bottle(String color)
	{
		this.waterLevel = 0;
		this.color = color;
		this.isFull = false;
	}
	
	//METHODS
	
	//Getters
	public int getWaterLevel()
	{
		return this.waterLevel;
	}
	public String getColor()
	{
		return this.color;
	}
	public boolean getIsFull()
	{
		return this.isFull;
	}
	
	//Setters
	public void changeWaterLevel(int waterLevel)
	{
		this.waterLevel = waterLevel;
	}
	public void changeColor(String color)
	{
		this.color = color;
	}
	public void changeIsFull(boolean isFull)
	{
		this.isFull = isFull;
	}
	
	public void addWater()
	{
		System.out.println("Current Water Level: " + this.waterLevel);
		if(this.waterLevel >=0 && this.waterLevel <=8)
		{
			this.waterLevel = this.waterLevel + 2;
			System.out.println("Current Water Level: " + this.waterLevel);
		}
		else if (this.waterLevel == 9 || this.waterLevel == 10)
		{
			this.waterLevel = 10;
			this.isFull = true;
			System.out.println("The water bottle is now full!");
			System.out.println("Current Water Level: " + this.waterLevel);
		}
		else
		{
			System.out.println("Water Bottle is already full");
		}
	}
	
	public void leakWater()
	{
		System.out.println("Current Water Level: " + this.waterLevel);
		if (this.waterLevel >= 0 && this.waterLevel <=10)
		{
			waterLevel = waterLevel - 2;
			System.out.println("Current Water Level: " + this.waterLevel);
			if (this.waterLevel <= 0)
			{
				this.isFull = false;
			 	System.out.println("This water bottle is now empty");
			}
				
		}
			
	}
		
		public void fillWaterBottle()
		{
			if(this.waterLevel >=0 && this.waterLevel <=8)
			{
				System.out.println("Current Water Level: " + this.waterLevel);
				
				for(int i = this.waterLevel; i<=10; i = i + 2 ) 
				{
					System.out.println("Water Level: " + this.waterLevel);
					this.waterLevel = this.waterLevel + 2;
				}
				
				System.out.println("Water Bottle successfully filled");
			}
			else
			{
				System.out.println("Sorry the water bottle is already full");
			}
		}
		
		public void emptyWaterBottle()
		{
			if(this.waterLevel >=0 && this.waterLevel <=10)
			{
				for(int j = this.waterLevel; j>=0; j = j - 2)
				{
					System.out.println("Water Level: " + this.waterLevel);
					this.waterLevel = this.waterLevel - 2;
				}
				
				System.out.println("The water bottle is now empty");
				
			}
			else
			{
				System.out.println("Sorry the water bottle is already empty");
			}
		}
		

	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Make a class called Bottle
//		Give it variables waterLevel, color, isFull
//		NOTE: When waterLevel reaches 10 the bottle is considered full
//
//		Make two constructors for it (1 that will set color automatically to blue and another that allows choice of color | 
//      all bottles should automatically be empty 
//
//		Make getter and setter methods for the above variables
//
//		Make a method that is called addWater (which adds 2 to the current level of the water in the bottle) | 
//		make sure that if the water amount goes over 10 its reset to 10 and that isFull becomes true | also make sure that 
//		if someone tries to add more water when bottle is already full then it will give them message saying “Sorry the Water Bottle is already full”
//
//		Make a method called leakWater which removes 2 to the current level of the water bottle
//
//		Make a main method that takes in user input for color of bottle but starts off with 0 water level | 
//		then it gives them menu option to 1) add water or 2) leak water 3) fill bottle 4) empty bottle 5) quit program
//
//		BONUS
//		Make a method called fillWaterBottle that fills up the entire bottle to level 10 automatically and outputs progress as its doing it
//		Eg
//		Current Water Bottle Water Level: 4
//		Filling Water Bottle
//		Water Level: 6
//		Water Level: 8
//		Water Level: 10
//
//		Water Bottle successfully filled!
		
		Scanner scanner = new Scanner(System.in);
		
		boolean isQuitting = false;
		
		System.out.println("Enter the color");
		String color = scanner.nextLine();
		
		do
		{

		
		System.out.println("Please enter the corresponding number");
		System.out.println("1) Add water");
		System.out.println("2) Leak water");
		System.out.println("3) Fill bottle");
		System.out.println("4) Empty bottle");
		System.out.println("5) Quit program");
		
		int input = Integer.parseInt(scanner.nextLine());
		
		
		Bottle userBottle = new Bottle(color);
		
		
		if(input == 1)
		{
			userBottle.addWater();
		}
		else if(input == 2)
		{
			userBottle.leakWater();
		}
		else if (input == 3)	
		{
			userBottle.fillWaterBottle();
		}
		else if (input == 4)
		{
			userBottle.emptyWaterBottle();
		}
		else if (input == 5)
		{
			System.out.println("Quitting program");
			isQuitting = true;
		}
		else 
		{
			System.out.println("Sorry, you must enter a number 1-5");
		}
		}while(isQuitting == false);
		

	}

}
