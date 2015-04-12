package nicbizdev.ridb;

/**
 * @author aford_000
 *
 */
public class RIDBRecAreaAddress {
/*
 *  AddressID	INT		N	Address ID
	StreetAddress1	STRING	256	Y	Address Line 1 of the recreational area
	StreetAddress2	STRING	256	Y	Address Line 2 of the recreational area
	StreetAddress3	STRING	256	Y	Address Line 3 of the recreational area
	City	STRING	60	Y	City where the recreational area is located
	AddressStateCode	STRING	20	N	State code for the recreational area
	PostalCode	STRING	20	Y	Postal code for the recreational area
	AddressCountryCode	STRING	5	Y	Abbreviated country code for the recreational area address
	RecAreaID	INT		N	Foreign Key: RecArea RecAreaID
	RecAreaAddressType	STRING	20	Y	Address Type for the recreational area
 */
	
	private int addressID;
	private String streetAddress1;
	private String streetAddress2;
	private String streetAddress3;
	private String city;
	private String addressStateCode;
	private String postalCode;
	private String addressCountryCode;
	private int recAreaID;
	private String recAreaAddressType;
	
	public int getAddressID() {
		return addressID;
	}
	public void setAddressID(int addressID) {
		this.addressID = addressID;
	}
	public String getStreetAddress1() {
		return streetAddress1;
	}
	public void setStreetAddress1(String streetAddress1) {
		this.streetAddress1 = streetAddress1;
	}
	public String getStreetAddress2() {
		return streetAddress2;
	}
	public void setStreetAddress2(String streetAddress2) {
		this.streetAddress2 = streetAddress2;
	}
	public String getStreetAddress3() {
		return streetAddress3;
	}
	public void setStreetAddress3(String streetAddress3) {
		this.streetAddress3 = streetAddress3;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddressStateCode() {
		return addressStateCode;
	}
	public void setAddressStateCode(String addressStateCode) {
		this.addressStateCode = addressStateCode;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getAddressCountryCode() {
		return addressCountryCode;
	}
	public void setAddressCountryCode(String addressCountryCode) {
		this.addressCountryCode = addressCountryCode;
	}
	public int getRecAreaID() {
		return recAreaID;
	}
	public void setRecAreaID(int recAreaID) {
		this.recAreaID = recAreaID;
	}
	public String getRecAreaAddressType() {
		return recAreaAddressType;
	}
	public void setRecAreaAddressType(String recAreaAddressType) {
		this.recAreaAddressType = recAreaAddressType;
	}

}
