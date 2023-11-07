import java.util.Scanner;

public class RollerCoaster {
	
	//VARIABLES
	int speed;
	int distance;
    int time;
    
    //CONSTRUCTORS
    public RollerCoaster()
    {
    	speed = 0;
    	distance = 0;
    	time = 0;
    }
    
    public RollerCoaster(int speed, int distance, int time)
    {
    	this.speed = 0;
    	this.distance = 0;
    	this.time = 0;
    }
	
    //METHODS
    
    //GETTERS
    public int getSpeed()
    {
    	return this.speed;
    }
    public int getDistance()
    {
    	return this.distance;
    }
    public int getTime()
    {
    	return this.time;
    }
	
    //SETTERS
    public void changeSpeed(int speed)
    {
    	this.speed = speed;
    }
    public void changeDistance(int distance)
    {
    	this.distance = distance;
    }
    public void changeTime(int time)
    {
    	this.time = time;
    }
    public void calculateSpeed()
    {
    	this.speed = this.distance * this.time;
    }

    

    public static void main (String[] args) {
//	Make a class called RollerCoaster with the following variables
//	Speed
//	Distance
//	Time
//
//	Make the following methods
//	Getters for Distance and Time
//	Setters for Distance and Time
//	GetSpeed (Speed is = Distance/Time)
//	Main Method
//	1) Create RollerCoaster 
//	2) Get Speed
//	3) Quit

    	Scanner console = new Scanner(System.in);
    	boolean isQuitting = false;
    	
    	RollerCoaster userRollerCoaster = new RollerCoaster();
    	
    	do
    	{
    	
    	System.out.println("Please enter the corresponding number");
        System.out.println("1) Create RollerCoaster");
    	System.out.println("2) Get Speed");
    	System.out.println("3) Quit");
    	
    	int input = Integer.parseInt(console.nextLine());
    	
    	if(input == 1)
    	{
    		System.out.println("Please enter the distance");
    		int distance = Integer.parseInt(console.nextLine());
    		userRollerCoaster.changeDistance(distance);
    		
    		System.out.println("Please enter the time");
    		//int time = Integer.parseInt(console.nextLine());
    		//userRollerCoaster.changeTime(time)
    		userRollerCoaster.changeTime(Integer.parseInt(console.nextLine()));
    		
    		userRollerCoaster.calculateSpeed();
        }
    	else if(input == 2)
    	{
    		System.out.println(userRollerCoaster.getSpeed());
    	}
    	else if(input == 3)
    	{
    		System.out.println("Quit Program");
    			isQuitting = true;
    	}
    	
    	} while(isQuitting == false); 
    	
    }
}
    	
    	
    


