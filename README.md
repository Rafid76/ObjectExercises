# Object Exercises

# Bottle.java

Initialization:

The Bottle class has two constructors. One initializes a bottle with default attributes (color: "", water level: 0, full: true), while the other allows the user to specify the color.
Getters and Setters:

getWaterLevel(): Returns the current water level.
getColor(): Returns the color of the bottle.
getIsFull(): Returns true if the bottle is full, false otherwise.
changeWaterLevel(int waterLevel): Sets the water level to the provided value.
changeColor(String color): Sets the color of the bottle to the provided value.
changeIsFull(boolean isFull): Sets the full status of the bottle.
Basic Operations:

addWater(): Adds 2 units of water to the bottle, up to a maximum of 10 units. Displays current water level and status.
leakWater(): Removes 2 units of water from the bottle. Displays current water level and status.
Advanced Operations:

fillWaterBottle(): Fills the bottle to its maximum capacity (10 units). Displays progress and status.
emptyWaterBottle(): Empties the bottle completely. Displays progress and status.
Menu:

The program prompts the user to enter the color of the bottle at the start.

The user is then presented with a menu:

Option 1: Add water
Option 2: Leak water
Option 3: Fill bottle
Option 4: Empty bottle
Option 5: Quit program
The program continues to display the menu until the user chooses to quit.

 
