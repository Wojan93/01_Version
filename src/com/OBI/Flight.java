package com.OBI;
import java.time.LocalDateTime;

public class Flight {
	
	private String departureAirport;
	private String arrivalAirport;
	private int amountOfSeats;
	private LocalDateTime dateTime;
	
	private Flight (String deA, String arA, int amOS, LocalDateTime dt ) {
		setDepartureAirport(deA);
		setArrivalAirport(arA);
		setAmountOfSeats(amOS);
		setDateTime(dt);
	}

	public String getDepartureAirport() {
		return departureAirport;
	}

	public void setDepartureAirport(String departureAirport) {
		this.departureAirport = departureAirport;
	}

	public String getArrivalAirport() {
		return arrivalAirport;
	}

	public void setArrivalAirport(String arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}

	public int getAmountOfSeats() {
		return amountOfSeats;
	}

	public void setAmountOfSeats(int amountOfSeats) {
		this.amountOfSeats = amountOfSeats;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
}
