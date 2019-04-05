package com.OBI;

import java.lang.Iterable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DataStorage {

	private String storageName;

	public DataStorage(String storageName) {
		this.storageName = storageName;
	}

	HashMap<String, Passenger> passengerByName = new HashMap<String, Passenger>();
	HashMap<LocalDate, Passenger> passengerByBornDate = new HashMap<LocalDate, Passenger>();
	HashMap<LocalDateTime, Flight> flightByDepartureDate = new HashMap<LocalDateTime, Flight>();
	HashMap<String, Flight> flightByArrivalAirport = new HashMap<String, Flight>();
	HashMap<String, Ticket> passengerTickets = new HashMap<String, Ticket>();
	List<Airport> airportArray = new ArrayList<Airport>();

	public void addPassenger(String name, String document, LocalDate bornDate) {
		Passenger passenger = new Passenger(name, document, bornDate);
		passengerByName.put(name, passenger);
		passengerByBornDate.put(bornDate, passenger);
	}

	public void addPassengerObj(Passenger passenger) {
		passengerByName.put(passenger.getName(), passenger);
		passengerByBornDate.put(passenger.getBornDate(), passenger);
	}

	public void addFlight(Airport departureAirport, Airport arrivalAirport, int availableSeats,
			LocalDateTime departureDateTime) {
		Flight flight = new Flight(departureAirport, arrivalAirport, availableSeats, departureDateTime);
		flightByDepartureDate.put(departureDateTime, flight);
		flightByArrivalAirport.put(arrivalAirport.getCode(), flight);
	}

	public void addFlightObj(Flight flight) {
		flightByDepartureDate.put(flight.getDepartureDateTime(), flight);
		flightByArrivalAirport.put(flight.getArrivalAirport().getCode(), flight);
	}

	public void addPassengerTickets(Flight flight, Passenger passenger) {
		Ticket ticket = new Ticket(flight, passenger);
		passengerTickets.put(passenger.getName(), ticket);
	}

	public void addPassengerTicketsObj(Ticket ticket) {
		passengerTickets.put(ticket.getPassenger().getName(), ticket);
	}

	public void addAirportArray(String code, String city, String name) {
		Airport airport = new Airport(code, city, name);
		airportArray.add(airport);
	}

	public void addAirportArray(Airport airport) {
		airportArray.add(airport);
	}

	public void removePassenger(Passenger passenger) {
		passengerByName.remove(passenger.getName());
		passengerByBornDate.remove(passenger.getBornDate());
	}
	
	public void removeFlight(Flight flight) {
		flightByDepartureDate.remove(flight.getDepartureDateTime());
		flightByArrivalAirport.remove(flight.getArrivalAirport().getCode());
	}
	
	public void removeTicket(Ticket ticket) {
		passengerTickets.remove(ticket.getPassenger().getName());
	}
	
	public void removeAirportArray(Airport airport) {
		airportArray.remove(airport);
	}
	

	public void searchPassengerByName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj imiê i nazwisko pasazera");
		String key = sc.nextLine();
		sc.close();
		if (passengerByName.containsKey(key)) {
			System.out.println(passengerByName.get(key));
		}
	}

	public void searchPassengerByBornDate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj date urodzenia pasazera w formacie YYYY-MM-DD");
		String key = sc.nextLine();
		sc.close();
		if (passengerByBornDate.containsKey(LocalDate.parse(key))) {
			System.out.println(passengerByBornDate.get(LocalDate.parse(key)));
		}
	}

	public void searchFlightByDepartureDate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj date i godzine odlotu w formacie YYYY-MM-DDTHH:MM");
		String key = sc.nextLine();
		sc.close();
		if (flightByDepartureDate.containsKey(LocalDateTime.parse(key))) {
			System.out.println(flightByDepartureDate.get(LocalDateTime.parse(key)));
		}
	}

	public void searchFlightByArrivalAirport() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj kod lotniska docelowego");
		String key = sc.nextLine();
		sc.close();
		if (flightByArrivalAirport.containsKey(key)) {
			System.out.println(flightByArrivalAirport.get(key));
		}
	}

	public void searchPassengerTickets() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj imiê i nazwisko pasazera");
		String key = sc.nextLine();
		sc.close();
		if (passengerTickets.containsKey(key)) {
			System.out.println(passengerTickets.get(key));
		}
	}

	public void displayPassengerByName() {
		System.out.println(Arrays.toString(passengerByName.entrySet().toArray()));
	}

	public void displayPassengerByBornDate() {
		System.out.println(Arrays.toString(passengerByBornDate.entrySet().toArray()));
	}

	public void displayFlightByDepartureDate() {
		System.out.println(Arrays.toString(flightByDepartureDate.entrySet().toArray()));
	}

	public void displayFlightByArrivalAirport() {
		System.out.println(Arrays.toString(flightByArrivalAirport.entrySet().toArray()));
	}

	public void displayPassengerTickets() {
		System.out.println(Arrays.toString(passengerTickets.entrySet().toArray()));
	}

	
	
	public static void main(String args[]) {

	}
}
