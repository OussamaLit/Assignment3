package de.uniba.wiai.dsg.ajp.assignment3;

/**
 *public class Movie
 * 
 */
public class Movie {


	private PriceCodes priceCode;
	private Price price;
	private String title;

	public Movie( String title, Price price) {
		this.price = price;
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	double getCharge(int daysRented) {
		return price.getCharge(daysRented);
	}

	public int getPriceCode() {
		return price.getPriceCode();
	}

	public void setPriceCode(PriceCodes pc) {
		switch (pc) {
			case REGULAR:
			price = new RegularPrice();
			break;
			case CHILDRENS:
			price = new ChildrensPrice();
			break;
			case NEW_RELEASE:
			price = new NewReleasePrice();
			break;
		default:
			throw new IllegalArgumentException("Incorrect Price Code");
		}
	}

	public int getFrequentRenterPoints(int daysRented) {
		return price.getFrequentRenterPoints(daysRented);
	}

}
