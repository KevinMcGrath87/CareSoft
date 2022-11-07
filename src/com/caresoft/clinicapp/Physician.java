package com.caresoft.clinicapp;

public class Physician extends User implements HIPAACompliantUser {

	public Physician(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean assignPin(int pin) {
		if(String.valueOf(pin).length() == 4) {
			this.pin = pin;
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if(this.id == confirmedAuthID) {
			return true;
		}
		return false;
	}

}
