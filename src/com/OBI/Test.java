package com.OBI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.stream.Stream;

public class Test {
	public static void main(String args[]) {

		Airport airport2 = new Airport("VLC", "Valencia", "Aeropuerto de Valencia");
		Airport airport3 = new Airport("LCY", "London", "London City Airport");
		Airport airport4 = new Airport("OSL", "Oslo", "Oslo-Gardermoen"); 
		
		Passenger passenger2 = new Passenger("Piotr Kubica", "TRF690204", LocalDate.of(1991, Month.FEBRUARY,19)); 
		Passenger passenger3 = new Passenger("Jerzy Kosiñski", "CYY369123",LocalDate.of(1995, Month.APRIL, 1)); 
		Passenger passenger4 = new Passenger("Anna Domagala", "SJC291498", LocalDate.of(1989, Month.MAY, 3));
		
		DataStorage storeFirst = new DataStorage("First");
		storeFirst.addPassenger("Piotr Kubica", "TRF690204", LocalDate.of(1991, Month.FEBRUARY,19));
		storeFirst.addPassenger("Jerzy Kosiñski", "CYY369123",LocalDate.of(1995, Month.APRIL, 1)); 
		storeFirst.addPassenger("Anna Domagala", "SJC291498", LocalDate.of(1989, Month.MAY, 3));
		
		Flight flight2 = new Flight(airport2, airport3, 200, LocalDateTime.of(2019, Month.JANUARY, 12, 10, 40, 00));
		Flight flight3 = new Flight(airport3, airport4, 230, LocalDateTime.of(2019, Month.JANUARY, 1, 8, 00, 00));
		Flight flight4 = new Flight(airport3, airport2, 120, LocalDateTime.of(2019, Month.JANUARY, 1, 10, 00, 00));
		
		storeFirst.addFlight(airport2, airport3, 200, LocalDateTime.of(2019, Month.JANUARY, 12, 10, 40, 00));
		storeFirst.addFlight(airport3, airport4, 200, LocalDateTime.of(2019, Month.JANUARY, 12, 10, 40, 00));
		
		
		Ticket ticket2 = new Ticket(flight2, passenger2);
		Ticket ticket3 = new Ticket(flight3, passenger3);
		Ticket ticket4 = new Ticket(flight4, passenger4);
		
		
		storeFirst.addPassengerTickets(flight2, passenger2);
		
		
		storeFirst.displayPassengerByName();
		storeFirst.displayPassengerByBornDate();
		
		storeFirst.removePassenger(passenger4);
		storeFirst.displayPassengerByName();
		
		
		storeFirst.addPassengerTicketsObj(ticket2);
		storeFirst.addPassengerTicketsObj(ticket3);
		storeFirst.addPassengerTicketsObj(ticket4);
		storeFirst.displayPassengerTickets();
		storeFirst.removeTicket(ticket4);
		storeFirst.displayPassengerTickets();
		
		storeFirst.searchPassengerTickets();
	}
}



//Ticket tic = new Ticket(f, pass);
//tic.buyTicket(f, pass);
//System.out.println("Bilet " + pass.getName() + "  " + f.getArrivalAirport() + "  " + f.availableSeats);
//Stream.of(tic.hm.values().toString()).forEach(System.out::println);
