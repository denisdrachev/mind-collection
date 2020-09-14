package app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(value = "/")
    public String getRequest() {
        return getException();
    }

    private String getException() {
        throw new SimpleException();
    }
}
