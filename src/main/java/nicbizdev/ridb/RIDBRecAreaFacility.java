package nicbizdev.ridb;

/**
 * @author aford_000
 *
 */
public class RIDBRecAreaFacility {
/*
 *  RecAreaID	INT		N	Foreign Key: RecArea RecAreaID
	FacilityID	INT		N	Foreign Key: Facility FacilityID
 */
	
	private int recAreaID;
	private int facilityID;
	public int getRecAreaID() {
		return recAreaID;
	}
	public void setRecAreaID(int recAreaID) {
		this.recAreaID = recAreaID;
	}
	public int getFacilityID() {
		return facilityID;
	}
	public void setFacilityID(int facilityID) {
		this.facilityID = facilityID;
	}
	
}
