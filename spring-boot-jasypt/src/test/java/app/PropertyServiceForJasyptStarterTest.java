//package app;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.core.env.Environment;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class PropertyServiceForJasyptStarterTest {
//    @Test
//    public void whenDecryptedPasswordNeeded_GetFromService() {
//        System.setProperty("jasypt.encryptor.password", "password");
//        PropertyServiceForJasyptStarter service = appCtx
//                .getBean(PropertyServiceForJasyptStarter.class);
//
//        assertEquals("Password@1", service.getProperty());
//
//        Environment environment = appCtx.getBean(Environment.class);
//
//        assertEquals(
//                "Password@1",
//                service.getPasswordUsingEnvironment(environment));
//    }
//}