package nicbizdev.ridb;

/**
 * @author aford_000
 *
 */
public class RIDBEntityLink {
/*
 * EntityType	STRING	50	N	RecArea or Facility
EntityID	INT		N	Foreign Key: (RecArea RecAreaID) OR (Facility FacilityID)
LinkType	STRING	500	N	Type of link, e.g. Facebook, Twitter, Official site
URL	STRING	2000	N	Internet address (URL) to a web site
Title	STRING	500	N	Full text title
Description	STRING	MAX*	Y	Text description of the entity link
 */
	
	private String entityType;
	private int entityID;
	private String linkType;
	private String uRL;
	private String title;
	private String description;
	
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
	public String getLinkType() {
		return linkType;
	}
	public void setLinkType(String linkType) {
		this.linkType = linkType;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
}
