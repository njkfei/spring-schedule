package xyz.hollysys.spring.spring_scheduled;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import xyz.hollysys.spring.spring_scheduled.config.AppConfig;

public class AppMain {
	public static void main(String args[]) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	}
}