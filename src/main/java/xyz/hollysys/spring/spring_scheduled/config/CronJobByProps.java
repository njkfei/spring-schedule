package xyz.hollysys.spring.spring_scheduled.config;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;

public class CronJobByProps {
	@Scheduled(cron="${app.cron:*/3 * * * * MON-FRI}")
	public void doSomething() {
	    // something that should execute periodically
		System.out.println(new Date() + "　==> hello cron job by properties");
	}
}
