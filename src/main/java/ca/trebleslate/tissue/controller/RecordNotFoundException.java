package ca.trebleslate.tissue.controller;

public class RecordNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 7006784516502763789L;
	private final String id;
	public RecordNotFoundException(final String id) {
		super(String.format("Record id %1$s not found.", id));
		this.id = id;
	}
	public String getId() {
		return id;
	}
}
