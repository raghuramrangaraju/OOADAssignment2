package OOAD.HW2.Guitar;

/**
 * This class implements the properties and functions of Guitar.
 *
 * @author raghuram
 */
public class Guitar {

	private String serialNumber;
	private double price;
	private GuitarSpec guitarSpec;

	/**
	 * Constructor for the class Guitar with the following arguments
	 * @param serialNumber
	 * @param price
	 * @param guitarSpec
	 */
	public Guitar(String serialNumber, double price, 
			GuitarSpec guitarSpec) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.guitarSpec = guitarSpec;
	}

	/**
	 * Function returns the serial number of guitar
	 *
	 * @return serialNumber
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * Function returns the price of guitar
	 *
	 * @return price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Function sets the new price
	 *
	 * @param newPrice
	 *            
	 */
	public void setPrice(float newPrice) {
		this.price = newPrice;
	}

	/**
	 * 
	 * @return guitarSpec
	 */
	public GuitarSpec getGuitarSpec() {
		return guitarSpec;
	}
}
