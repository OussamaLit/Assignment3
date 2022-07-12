package de.uniba.wiai.dsg.ajp.assignment3;

import java.util.LinkedList;
import java.util.List;

public class Customer {

	private String name;

	private List<Rental> rentals = new LinkedList<Rental>();

	public Customer(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Rental> getRentals() {
		return rentals;
	}

	public void setRentals(List<Rental> rentals) {
		this.rentals = rentals;
	}

	public String statement() {
		String result = "Rental Record for " + getName() + "\n";

		int frequentRenterPoints = 0;
		for (Rental each : this.rentals) {
			frequentRenterPoints += each.getFrequentRenterPoints();

			// show figures for this rental
			result += "\t" + each.getMovie().getTitle() + "\t"
					+ String.valueOf(each.getCharge()) + "\n";
		}

		// add footer lines
		result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints)
				+ " frequent renter points";
		return result;
	}

	public String htmlStatement() {
		String result = "<h1>Rentals for <em>" + getName() + "</em></h1>\n<p>";

		for (Rental each : rentals) {
			// show figures for each rental
			result += each.getMovie().getTitle() + ": "
					+ String.valueOf(each.getCharge()) + "<br>\n";
		}

		result += "</p>\n";

		// add footer lines
		result += "<p>You owe <em>" + String.valueOf(getTotalCharge())
				+ "</em></p>\n";
		result += "<p>On this rental you earned <em>"
				+ String.valueOf(getTotalFrequentRenterPoints())
				+ "</em> frequent renter points</p>";
		return result;
	}

	double getTotalCharge() {
		double result = 0;

		for (Rental each : rentals) {
			result += each.getCharge();
		}

		return result;
	}

	int getTotalFrequentRenterPoints() {
		int result = 0;

		for (Rental each : rentals) {
			result += each.getFrequentRenterPoints();
		}

		return result;
	}

}
