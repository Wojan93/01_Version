package com.OBI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;
import java.util.stream.Stream;

public class Ticket {

	double price;
	int seatNo;
	int ticketId;
	Passenger passenger;
	Flight flight;

	public Ticket(Flight flight, Passenger passenger) {
		this.flight = flight;
		this.passenger = passenger;

	}

	public void addTicket() {
		Ticket t = new Ticket(this.flight, this.passenger);
		Random rand = new Random();
		t.ticketId = rand.nextInt();

	}

	public void buyTicket(Flight flight, Passenger passenger) {
		if (flight.availableSeats > 0) {
			addTicket();
			flight.availableSeats--;
			// hm.put(passenger.getName(), flight.getDepartureDateTime());
		}
	}

	@Override
	public String toString() {
		return this.seatNo + " , " + this.ticketId + " , " + this.passenger + " , " + this.flight + " , " + this.price;
	}

}
