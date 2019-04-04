package com.OBI;

import java.util.HashMap;
import java.util.Iterator;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DataStorage {

	public static void main(String args[]) {

//AIRPORT
		Airport airport1 = new Airport("WAW", "Warsaw", "Chopin Airport");
		Airport airport2 = new Airport("VLC", "Valencia", "Aeropuerto de Valencia");
		Airport airport3 = new Airport("LCY", "London", "London City Airport");
		Airport airport4 = new Airport("OSL", "Oslo", "Oslo-Gardermoen");
		Airport airport5 = new Airport("BRU", "Brussels", "Brussels Airport");
		Airport airport6 = new Airport("BER", "Berlin", "Berlin Brandenburg Airport");
		Airport airport7 = new Airport("MAD", "Madrid", "Aeropuerto de Madrid-Barajas");
		Airport airport8 = new Airport("LIS", "Lisbon", "Aeroporto Humberto Delgado");
		Airport airport9 = new Airport("RMA", "Roma", "Roma Airport");
		Airport airport10 = new Airport("IEV", "Kyiv", "Kyiv International Airport Zhuliany");

//PASSENGER	
		Passenger passenger1 = new Passenger("Andrzej Kowalski", "NSV971649", LocalDate.of(1987, Month.JANUARY, 16));
		Passenger passenger2 = new Passenger("Piotr Kubica", "TRF690204", LocalDate.of(1991, Month.FEBRUARY, 19));
		Passenger passenger3 = new Passenger("Jerzy Kosiñski", "CYY369123", LocalDate.of(1995, Month.APRIL, 1));
		Passenger passenger4 = new Passenger("Anna Domagala", "SJC291498", LocalDate.of(1989, Month.MAY, 3));
		Passenger passenger5 = new Passenger("Katarzyna Mrozik", "CJS816961", LocalDate.of(1965, Month.JULY, 20));
		Passenger passenger6 = new Passenger("Jakub Gomu³ko", "FGU597626", LocalDate.of(1967, Month.AUGUST, 11));
		Passenger passenger7 = new Passenger("Andrzej Sadowy", "VWE720529", LocalDate.of(1978, Month.FEBRUARY, 3));
		Passenger passenger8 = new Passenger("Monika Olejnik", "JCC663868", LocalDate.of(1975, Month.MARCH, 13));
		Passenger passenger9 = new Passenger("Jaroslaw Machul", "ATX114495", LocalDate.of(1963, Month.DECEMBER, 20));

		// hash mapa Pasazer + Data Czas
		HashMap<String, Passenger> passengerByName = new HashMap<String, Passenger>();

		passengerByName.put(passenger1.getName(), passenger1);
		passengerByName.put(passenger2.getName(), passenger2);
		passengerByName.put(passenger3.getName(), passenger3);
		passengerByName.put(passenger4.getName(), passenger4);
		passengerByName.put(passenger5.getName(), passenger5);
		passengerByName.put(passenger6.getName(), passenger6);
		passengerByName.put(passenger7.getName(), passenger7);
		passengerByName.put(passenger8.getName(), passenger8);
		passengerByName.put(passenger9.getName(), passenger9);

		HashMap<LocalDate, Passenger> passengerByBornDate = new HashMap<LocalDate, Passenger>();

		passengerByBornDate.put(passenger1.getBornDate(), passenger1);
		passengerByBornDate.put(passenger2.getBornDate(), passenger2);
		passengerByBornDate.put(passenger3.getBornDate(), passenger3);
		passengerByBornDate.put(passenger4.getBornDate(), passenger4);
		passengerByBornDate.put(passenger5.getBornDate(), passenger5);
		passengerByBornDate.put(passenger6.getBornDate(), passenger6);
		passengerByBornDate.put(passenger7.getBornDate(), passenger7);
		passengerByBornDate.put(passenger8.getBornDate(), passenger8);
		passengerByBornDate.put(passenger9.getBornDate(), passenger9);

//FLIGHT				
		Flight flight1 = new Flight(airport1, airport2, 138, LocalDateTime.of(2019, Month.JANUARY, 10, 10, 15, 00));
		Flight flight2 = new Flight(airport2, airport3, 200, LocalDateTime.of(2019, Month.JANUARY, 12, 10, 40, 00));
		Flight flight3 = new Flight(airport3, airport4, 230, LocalDateTime.of(2019, Month.JANUARY, 1, 8, 00, 00));
		Flight flight4 = new Flight(airport5, airport6, 120, LocalDateTime.of(2019, Month.JANUARY, 1, 10, 00, 00));
		Flight flight5 = new Flight(airport6, airport7, 168, LocalDateTime.of(2019, Month.JANUARY, 1, 15, 00, 00));
		Flight flight6 = new Flight(airport7, airport8, 212, LocalDateTime.of(2019, Month.JANUARY, 1, 12, 15, 00));
		Flight flight7 = new Flight(airport8, airport9, 190, LocalDateTime.of(2019, Month.JANUARY, 1, 14, 00, 00));
		Flight flight8 = new Flight(airport9, airport10, 198, LocalDateTime.of(2019, Month.JANUARY, 1, 18, 00, 00));
		Flight flight9 = new Flight(airport10, airport1, 212, LocalDateTime.of(2019, Month.JANUARY, 1, 14, 30, 00));

		HashMap<LocalDateTime, Flight> flightByDepartureDate = new HashMap<LocalDateTime, Flight>();

		flightByDepartureDate.put(flight1.getDepartureDateTime(), flight1);
		flightByDepartureDate.put(flight2.getDepartureDateTime(), flight2);
		flightByDepartureDate.put(flight3.getDepartureDateTime(), flight3);
		flightByDepartureDate.put(flight4.getDepartureDateTime(), flight4);
		flightByDepartureDate.put(flight5.getDepartureDateTime(), flight5);
		flightByDepartureDate.put(flight6.getDepartureDateTime(), flight6);
		flightByDepartureDate.put(flight7.getDepartureDateTime(), flight7);
		flightByDepartureDate.put(flight8.getDepartureDateTime(), flight8);
		flightByDepartureDate.put(flight9.getDepartureDateTime(), flight9);

		HashMap<String, Flight> flightByArrivalAirport = new HashMap<String, Flight>();

		flightByArrivalAirport.put(flight1.getArrivalAirport().getCode(), flight1);
		flightByArrivalAirport.put(flight2.getArrivalAirport().getCode(), flight2);
		flightByArrivalAirport.put(flight3.getArrivalAirport().getCode(), flight3);
		flightByArrivalAirport.put(flight4.getArrivalAirport().getCode(), flight4);
		flightByArrivalAirport.put(flight5.getArrivalAirport().getCode(), flight5);
		flightByArrivalAirport.put(flight6.getArrivalAirport().getCode(), flight6);
		flightByArrivalAirport.put(flight7.getArrivalAirport().getCode(), flight7);
		flightByArrivalAirport.put(flight8.getArrivalAirport().getCode(), flight8);
		flightByArrivalAirport.put(flight9.getArrivalAirport().getCode(), flight9);

		Ticket ticket1 = new Ticket(flight1, passenger1);
		Ticket ticket2 = new Ticket(flight2, passenger2);
		Ticket ticket3 = new Ticket(flight3, passenger3);
		Ticket ticket4 = new Ticket(flight4, passenger4);
		Ticket ticket5 = new Ticket(flight5, passenger5);
		Ticket ticket6 = new Ticket(flight6, passenger6);
		Ticket ticket7 = new Ticket(flight7, passenger7);
		Ticket ticket8 = new Ticket(flight8, passenger8);
		Ticket ticket9 = new Ticket(flight9, passenger9);

		HashMap<String, Ticket> passengerTickets = new HashMap<String, Ticket>();

		passengerTickets.put(passenger1.getName(), ticket1);
		passengerTickets.put(passenger2.getName(), ticket2);
		passengerTickets.put(passenger3.getName(), ticket3);
		passengerTickets.put(passenger4.getName(), ticket4);
		passengerTickets.put(passenger5.getName(), ticket5);
		passengerTickets.put(passenger6.getName(), ticket6);
		passengerTickets.put(passenger7.getName(), ticket7);
		passengerTickets.put(passenger8.getName(), ticket8);
		passengerTickets.put(passenger9.getName(), ticket9);

		// Passenger bilety
//		List<String> bilety = new ArrayList<String>();

		Iterator<String> iterator = passengerByName.keySet().iterator();
		while (iterator.hasNext()) {
			Passenger pas = passengerByName.get(iterator.next());
			System.out.println(" ");
		}

	}
}
