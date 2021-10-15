package ca.trebleslate.tissue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import ca.trebleslate.tissue.data.StoryRepository;

@SpringBootTest
class TissueApplicationTests {
	@MockBean
	// To prevent Spring Boot from trying to auto-configure MongoDB.
	private StoryRepository repository;
	@Test
	void contextLoads() {
	}

}
