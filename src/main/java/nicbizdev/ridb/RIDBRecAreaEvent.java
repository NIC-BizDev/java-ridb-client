package nicbizdev.ridb;

/**
 * @author aford_000
 *
 */
public class RIDBRecAreaEvent {
/*
 *  RecAreaID	INT		N	Foreign Key: RecArea RecAreaID
	EventID	INT		N	Foreign Key: Event EventID
 */
	private int recAreaID;
	private int eventID;
	
	public int getRecAreaID() {
		return recAreaID;
	}
	public void setRecAreaID(int recAreaID) {
		this.recAreaID = recAreaID;
	}
	public int getEventID() {
		return eventID;
	}
	public void setEventID(int eventID) {
		this.eventID = eventID;
	}
}
