package ca.trebleslate.tissue.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ca.trebleslate.tissue.data.StoryRepository;
import ca.trebleslate.tissue.domain.Story;

@Component
public class TissueDataService {
	@Autowired
	private StoryRepository repository;

	public String createStory(final Story story) {
		repository.save(story);
		return story.getId();
	}

	public Story readStory(final String id) {
		return repository.findById(id).orElse(null);
	}

}
