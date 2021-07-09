package longJourney;

import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;

@GraphQLApi
public class GreetingResource {

	@Inject
	GreetingService greetingService;

	@Query("GreetingWithName")
	@Description("Get a String with the name")
	public String greeting(@PathParam String name) {
		return greetingService.greeting(name);
	}

	@Query("Greeting")
	@Description("Get a simple example greeting")
	public String hello() {
		return "Hello RESTEasy";
	}

}