package com.OBI;
import java.time.LocalDate;

public class Passenger {

	private Ticket tickets[];
	private String name;
	private String document;
	private LocalDate bornDate;
	
	
	private Passenger(String n, String doc, LocalDate born) {
		setName(n);
		setDocument(doc);
		setBornDate(born);
	}


	public Ticket[] getTickets() {
		return tickets;
	}


	public void setTickets(Ticket tickets[]) {
		this.tickets = tickets;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDocument() {
		return document;
	}


	public void setDocument(String document) {
		this.document = document;
	}


	public LocalDate getBornDate() {
		return bornDate;
	}


	public void setBornDate(LocalDate bornDate) {
		this.bornDate = bornDate;
	}
	
	
}
