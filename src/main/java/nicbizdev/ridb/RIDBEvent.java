package nicbizdev.ridb;

import java.util.Date;

/**
 * @author aford_000
 *
 */
public class RIDBEvent {
/*
 * EventID	INT		N	Event ID
EntityID	INT		N	Foreign Key: Facility FacilityID or RecArea RecAreaID
EntityType	STRING	1024	N	"Facility" or "RecArea"
EventDataStewardID	INT		Y	Data Steward ID for the event
EventName	STRING	60	N	Full Name of the event
EventStartDate	DATETIME		N	Calendar date on which event is scheduled to begin
EventDescription	STRING	1024	N	Text that provides a synopsis of an event
EventAgeGroup	STRING	20	Y	Age group for the event if available
EventURLAddress	STRING	256	Y	Internet address (URL) to a web site providing details about the event
EventURLText	STRING	256	Y	Optional text for the URL of the event
EventEmail	STRING	60	Y	Email contact for event
EventRegistrationRequired	BIT		N	Code requesting a Yes or No response to determine whether registration is required for an event
EventADAAccess	STRING	1024	Y	Information about the Americans with Disabilities Act accessibility for the event
EventFeeDescription	STRING	1024	Y	Text for the description of fees associated with this event
EventComments	STRING	1024	Y	Text for the general occasion or activity to be offered
EventFrequencyRateDescription	STRING	1024	Y	Text that describes how often the event recurs
EventScopeDescription	STRING	1024	Y	Text that describes the extent, capacity, and scale of an event.
EventTypeDescription	STRING	1024	Y	Text that describes the types of events
SponsorName	STRING	60	Y	Full Name of the sponsor for the event
SponsorEmail	STRING	60	Y	Sponsor email address for the event
SponsorURLAddress	STRING	256	Y	Internet address (URL) to a web site for the sponsor
EventEndDate	DATETIME		N	Calendar date on which event is scheduled to end
SponsorURLText	STRING	256	Y	Optional Readable text that provides the URL Sponsor link
SponsorPhone	STRING	20	Y	Phone Number for the sponsor of the Event
SponsorClassType	STRING	20	Y	Class and type of sponsor
 */
	
	private int eventID;
	private int entityID;
	private String entityType;
	private int eventDataStewardID;
	private String eventName;
	private Date eventStartDate;
	private String eventDescription;
	private String eventAgeGroup;
	private String eventURLAddress;
	private String eventURLText;
	private String eventEmail;
	private boolean eventRegistrationRequired;
	private String eventADAAccess;
	private String eventFeeDescription;
	private String eventComments;
	private String eventFrequencyRateDescription;
	private String eventScopeDescription;
	private String eventTypeDescription;
	private String sponsorName;
	private String sponsorEmail;
	private String sponsorURLAddress;
	private Date eventEndDate;
	private String sponsorURLText;
	private String sponsorPhone;
	private String sponsorClassType;
	
	public int getEventID() {
		return eventID;
	}
	public void setEventID(int eventID) {
		this.eventID = eventID;
	}
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
	public int getEventDataStewardID() {
		return eventDataStewardID;
	}
	public void setEventDataStewardID(int eventDataStewardID) {
		this.eventDataStewardID = eventDataStewardID;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public Date getEventStartDate() {
		return eventStartDate;
	}
	public void setEventStartDate(Date eventStartDate) {
		this.eventStartDate = eventStartDate;
	}
	public String getEventDescription() {
		return eventDescription;
	}
	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}
	public String getEventAgeGroup() {
		return eventAgeGroup;
	}
	public void setEventAgeGroup(String eventAgeGroup) {
		this.eventAgeGroup = eventAgeGroup;
	}
	public String getEventURLAddress() {
		return eventURLAddress;
	}
	public void setEventURLAddress(String eventURLAddress) {
		this.eventURLAddress = eventURLAddress;
	}
	public String getEventURLText() {
		return eventURLText;
	}
	public void setEventURLText(String eventURLText) {
		this.eventURLText = eventURLText;
	}
	public String getEventEmail() {
		return eventEmail;
	}
	public void setEventEmail(String eventEmail) {
		this.eventEmail = eventEmail;
	}
	public boolean isEventRegistrationRequired() {
		return eventRegistrationRequired;
	}
	public void setEventRegistrationRequired(boolean eventRegistrationRequired) {
		this.eventRegistrationRequired = eventRegistrationRequired;
	}
	public String getEventADAAccess() {
		return eventADAAccess;
	}
	public void setEventADAAccess(String eventADAAccess) {
		this.eventADAAccess = eventADAAccess;
	}
	public String getEventFeeDescription() {
		return eventFeeDescription;
	}
	public void setEventFeeDescription(String eventFeeDescription) {
		this.eventFeeDescription = eventFeeDescription;
	}
	public String getEventComments() {
		return eventComments;
	}
	public void setEventComments(String eventComments) {
		this.eventComments = eventComments;
	}
	public String getEventFrequencyRateDescription() {
		return eventFrequencyRateDescription;
	}
	public void setEventFrequencyRateDescription(
			String eventFrequencyRateDescription) {
		this.eventFrequencyRateDescription = eventFrequencyRateDescription;
	}
	public String getEventScopeDescription() {
		return eventScopeDescription;
	}
	public void setEventScopeDescription(String eventScopeDescription) {
		this.eventScopeDescription = eventScopeDescription;
	}
	public String getEventTypeDescription() {
		return eventTypeDescription;
	}
	public void setEventTypeDescription(String eventTypeDescription) {
		this.eventTypeDescription = eventTypeDescription;
	}
	public String getSponsorName() {
		return sponsorName;
	}
	public void setSponsorName(String sponsorName) {
		this.sponsorName = sponsorName;
	}
	public String getSponsorEmail() {
		return sponsorEmail;
	}
	public void setSponsorEmail(String sponsorEmail) {
		this.sponsorEmail = sponsorEmail;
	}
	public String getSponsorURLAddress() {
		return sponsorURLAddress;
	}
	public void setSponsorURLAddress(String sponsorURLAddress) {
		this.sponsorURLAddress = sponsorURLAddress;
	}
	public Date getEventEndDate() {
		return eventEndDate;
	}
	public void setEventEndDate(Date eventEndDate) {
		this.eventEndDate = eventEndDate;
	}
	public String getSponsorURLText() {
		return sponsorURLText;
	}
	public void setSponsorURLText(String sponsorURLText) {
		this.sponsorURLText = sponsorURLText;
	}
	public String getSponsorPhone() {
		return sponsorPhone;
	}
	public void setSponsorPhone(String sponsorPhone) {
		this.sponsorPhone = sponsorPhone;
	}
	public String getSponsorClassType() {
		return sponsorClassType;
	}
	public void setSponsorClassType(String sponsorClassType) {
		this.sponsorClassType = sponsorClassType;
	}

}
