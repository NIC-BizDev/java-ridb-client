package nicbizdev.ridb;

/**
 * @author aford_000
 *
 */
public class RIDBRecreationalActivity {
/*
 *  ActivityID	INT		N	Activity ID
	RecActivityName	STRING	60	N	Name of the activity
	RecActivityLevel	INT		N	Amount of physical exertion to be expected for a given activity such as hiking, swimming, etc
 */
	private int activityID;
	private String recActivityName;
	private int recActivityLevel;
	
	public int getActivityID() {
		return activityID;
	}
	public void setActivityID(int activityID) {
		this.activityID = activityID;
	}
	public String getRecActivityName() {
		return recActivityName;
	}
	public void setRecActivityName(String recActivityName) {
		this.recActivityName = recActivityName;
	}
	public int getRecActivityLevel() {
		return recActivityLevel;
	}
	public void setRecActivityLevel(int recActivityLevel) {
		this.recActivityLevel = recActivityLevel;
	}
	
}
