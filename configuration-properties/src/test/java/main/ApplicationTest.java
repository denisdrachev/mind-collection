package main;

import main.properties.ConfigProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTest {

    @Autowired
    ConfigProperties configProperties;

    @Test
    void say() {
        System.err.println(configProperties);
    }
}