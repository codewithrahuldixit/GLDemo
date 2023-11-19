package in.bushansirgur.springbootthymeleaf.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {
	private Logger logger = LoggerFactory.getLogger(getClass());
    
	@Before("execution (* in.bushansirgur.springbootthymeleaf.*.*.*(..))")
	public void logMethodBeforeCall(JoinPoint joinpoint ) {
		logger.info("Before Method is Called - {}",joinpoint);
	}
	
	@After("execution (* in.bushansirgur.springbootthymeleaf.*.*.*(..))")
	public void logMethodAfterCall(JoinPoint joinpoint ) {
		logger.info("After Method is Called - {}",joinpoint);
	}
}
