package xyz.hollysys.spring.spring_scheduled.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableAsync
@EnableScheduling
@PropertySource(value = { "classpath:app.properties" }, ignoreResourceNotFound = true)
public class AppConfig {
	@Bean
	public FixRateJob job(){
		return new FixRateJob();
	}
	
	@Bean
	public CronJob cornJob(){
		return new CronJob();
	}

	@Bean
	public CronJobByProps propsJob(){
		return new CronJobByProps();
	}

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
       return new PropertySourcesPlaceholderConfigurer();
    }
}