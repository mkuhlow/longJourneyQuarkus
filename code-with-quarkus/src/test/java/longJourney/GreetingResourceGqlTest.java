package longJourney;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.hamcrest.Matchers;
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


    //String query = "{Greeting}";

    /*
    @Test
    public void testQuery2() {
        RestAssured.given()
                .when()
                .post("/graphql")
                .then()
                .statusCode(200)
                .body("data", Matchers.notNullValue());
    }

    @Test
    public void testQuery() {
        RestAssured.given()
                .when()
                .contentType("application/json")
                .body(query)
                .post("/graphql")
                .then()
                .statusCode(200)
                .body("data", Matchers.notNullValue());
    }*/
    }


