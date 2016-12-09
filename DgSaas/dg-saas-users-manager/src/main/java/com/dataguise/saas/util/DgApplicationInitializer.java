package com.dataguise.saas.util;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author Harinder Singh Bedi
 *
 */
@Component
public class DgApplicationInitializer implements ApplicationListener<ContextRefreshedEvent> {

	private static final Logger logger=Logger.getLogger(DgApplicationInitializer.class);
	
  @Override
  public void onApplicationEvent(final ContextRefreshedEvent event) {
	  logger.info("Init called");
  }
}