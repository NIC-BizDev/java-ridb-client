package nicbizdev.ridb;

import org.springframework.web.util.UriComponentsBuilder;

import java.util.Map;

public class RIDBUrl {

	private static final String BASE_URL = "ridb.recreation.gov/api/v1/";
	private static final String SCHEME = "https";
	private static final String API_PARAM = "apikey";

	public static String createRidbUrl(String path, String apiKey) {
		return UriComponentsBuilder.newInstance().scheme(SCHEME).host(BASE_URL)
				.path(path).queryParam(API_PARAM, apiKey).build().toUriString();
	}

	public static String createRidbUrl(String path, String apiKey, Map<String, Object> params) {
		UriComponentsBuilder builder = UriComponentsBuilder.newInstance()
				.scheme(SCHEME).host(BASE_URL).path(path).queryParam(API_PARAM, apiKey);
		for (Map.Entry<String, Object> param : params.entrySet()) {
			builder.queryParam(param.getKey(), param.getValue());
		}
		return builder.build().toUriString();
	}

}
