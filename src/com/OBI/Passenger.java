package com.OBI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Passenger {

	private String name;
	private String document;
	private LocalDate bornDate;

	public Passenger(String name, String document, LocalDate bornDate) {
		this.setName(name);
		this.setDocument(document);
		this.setBornDate(bornDate);
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

	@Override
	public String toString() {
		return this.name + " , " + this.document + " , " + this.bornDate;
	}
}
