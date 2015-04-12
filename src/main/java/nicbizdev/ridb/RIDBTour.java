package nicbizdev.ridb;

import java.util.Date;

/**
 * @author aford_000
 *
 */
public class RIDBTour {
/*
 * TourID	INT		N	Tour ID
FacilityID	INT		N	Facility ID the tour belongs to
TourName	STRING	255	N	Tour name
TourType	STRING	255	Y	Tour Type
TourDescription	STRING	255	Y	Tour description
TourDuration	INT		Y	Tour duration
TourAccessible	STRING	10	Y	Is the tour accessible by vehicle
CreatedDate	DATETIME		N	Record creation date
LastUpdatedDate	DATETIME		N	Record last update date
 */
	private int tourID;
	private int facilityID;
	private String tourName;
	private String tourType;
	private String tourDescription;
	private int tourDuration;
	private String tourAccessible;
	private Date createdDate;
	private Date lastUpdatedDate;
	
	public int getTourID() {
		return tourID;
	}
	public void setTourID(int tourID) {
		this.tourID = tourID;
	}
	public int getFacilityID() {
		return facilityID;
	}
	public void setFacilityID(int facilityID) {
		this.facilityID = facilityID;
	}
	public String getTourName() {
		return tourName;
	}
	public void setTourName(String tourName) {
		this.tourName = tourName;
	}
	public String getTourType() {
		return tourType;
	}
	public void setTourType(String tourType) {
		this.tourType = tourType;
	}
	public String getTourDescription() {
		return tourDescription;
	}
	public void setTourDescription(String tourDescription) {
		this.tourDescription = tourDescription;
	}
	public int getTourDuration() {
		return tourDuration;
	}
	public void setTourDuration(int tourDuration) {
		this.tourDuration = tourDuration;
	}
	public String getTourAccessible() {
		return tourAccessible;
	}
	public void setTourAccessible(String tourAccessible) {
		this.tourAccessible = tourAccessible;
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
