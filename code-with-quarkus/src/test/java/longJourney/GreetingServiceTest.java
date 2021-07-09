package longJourney;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@QuarkusTest
public class GreetingServiceTest {

    @Inject
    GreetingService greetingService;

    @Test
    public void testGreetingService() {
        Assertions.assertEquals("hello Franz", greetingService.greeting("Franz"));
    }
}
