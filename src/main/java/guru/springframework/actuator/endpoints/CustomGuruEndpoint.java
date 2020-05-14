package guru.springframework.actuator.endpoints;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.actuate.endpoint.AbstractEndpoint;
import org.springframework.stereotype.Component;

@Component
public class CustomGuruEndpoint extends AbstractEndpoint<List<String>>{

	//http://localhost:8080/customGuruEndpoint
	public CustomGuruEndpoint() {
		super("customGuruEndpoint", false);
	}

	@Override
	public List<String> invoke() {
		List<String> list = new ArrayList<String>();
		list.add("Yasin");
		list.add("Razlik");
		return list;
	}
	
	

}
