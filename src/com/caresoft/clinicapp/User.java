package com.caresoft.clinicapp;

import java.util.Random;

public class User {
	Random generator = new Random();
	protected Integer id;
	protected int pin;
	
	private String generatePin() {
		String pinNumber = "";
		for(int x =0; x<4; x++) {
			pinNumber = pinNumber + generator.nextInt(10);
		}
		return pinNumber;
	}
	
	
    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
    
	public User(Integer id) {
		this.id = id;
		this.pin = Integer.parseInt(generatePin());
	}
    
    // TO DO: Getters and setters
    // Implement a constructor that takes an ID
}

