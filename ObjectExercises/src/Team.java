import java.util.Scanner;

public class Team {
	
	// VARIABLES
	String city;
	String name;
	int numofplayers;
	
	// CONTRUCTORS
	public Team()
	{
		city = "";
		name = "";
		numofplayers = 0;
	}

	public Team(String city, String name, int numofplayers)
	{
		this.city = city;
		this.name = name;
		this.numofplayers = numofplayers;
	}
	
	// METHODS
	
	
	// Getters
	public String getCity()
	{
		return this.city;
	}
	public String getName()
	{
		return this.name;
	}
	public int getNumOfPlayers()
	{
		return this.numofplayers;
	}
	
	public String toString()
	{
		return "Team [Team City: " + this.city + " | Team Name: " + this.name + " | # of Players: " + this.numofplayers + "]";
	}
	
	// Setters
	public void changeCity(String city)
	{
		this.city = city;
	}
	public void changeName(String name)
	{
		this.name = name;
	}
	public void changeNumOfPlayers(int numofplayers)
	{
		this.numofplayers = numofplayers;
	}
	
	// Main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Make a class called Team with the following attributes/variables: City, Name, number of players
//Make a default and custom constructor
//Make getter and setter methods for all the above attributes
//Make a main method to get input from user to create a Team
// When you have a fully working program as a mini challenge 
//try to make it so that at the end the user can choose to exit the program or make another Team

		
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter the team's city");
		String city = console.nextLine();
		
		System.out.println("Enter the team name");
		String name = console.nextLine();
		
		System.out.println("Enter the number of players");
		int numofplayers = Integer.parseInt(console.nextLine());
		
		Team userTeam = new Team(city, name, numofplayers);
		System.out.println(userTeam.toString());

	}

}
