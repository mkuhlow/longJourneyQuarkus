package longJourney;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;


@QuarkusTest
public class GreetingResourceGqlTest {

    @Inject
    GreetingResource greetingResource;

    @Test
    public void testGreeting() {
        Assertions.assertEquals("hello Franz" , greetingResource.greeting("Franz"));
    }

    @Test
    public void testHello() {
        Assertions.assertEquals("Hello RESTEasy", greetingResource.hello());
    }

    }


