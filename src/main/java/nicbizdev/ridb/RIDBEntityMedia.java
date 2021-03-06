package nicbizdev.ridb;

/**
 * @author aford_000
 *
 */
public class RIDBEntityMedia {
/*
 * EntityType	STRING	50	N	RecArea, Facility, Tour, Entrance, or Site
EntityID	INT		N	Foreign Key: (RecArea RecAreaID) OR (Facility FacilityID) OR (Tour TourID) OR (PermitEntrance PermitEntranceID) OR (Campsite CampsiteID)
MediaType	STRING	500	N	Type of Media, e.g. Image, Video, etc.
URL	STRING	2000	N	Internet address (URL) to the entity media
Title	STRING	500	N	Full title of the entity media
Subtitle	STRING	1000	Y	Optional subtitle of the entity media
Description	STRING	MAX*	Y	Optional description of the entity media
Credits	STRING	1000	Y	Optional credit for entity media
Height	INT		N	Height in pixels for media image
Width	INT		N	Width in pixels for the media image
EmbedCode	STRING	MAX*	Y	Optional embedded code for media entity
 */
	private String entityType;
	private int entityID;
	private String mediaType;
	private String uRL;
	private String title;
	private String subtitle;
	private String description;
	private String credits;
	private int height;
	private int width;
	private String embedCode;
	
	public String getEntityType() {
		return entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}
	public int getEntityID() {
		return entityID;
	}
	public void setEntityID(int entityID) {
		this.entityID = entityID;
	}
	public String getMediaType() {
		return mediaType;
	}
	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}
	public String getURL() {
		return uRL;
	}
	public void setURL(String uRL) {
		this.uRL = uRL;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCredits() {
		return credits;
	}
	public void setCredits(String credits) {
		this.credits = credits;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public String getEmbedCode() {
		return embedCode;
	}
	public void setEmbedCode(String embedCode) {
		this.embedCode = embedCode;
	}

	
}
