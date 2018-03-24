package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.MediaReport;
import com.pluralsight.model.MediaResult;

public interface MediaSearchService {

	MediaReport getRequest(String url, Object... urlVariables) throws Exception;
	
	List<MediaResult> getMediaRequest(String url, String type, Object... urlVariables) throws Exception;

}
