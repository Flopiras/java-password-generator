package org.lessons.java.security;

public class PasswordGenerator {
	public static void main(String[] args) {
		
		//creare variabili 
		String firstName = "Floriana";
		String lastName = "Piras";
		String favouriteColor = "Black";
		int birthDay = 16;
		int birthMonth = 05;
		int birthYear = 1992;
		
		int sum = birthDay + birthMonth + birthYear;
		
		System.out.println(firstName + "-" + lastName + "-" + favouriteColor + "-" + sum);
	}
}
