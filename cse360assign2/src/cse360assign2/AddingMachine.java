package cse360assign2;
//Name: Adryien Hayes
//CSE 360 Assignment #2
//Class ID: RB1
//Description: This program defines the class AddingMachine,
//which stores a total that can that can be added to or subtracted
//from to produce a new total.

public class AddingMachine {

	private int total;
	private String calcHistory;//Tracks the history of transactions
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		calcHistory = "0";
	}
	
	//The method getTotal() returns the current total of the AddingMachine
	public int getTotal () {
		return total;
	}
	
	//The method add(int value) adds value to the current total and updates total to the result
	public void add (int value) {
		total += value;
		calcHistory += " + " + value;//Update history
	}
	
	//The method subtract(int value) subtracts value from the current total and updates the total to the result
	public void subtract (int value) {
		total -= value;
		calcHistory += " - " + value;//Update history 
	}
	
	//The toString() method prints out the current total as a String
	public String toString () {
		return calcHistory;
	}
	
	//clear() resets the total of the AddingMachine to 0.
	public void clear() {
		total = 0;//Reset Total
		calcHistory = "0";//Reset History
	}

}
