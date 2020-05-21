package main;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

public class CarTest {

    @Test
    public void objectToJsonTest() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Car car = new Car("yellow", "renault");
        Object o = (Object) car;
        String s = objectMapper.writeValueAsString(o);
        System.err.println(s);
    }

}