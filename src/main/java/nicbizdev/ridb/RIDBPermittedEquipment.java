package nicbizdev.ridb;

/**
 * @author aford_000
 *
 */
public class RIDBPermittedEquipment {
/*
 * EquipmentName	STRING	255	N	Equipment Name
MaxLength	INT		Y	Maximum length of equipment
 */
	private String equipmentName;
	private int maxLength;
	
	public String getEquipmentName() {
		return equipmentName;
	}
	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}
	public int getMaxLength() {
		return maxLength;
	}
	public void setMaxLength(int maxLength) {
		this.maxLength = maxLength;
	}
	
}
