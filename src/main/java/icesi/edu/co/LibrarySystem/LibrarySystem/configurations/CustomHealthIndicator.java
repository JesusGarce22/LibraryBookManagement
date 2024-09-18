package icesi.edu.co.LibrarySystem.LibrarySystem.configurations;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component("customHealthIndicatorV1")
public class CustomHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        // Puedes realizar chequeos aquí, por ejemplo, conectividad con la base de datos
        boolean healthCheckPassed = true; // Cambia esto según tus necesidades

        if (healthCheckPassed) {
            return Health.up().withDetail("Custom Health Check", "Service is running").build();
        } else {
            return Health.down().withDetail("Custom Health Check", "Service is down").build();
        }
    }
}

