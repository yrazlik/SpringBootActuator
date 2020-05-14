package guru.springframework.actuator.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter;

public class CustomGuruMvcEndpoint extends EndpointMvcAdapter {

	//http://localhost:8080/customGuruEndpoint
	@Autowired
	public CustomGuruMvcEndpoint(CustomGuruEndpoint endpoint) {
		super(endpoint);
	}

}
