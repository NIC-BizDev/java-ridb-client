package nicbizdev.ridb;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RIDBOrganizationResponse {

	private List<RIDBOrganization> organizations;

	@JsonProperty("RECDATA")
	public List<RIDBOrganization> getOrganizations() {
		return organizations;
	}

	public void setOrganizations(List<RIDBOrganization> organizations) {
		this.organizations = organizations;
	}
}
