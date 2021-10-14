package ca.trebleslate.tissue.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import ca.trebleslate.tissue.data.StoryRepository;
import ca.trebleslate.tissue.domain.Story;
import ca.trebleslate.tissue.service.TissueDataService;

@ExtendWith(MockitoExtension.class)
public class TissueDataServiceTest {

	@Mock
	private StoryRepository repo;
	@InjectMocks
	private TissueDataService db;
	@Test
	public void testReadIssue_null() {
		Mockito.when(repo.findById("1")).thenReturn(Optional.empty());
		assertNull(db.readStory("1"));
	}
	@Test
	public void testReadIssue_validId() {
		final Story s = new Story();
		s.setTitle("mock");
		Mockito.when(repo.findById("1")).thenReturn(Optional.of(s));
		assertEquals("mock", db.readStory("1").getTitle());
	}
}
