package guru.springframework.actuator.health;

import java.util.Random;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator{

	private Random random = new Random();
	
	@Override
	public Health health() {
		if(random.nextBoolean()) {
			return health().down().withDetail("ERR-001", "Random failure").build();
		}
		
		return Health.up().build();
	}

}
