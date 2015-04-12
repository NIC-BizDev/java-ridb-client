package nicbizdev.ridb;

/**
 * @author aford_000
 *
 */
public class RIDBFacility {
/*  FacilityID	INT		N	Facility ID
	OrgFacilityID	INT		N	The agency's internal Facility ID
	FacilityName	STRING	256	N	Full name of the facility
	FacilityTypeDescription	STRING	1024	Y	Description of the type of facility
	FacilityPhone	STRING	256	Y	Phone number of the facility
	FacilityDescription	STRING	MAX*	N	Text describing the main features of the facility
	FacilityDirections	STRING	MAX*	Y	Text that provides general directions and/or the general location of the facility
	FacilityEmail	STRING	60	Y	Email address of the facility
	FacilityMapURL	STRING	256	Y	Internet address (URL) that hosts the facility map
	FacilityReservationURL	STRING	256	Y	Internet address (URL) for the web site hosting the reservation system
	FacilityLatitude	DECIMAL		Y	Latitude in decimal degrees -90.0 to 90.0
	FacilityLongitude	DECIMAL		Y	Longitude in decimal degrees -180.0 to 180.0
	FacilityAdaAccess	STRING	1024	Y	Information about the Americans with Disabilities Act accessibility for the facility
	FacilityUseFeeDescription	STRING	MAX*	Y	Text describing monetary charges associated with entrance to or usage of the facility
	LegacyFacilityID	STRING	20	Y	Legacy facility ID
	Keywords	STRING	4000	Y	List of keywords for the facility
	StayLimit	STRING	500	Y	Details on the stay limits for the facility
*/
	
	private int facilityID;
	private int orgFacilityID;
	private String facilityName;
	private String facilityTypeDescription;
	private String facilityPhone;
	private String facilityDescription;
	private String facilityDirections;
	private String facilityEmail;
	private String facilityMapURL;
	private String facilityReservationURL;
	private double facilityLatitude;
	private double facilityLongitude;
	private String facilityAdaAccess;
	private String facilityUseFeeDescription;
	private String legacyFacilityID;
	private String keywords;
	private String stayLimit;
	
	public int getFacilityID() {
		return facilityID;
	}
	public void setFacilityID(int facilityID) {
		this.facilityID = facilityID;
	}
	public int getOrgFacilityID() {
		return orgFacilityID;
	}
	public void setOrgFacilityID(int orgFacilityID) {
		this.orgFacilityID = orgFacilityID;
	}
	public String getFacilityName() {
		return facilityName;
	}
	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}
	public String getFacilityTypeDescription() {
		return facilityTypeDescription;
	}
	public void setFacilityTypeDescription(String facilityTypeDescription) {
		this.facilityTypeDescription = facilityTypeDescription;
	}
	public String getFacilityPhone() {
		return facilityPhone;
	}
	public void setFacilityPhone(String facilityPhone) {
		this.facilityPhone = facilityPhone;
	}
	public String getFacilityDescription() {
		return facilityDescription;
	}
	public void setFacilityDescription(String facilityDescription) {
		this.facilityDescription = facilityDescription;
	}
	public String getFacilityDirections() {
		return facilityDirections;
	}
	public void setFacilityDirections(String facilityDirections) {
		this.facilityDirections = facilityDirections;
	}
	public String getFacilityEmail() {
		return facilityEmail;
	}
	public void setFacilityEmail(String facilityEmail) {
		this.facilityEmail = facilityEmail;
	}
	public String getFacilityMapURL() {
		return facilityMapURL;
	}
	public void setFacilityMapURL(String facilityMapURL) {
		this.facilityMapURL = facilityMapURL;
	}
	public String getFacilityReservationURL() {
		return facilityReservationURL;
	}
	public void setFacilityReservationURL(String facilityReservationURL) {
		this.facilityReservationURL = facilityReservationURL;
	}
	public double getFacilityLatitude() {
		return facilityLatitude;
	}
	public void setFacilityLatitude(double facilityLatitude) {
		this.facilityLatitude = facilityLatitude;
	}
	public double getFacilityLongitude() {
		return facilityLongitude;
	}
	public void setFacilityLongitude(double facilityLongitude) {
		this.facilityLongitude = facilityLongitude;
	}
	public String getFacilityAdaAccess() {
		return facilityAdaAccess;
	}
	public void setFacilityAdaAccess(String facilityAdaAccess) {
		this.facilityAdaAccess = facilityAdaAccess;
	}
	public String getFacilityUseFeeDescription() {
		return facilityUseFeeDescription;
	}
	public void setFacilityUseFeeDescription(String facilityUseFeeDescription) {
		this.facilityUseFeeDescription = facilityUseFeeDescription;
	}
	public String getLegacyFacilityID() {
		return legacyFacilityID;
	}
	public void setLegacyFacilityID(String legacyFacilityID) {
		this.legacyFacilityID = legacyFacilityID;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getStayLimit() {
		return stayLimit;
	}
	public void setStayLimit(String stayLimit) {
		this.stayLimit = stayLimit;
	}

	
}
