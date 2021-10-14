package ca.trebleslate.tissue.controller;

import javax.transaction.Transactional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ca.trebleslate.tissue.domain.Story;
import ca.trebleslate.tissue.service.impl.TissueDataServiceDB;

@RestController
public class TissueController {
	private static final Log logger = LogFactory.getLog(TissueController.class);

	@Autowired
	private final TissueDataServiceDB dataService;

	public TissueController(final TissueDataServiceDB dataService) {
		this.dataService = dataService;
	}
	@PostMapping("/story")
	@Transactional
	@ResponseStatus( HttpStatus.CREATED )
	public long createStory(final @RequestBody Story story) {
		// curl -i -s -XPOST http://localhost:8080/story -H "Content-Type: application/json" -d '{"title":"Pine"}'
		logger.debug("Creating story " + story.getTitle());
		return dataService.createStory(story);
	}
	@GetMapping("/story/{id}")
	@Transactional
	public Story readStory(final @PathVariable long id) throws Exception {
		// curl -i -s -XGET http://localhost:8080/story/1
		final Story s = dataService.readStory(id);
		if (null == s) {
			throw new RecordNotFoundException(id);
		}
		return s;
	}
}
