package app;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping(path = "/hello/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String hello(@PathVariable String name) {
        return "Hello " + name + "!";
    }
}
