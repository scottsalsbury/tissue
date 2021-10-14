package ca.trebleslate.tissue.domain;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("stories")
public class Story {
	@Id
	private String id;
	@NotNull
	private String title;
	private TimeAndUncertainty time;
	private LocationAndUncertainty location;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public TimeAndUncertainty getTime() {
		return time;
	}

	public void setTime(TimeAndUncertainty time) {
		this.time = time;
	}

	public LocationAndUncertainty getLocation() {
		return location;
	}

	public void setLocation(LocationAndUncertainty location) {
		this.location = location;
	}

}
