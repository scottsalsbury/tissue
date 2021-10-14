package ca.trebleslate.tissue.data;

import org.springframework.data.mongodb.repository.MongoRepository;

import ca.trebleslate.tissue.domain.Story;

public interface StoryRepository extends MongoRepository<Story, String> {

}
