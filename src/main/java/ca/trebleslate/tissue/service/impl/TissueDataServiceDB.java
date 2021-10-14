package ca.trebleslate.tissue.service.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import ca.trebleslate.tissue.domain.Story;

@Repository
public class TissueDataServiceDB {
	@PersistenceContext EntityManager em;
	public long createStory(final Story story) {
		story.setId(0);
		em.persist(story);
		return story.getId();
	}
	
	public Story readStory(final long id) {
		return em.find(Story.class, id);
	}

}
