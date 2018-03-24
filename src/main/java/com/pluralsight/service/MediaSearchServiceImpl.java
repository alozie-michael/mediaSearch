package com.pluralsight.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.pluralsight.model.Items;
import com.pluralsight.model.MediaReport;
import com.pluralsight.model.MediaResult;

@Service("mediaSearchService")
public class MediaSearchServiceImpl implements MediaSearchService {

	protected ObjectMapper mapper = new ObjectMapper();

	public MediaReport getRequest(String url, Object... urlVariables) throws Exception {

		HttpEntity<String> requestObject = new HttpEntity<>(createRequestHeader());
		ResponseEntity<String> response = getResetTemplate().exchange(url, HttpMethod.GET, requestObject, String.class,
				urlVariables);

		return mapper.readValue(response.getBody(), MediaReport.class);
	}

	protected MultiValueMap<String, String> createRequestHeader() {

		MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
		headers.add("Accept", "application/json");
		headers.add("Content-Type", "application/json");

		return headers;
	}

	private RestTemplate getResetTemplate() {

		System.setProperty("http.proxyHost", "192.9.200.10");
		System.setProperty("http.proxyPort", "3128");
		System.setProperty("http.nonProxyHosts", StringUtils.EMPTY);

		return new RestTemplate();
	}

	public List<MediaResult> getMediaRequest(String url, String type, Object... urlVariables) throws Exception {

		String artistName = null;
		String albumName;
		String image = null;
		MediaReport mediaReport;
		MediaResult mediaResult;
		List<MediaResult> mediaResults = new ArrayList<MediaResult>();

		mediaReport = getRequest(url, urlVariables);

		if (type.equals("track")) {

			for (Items items : mediaReport.getTracks().getItems()) {

				albumName = items.getAlbum().getName();

				image = items.getAlbum().getImages().get(1).getUrl();

				artistName = items.getAlbum().getArtists().get(0).getName();

				mediaResult = new MediaResult(artistName, albumName, image);
				mediaResults.add(mediaResult);
			}

		} else if (type.equals("album")) {

			for (Items items : mediaReport.getAlbums().getItems()) {

				albumName = items.getName();

				image = items.getImages().get(1).getUrl();

				artistName = items.getArtists().get(0).getName();

				mediaResult = new MediaResult(artistName, albumName, image);

				mediaResults.add(mediaResult);
			}

		} else {
			throw new Exception();
		}

		return mediaResults;
	}

}