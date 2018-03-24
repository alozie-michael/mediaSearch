package com.pluralsight.controller;

import java.util.Collections;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.pluralsight.model.Media;
import com.pluralsight.model.MediaResult;
import com.pluralsight.service.MediaSearchService;

@Controller
public class SearchMediaController {
	
	@Autowired
	MediaSearchService mediaSearchService;

	@RequestMapping(value = "/searchMedia", method = RequestMethod.GET)
	public String getMediaSearch(Model model) {
		Media track = new Media();
		model.addAttribute(track);
		return "mediaSearch";
	}

	@RequestMapping(value = "/searchMedia", method = RequestMethod.POST)
	public String processMediaSearch(@Valid Media media, BindingResult result, Model model,
			RedirectAttributes redirectAttr) throws Exception {

		/**
		 * returns user to same page if validation was not successful
		 */
		if (result.hasErrors()) {
			return "mediaSearch"; 
		}

		List<MediaResult> mediaResults = mediaSearchService.getMediaRequest(
				"https://api.spotify.com/v1/search?q=" + media.getName() + "&type=" + media.getType(), media.getType(),
				Collections.emptyMap());

		model.addAttribute("searchItem", media.getName());
		model.addAttribute("mediaResults", mediaResults);

		return "reportPage";
	}


}
