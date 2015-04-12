package nicbizdev.ridb;

/**
 * @author aford_000
 *
 */
public class RIDBFacilityEvent {
/*
 * FacilityID	INT		N	Foreign Key: Facility FacilityID
EventID	INT		N	Foreign Key: Event EventID
 */
	
	private int facilityID;
	private int eventID;
	
	public int getFacilityID() {
		return facilityID;
	}
	public void setFacilityID(int facilityID) {
		this.facilityID = facilityID;
	}
	public int getEventID() {
		return eventID;
	}
	public void setEventID(int eventID) {
		this.eventID = eventID;
	}
}
