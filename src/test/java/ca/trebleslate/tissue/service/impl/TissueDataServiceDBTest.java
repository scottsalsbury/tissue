package ca.trebleslate.tissue.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import ca.trebleslate.tissue.domain.Story;

@ExtendWith(MockitoExtension.class)
public class TissueDataServiceDBTest {

	@Mock
	private EntityManager em;
	@InjectMocks
	private TissueDataServiceDB db;
	@Test
	public void testReadIssue_null() {
		Mockito.when(em.find(Story.class, 1l)).thenReturn(null);
		assertNull(db.readStory(1));
	}
	@Test
	public void testReadIssue_validId() {
		final Story s = new Story();
		s.setTitle("mock");
		Mockito.when(em.find(Story.class, 1l)).thenReturn(s);
		assertEquals("mock", db.readStory(1).getTitle());
	}
}
