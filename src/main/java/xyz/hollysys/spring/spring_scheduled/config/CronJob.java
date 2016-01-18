package xyz.hollysys.spring.spring_scheduled.config;

import org.springframework.scheduling.annotation.Scheduled;

public class CronJob {
	@Scheduled(cron="*/5 * * * * MON-FRI")
	public void doSomething() {
	    // something that should execute periodically
		System.out.println("hello cron job");
	}
}
