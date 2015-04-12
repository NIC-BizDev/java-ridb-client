package nicbizdev.ridb;

import java.util.Date;

/**
 * @author aford_000
 *
 */
public class RIDBCampsite {
/*
 * CampsiteID	INT		N	Campsite ID
FacilityID	INT		N	Facility ID the campsite belongs to
CampsiteName	STRING	255	N	Campsite Name
CampsiteType	STRING	255	Y	Campsite Type
Loop	STRING	255	Y	Name of loop the campsite resides on
Type of Use	STRING	255	Y	Type of use
CampsiteAccesible	STRING	10	Y	Is the campsite accessible by vehicle
CreatedDate	DATETIME		N	Record creation date
LastUpdateDate	DATETIME		N	Record last update date
 */
	
	private int campsiteID;
	private int facilityID;
	private String campsiteName;
	private String campsiteType;
	private String loop;
	private String typeOfUse;
	private boolean campsiteAccesible;
	private Date createdDate;
	private Date lastUpdateDate;
	
	public int getCampsiteID() {
		return campsiteID;
	}
	public void setCampsiteID(int campsiteID) {
		this.campsiteID = campsiteID;
	}
	public int getFacilityID() {
		return facilityID;
	}
	public void setFacilityID(int facilityID) {
		this.facilityID = facilityID;
	}
	public String getCampsiteName() {
		return campsiteName;
	}
	public void setCampsiteName(String campsiteName) {
		this.campsiteName = campsiteName;
	}
	public String getCampsiteType() {
		return campsiteType;
	}
	public void setCampsiteType(String campsiteType) {
		this.campsiteType = campsiteType;
	}
	public String getLoop() {
		return loop;
	}
	public void setLoop(String loop) {
		this.loop = loop;
	}
	public String getTypeOfUse() {
		return typeOfUse;
	}
	public void setTypeOfUse(String typeOfUse) {
		this.typeOfUse = typeOfUse;
	}
	public boolean isCampsiteAccesible() {
		return campsiteAccesible;
	}
	public void setCampsiteAccesible(boolean campsiteAccesible) {
		this.campsiteAccesible = campsiteAccesible;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

}
