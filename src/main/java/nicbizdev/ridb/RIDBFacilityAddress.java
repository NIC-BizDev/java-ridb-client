package nicbizdev.ridb;

/**
 * @author aford_000
 *
 */
public class RIDBFacilityAddress {
	/*
	 *  AddressID	INT		N	Address ID
		StreetAddress1	STRING	256	Y	Address Line 1 of the facility
		StreetAddress2	STRING	256	Y	Address Line 2 of the facility
		StreetAddress3	STRING	256	Y	Address Line 3 of the facility
		City	STRING	60	Y	City where the facility is located
		AddressStateCode	STRING	20	N	State code for the facility
		PostalCode	STRING	20	Y	Postal code for the facility
		AddressCountryCode	STRING	5	Y	Abbreviated country code for the facility address
		FacilityID	INT		N	Foreign Key: Facility FacilityID
		FacilityAddressType	STRING	20	Y	Address type for the facility
	 */
	
	private int addressID;
	private String streetAddress1;
	private String streetAddress2;
	private String streetAddress3;
	private String city;
	private String addressStateCode;
	private String postalCode;
	private String addressCountryCode;
	private int facilityID;
	private String facilityAddressType;
	
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
	public int getFacilityID() {
		return facilityID;
	}
	public void setFacilityID(int facilityID) {
		this.facilityID = facilityID;
	}
	public String getFacilityAddressType() {
		return facilityAddressType;
	}
	public void setFacilityAddressType(String facilityAddressType) {
		this.facilityAddressType = facilityAddressType;
	}

}
