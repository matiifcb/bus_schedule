package pl.library.web.boundry;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Stateless
@Path("/")
public class PersonResource {

	@GET
	@Path("/json")
	public String sayHello() {
		return "Hi ";
	}

}
