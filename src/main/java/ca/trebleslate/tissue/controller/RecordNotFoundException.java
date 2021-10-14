package ca.trebleslate.tissue.controller;

public class RecordNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 7006784516502763789L;
	long id;
	public RecordNotFoundException(final long id) {
		super(String.format("Record id %1$d not found.", id));
		this.id = id;
	}
}
