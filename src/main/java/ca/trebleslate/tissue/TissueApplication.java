package ca.trebleslate.tissue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TissueApplication {
	private static final Log logger = LogFactory.getLog(TissueApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TissueApplication.class, args);
	}

}
