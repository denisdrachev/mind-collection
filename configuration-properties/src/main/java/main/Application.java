package main;

import lombok.extern.slf4j.Slf4j;
import main.properties.ConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@ConfigurationPropertiesScan("main.properties")
@SpringBootApplication
@EnableScheduling
@Slf4j
public class Application {

    @Autowired
    ConfigProperties configProperties;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    //    @Bean
    @Scheduled(fixedDelay = 1000)
    boolean say() {
        log.info("isMailSend: {}", configProperties.isMailSend());
//        System.err.println(configProperties.isMailSend());
//        System.err.println(configProperties.isUsersDefaultActive());
//        System.err.println(configProperties.getTest());
        return true;
    }

}
