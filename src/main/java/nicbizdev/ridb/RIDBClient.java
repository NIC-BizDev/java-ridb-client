package nicbizdev.ridb;

import com.google.common.collect.ImmutableMap;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class RIDBClient {

	private final String API_KEY;
	private static final String QUERY_PARAM = "query";
	private static final String LIMIT_PARAM = "limit";
	private static final String OFFSET_PARAM = "offset";
	
	public RIDBClient(String apiKey) {
		this.API_KEY = apiKey;
	}
	
	public List<RIDBOrganization> getAllOrganizations() {
		String url = RIDBUrl.createRidbUrl("/organizations", API_KEY);
		RIDBOrganizationResponse response = new RestTemplate().getForObject(url, RIDBOrganizationResponse.class);
		return response.getOrganizations();
	}
	
	public List<RIDBOrganization> getAllOrganizations(String query, int limit, int offset) {
		String url = RIDBUrl.createRidbUrl("/organizations", API_KEY,
				new ImmutableMap.Builder<String, Object>().put(QUERY_PARAM, query)
						.put(LIMIT_PARAM, limit).put(OFFSET_PARAM, offset).build());
		RIDBOrganizationResponse response = new RestTemplate().getForObject(url, RIDBOrganizationResponse.class);
		return response.getOrganizations();
	}

	public List<RIDBTour> getAllTours() {
		String url = RIDBUrl.createRidbUrl("/tours", API_KEY);
		RIDBAllToursResponse response = new RestTemplate().getForObject(url, RIDBAllToursResponse.class);
		return response.getTours();
	}
	
	
}
