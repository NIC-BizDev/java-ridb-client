package nicbizdev.ridb;

/**
 * @author aford_000
 *
 */
public class RIDBAttribute {
	/*
	AttributeName	STRING	60	Y	Attribute name
	AttributeValue	STRING	255	Y	Attribute value
	*/
	
	private String attributeName;
	private String attributeValue;
	
	public String getAttributeName() {
		return attributeName;
	}
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}
	public String getAttributeValue() {
		return attributeValue;
	}
	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}
	
}
