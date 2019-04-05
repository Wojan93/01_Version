package com.OBI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;

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

	public void addTicket(Flight flight, Passenger passenger, String dataStorage) {
		Ticket ticket = new Ticket(flight, passenger);
		DataStorage dataStore = new DataStorage(dataStorage);
		dataStore.addPassengerTickets(flight, passenger);
		Random rand = new Random();
		ticket.ticketId = rand.nextInt();
	}

	public void buyTicket(Flight flight, Passenger passenger, String dataStorage) {
		if (flight.availableSeats > 0) {
			addTicket(flight, passenger, dataStorage);
			flight.availableSeats--;
		}
	}

	@Override
	public String toString() {
		return this.seatNo + " , " + this.ticketId + " , " + this.passenger + " , " + this.flight + " , " + this.price;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	
	public Passenger getPassenger() {
		return passenger;
	}
	
	
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
	public Flight getFlight() {
		return flight;
	}
}
