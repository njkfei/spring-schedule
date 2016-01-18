package xyz.hollysys.spring.spring_scheduled.config;

import org.springframework.scheduling.annotation.Scheduled;

public class FixRateJob {
	@Scheduled(initialDelay=1000, fixedRate=5000)
	public void doSomething() {
	    // something that should execute periodically
		System.out.println("hello fixedRate job");
	}
}
