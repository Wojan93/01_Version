package com.OBI;

public class Ticket {
	
	double price;
	int seat;
	Passenger pass;
	Flight flig;
	
	
	
	
	public void buyTicket(Flight f, Passenger p) {
		if (f.getAmountOfSeats() > 0) {
			new Ticket (f , p);
			f.addTicket(t);
		}
	}

	
}
