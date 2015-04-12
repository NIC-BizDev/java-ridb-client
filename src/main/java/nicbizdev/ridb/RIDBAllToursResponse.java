package nicbizdev.ridb;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RIDBAllToursResponse {

	private List<RIDBTour> tours;

	@JsonProperty("RECDATA")
	public List<RIDBTour> getTours() {
		return tours;
	}

	public void setTours(List<RIDBTour> tours) {
		this.tours = tours;
	}
}
