package local.kapinos;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 * Session Bean implementation class TestBean
 */
@Singleton
@Startup
public class TestBean implements TestBeanRemote, TestBeanLocal {
	
	Logger logger = Logger.getLogger(getClass().getName());
	
	@PostConstruct
	public void postConstruct() {
		logger.info("TestBean - postConstruct");
	}

	@PreDestroy
	public void preDestroy() {
		logger.info("TestBean - preDestroy");
	}

}
