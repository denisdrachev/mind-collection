package main;

import org.everit.json.schema.Schema;
import org.everit.json.schema.ValidationException;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {

    @Test
    void validate() throws ValidationException {
        JSONObject jsonSchema = new JSONObject(
                new JSONTokener(ControllerTest.class.getResourceAsStream("registry-schema.json")));
        JSONObject jsonSubject = new JSONObject(
                new JSONTokener(ControllerTest.class.getResourceAsStream("/product_invalid.json")));

        Schema schema = SchemaLoader.load(jsonSchema);
        schema.validate(jsonSubject);
    }
}