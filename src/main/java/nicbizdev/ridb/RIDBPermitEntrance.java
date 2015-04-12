package nicbizdev.ridb;

import java.util.Date;

/**
 * @author aford_000
 *
 */
public class RIDBPermitEntrance {
/*
 * PermitEntranceID	INT		N	Permit Entrance ID
FacilityID	INT		N	Facility ID the Permit belongs to
PermitEntranceName	STRING	512	N	Permit Entrance Name
PermitEntranceType	STRING	255	Y	Permit Entrance Type
PermitEntranceDescription	STRING	255	Y	Permit Entrance Description
PermitEntranceAccesible	STRING	10	Y	Is the permit accessible by vehicle
Latitude	DECIMAL			Latitude of the permit location
Longitude	DECIMAL			Longitude of the permit location
District	STRING	60	Y	District the permit resides in
Town	STRING	60	Y	Town the permit resides in
Zone	STRING	255	Y	Zone the permit resides in
CreatedDate	DATETIME		N	Record creation date
LastUpdatedDate	DATETIME		N	Record last update date
 */
	private int permitEntranceID;
	private int facilityID;
	private String permitEntranceName;
	private String permitEntranceType;
	private String permitEntranceDescription;
	private String permitEntranceAccesible;
	private double latitude;
	private double longitude;
	private String district;
	private String town;
	private String zone;
	private Date createdDate;
	private Date lastUpdatedDate;
	public int getPermitEntranceID() {
		return permitEntranceID;
	}
	public void setPermitEntranceID(int permitEntranceID) {
		this.permitEntranceID = permitEntranceID;
	}
	public int getFacilityID() {
		return facilityID;
	}
	public void setFacilityID(int facilityID) {
		this.facilityID = facilityID;
	}
	public String getPermitEntranceName() {
		return permitEntranceName;
	}
	public void setPermitEntranceName(String permitEntranceName) {
		this.permitEntranceName = permitEntranceName;
	}
	public String getPermitEntranceType() {
		return permitEntranceType;
	}
	public void setPermitEntranceType(String permitEntranceType) {
		this.permitEntranceType = permitEntranceType;
	}
	public String getPermitEntranceDescription() {
		return permitEntranceDescription;
	}
	public void setPermitEntranceDescription(String permitEntranceDescription) {
		this.permitEntranceDescription = permitEntranceDescription;
	}
	public String getPermitEntranceAccesible() {
		return permitEntranceAccesible;
	}
	public void setPermitEntranceAccesible(String permitEntranceAccesible) {
		this.permitEntranceAccesible = permitEntranceAccesible;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

}
