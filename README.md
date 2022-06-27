<img src="https://cdn.cheapism.com/images/082516_best_food_trucks_slide_7_fs.max-784x410.jpg" alt="drawing" width="400"/>

# FoodTruckProject
## Description
Class and test app to input and rate a list of food trucks.

The user can then view:
- a list of the food truck(s) input
- the average truck rating
- the highest rated truck(s)

## Usage:
User inputs 0 to 5 truck(s) and their respective information when prompted.

User can then choose from a menu to display related truck information and then quit.

### Usage Constraints
Displaying the highest rated truck(s) will show more than one truck if they are all tied for the highest rating.

### User Inputs
- Truck name or "quit" to stop entering truck(s)
- Truck food type
- Truck rating
- Menu choice

#### User Input Constraints
- Truck rating must be an integer between 1 and 10 (inclusive)
- Menu choice must be an integer between 1 and 4 (inclusive)
- If quit is given as the first truck name, User will be be shown "TRUCK LIST IS EMPTY" on all menu choices except for exit

### Display Outputs
- Menu
- Food truck list
- Average food truck rating
- Highest rated food truck

###### Output Example
```formatted output
Welcome to the Food Truck Reviewer
  Please enter up to five trucks:

Enter the Food Truck's Name: 
Bob's Burger XPress!
Enter the Truck's Food Type: 
Gourmet fast food
Enter the Truck's Rating (1-10): 
5
Enter the Food Truck's Name: 
Snarfs
Enter the Truck's Food Type: 
The Greatest subs in the country
Enter the Truck's Rating (1-10): 
9
Enter the Food Truck's Name: 
The Pumphouse
Enter the Truck's Food Type: 
Americana
Enter the Truck's Rating (1-10): 
6
Enter the Food Truck's Name: 
Mom's 123
Enter the Truck's Food Type: 
Mom's cooking
Enter the Truck's Rating (1-10): 
9
Enter the Food Truck's Name: 
Juan's Taco Shack
Enter the Truck's Food Type: 
Tacos
Enter the Truck's Rating (1-10): 
8

MENU
  Select one of the following:
    1 List Food Trucks
    2 Show Average Rating
    3 Show Highest Rated Food Truck(s)
    4 Quit
1
FOOD TRUCK LIST
---------------
Food Truck [4601], Truck Name: [Bob's Burger XPress!], Food Type: [Gourmet fast food], Truck Rating: [5]
Food Truck [4602], Truck Name: [Snarfs], Food Type: [The Greatest subs in the country], Truck Rating: [9]
Food Truck [4603], Truck Name: [The Pumphouse], Food Type: [Americana], Truck Rating: [6]
Food Truck [4604], Truck Name: [Mom's 123], Food Type: [Mom's cooking], Truck Rating: [9]
Food Truck [4605], Truck Name: [Juan's Taco Shack], Food Type: [Tacos], Truck Rating: [8]

MENU
  Select one of the following:
    1 List Food Trucks
    2 Show Average Rating
    3 Show Highest Rated Food Truck(s)
    4 Quit
2
Average Food Truck Rating is: 7.4

MENU
  Select one of the following:
    1 List Food Trucks
    2 Show Average Rating
    3 Show Highest Rated Food Truck(s)
    4 Quit
3
The Highest Rated Food Truck(s):
Food Truck [4602], Truck Name: [Snarfs], Food Type: [The Greatest subs in the country], Truck Rating: [9]
Food Truck [4604], Truck Name: [Mom's 123], Food Type: [Mom's cooking], Truck Rating: [9]

MENU
  Select one of the following:
    1 List Food Trucks
    2 Show Average Rating
    3 Show Highest Rated Food Truck(s)
    4 Quit
4
Enjoy the food!
```

## Technologies Used
- Java 8
- JUnit 4
- Eclipse AArch64
- MacOS on Silicon

## Topics
- Class declaration
- Static variable initialization
- Looping (for, enhanced for, and while)
- Encapsulation
- Visibility
- JUnit tests

## What I Learned
- Object instances created in a loop only exist inside said loop
- Authoring JUnit tests
- Extracting and validating an int out of a String
- More productivity / quality of life Eclipse shortcuts
- Using TODO in Eclipse to keep track as I go