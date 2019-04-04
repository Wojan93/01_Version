package com.OBI;

import java.time.LocalDateTime;
import java.util.HashMap;

public class Flight {

	private Airport departureAirport;
	private Airport arrivalAirport;
	int availableSeats;
	private LocalDateTime departureDateTime;
	private LocalDateTime arrivalDateTime;

	HashMap<String, LocalDateTime> arrival = new HashMap<String, LocalDateTime>();

	HashMap<String, LocalDateTime> departure = new HashMap<String, LocalDateTime>();

	public Flight(Airport departureAirport, Airport arrivalAirport, int availableSeats,
			LocalDateTime departureDateTime) {
		this.setDepartureAirport(departureAirport);
		this.setArrivalAirport(arrivalAirport);
		this.availableSeats = availableSeats;
		this.setDepartureDateTime(departureDateTime);
	}

	public Airport getArrivalAirport() {
		return arrivalAirport;
	}

	public Airport getDepartureAirport() {
		return departureAirport;
	}

	public void setArrivalAirport(Airport arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}

	public void setDepartureAirport(Airport departureAirport) {
		this.departureAirport = departureAirport;
	}

	public LocalDateTime getArrivalDateTime() {
		return arrivalDateTime;
	}

	public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}

	public LocalDateTime getDepartureDateTime() {
		return departureDateTime;
	}

	public void setDepartureDateTime(LocalDateTime departureDateTime) {
		this.departureDateTime = departureDateTime;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	@Override
	public String toString() {
		return this.departureAirport + " , " + this.arrivalAirport + " , " + this.departureDateTime + " , "
				+ this.arrivalDateTime;
	}
}
