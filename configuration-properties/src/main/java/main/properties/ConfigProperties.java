package main.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("options")
public class ConfigProperties {
    int test;
    @Value("${options.mail.send}")
    boolean mailSend;
    @Value("${options.users.default.active}")
    boolean usersDefaultActive;
}
