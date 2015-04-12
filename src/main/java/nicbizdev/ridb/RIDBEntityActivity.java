package nicbizdev.ridb;

/**
 * @author aford_000
 *
 */
public class RIDBEntityActivity {
/*  EntityID	INT		N	Foreign Key: RecArea RecAreaID or Facility FacilityID
	EntityType	STRING	1024	N	Entity Type. "RecArea" or "Facility"
	ActivityID	INT		N	Foreign Key: RecreationalActivity ActivityID
	ActivityDescription	STRING	1024	Y	Description of the activity
	ActivityFeeDescription	STRING	1024	Y	Text describing monetary charges associated with the activity
*/
	private int entityID;
	private String entityType;
	private int activityID;
	private String activityDescription;
	private String activityFeeDescription;
	
	public int getEntityID() {
		return entityID;
	}
	public void setEntityID(int entityID) {
		this.entityID = entityID;
	}
	public String getEntityType() {
		return entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}
	public int getActivityID() {
		return activityID;
	}
	public void setActivityID(int activityID) {
		this.activityID = activityID;
	}
	public String getActivityDescription() {
		return activityDescription;
	}
	public void setActivityDescription(String activityDescription) {
		this.activityDescription = activityDescription;
	}
	public String getActivityFeeDescription() {
		return activityFeeDescription;
	}
	public void setActivityFeeDescription(String activityFeeDescription) {
		this.activityFeeDescription = activityFeeDescription;
	}

	
	
}
