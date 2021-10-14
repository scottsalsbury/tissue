package ca.trebleslate.tissue.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import ca.trebleslate.tissue.domain.Story;
import ca.trebleslate.tissue.service.impl.TissueDataServiceDB;

@WebMvcTest(TissueController.class)
public class TissueControllerTest {

	@Autowired
	private MockMvc mockMvc;
	@MockBean
	private TissueDataServiceDB db;

	@Test
	public void testGet_invalidStory() throws Exception {
		when(db.readStory(1l)).thenReturn(null);
		mockMvc.perform(get("/story/1")).andExpect(status().is(404));
	}

	@Test
	public void testGet_validStory() throws Exception {
		final Story s = new Story();
		s.setTitle("mock");
		when(db.readStory(1l)).thenReturn(s);
		mockMvc.perform(get("/story/1"))
				.andExpect(status().is(200))
				.andExpect(content().string("{\"id\":0,\"title\":\"mock\"}"));
	}
	@Test
	public void testPost() throws Exception {
		when(db.readStory(1l)).thenReturn(null);
		mockMvc.perform(post("/story").content("{\"description\":\"Pine\"}")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().is(201));
	}
}