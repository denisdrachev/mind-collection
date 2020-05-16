package main;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class Controller {

    JsonSchemaValidator validator;

    @RequestMapping("/validation")
    public String validate(@RequestBody String body) {
        try {
            return validator.validate(body);
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
