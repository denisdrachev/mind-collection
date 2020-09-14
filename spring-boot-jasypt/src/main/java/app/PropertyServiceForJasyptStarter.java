package app;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Slf4j
@Service
public class PropertyServiceForJasyptStarter {

    @Value("${encrypted.property}")
    private String property;
//
    public String getProperty() {
        return property;
    }

    public String getPasswordUsingEnvironment(Environment environment) {
        return environment.getProperty("encrypted.property");
    }

    @PostConstruct
    private void qqq() {
        log.info(getProperty());
//        System.err.println("aaz");
//        System.err.println(getProperty());
    }

}
