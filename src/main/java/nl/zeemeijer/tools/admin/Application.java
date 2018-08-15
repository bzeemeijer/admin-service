package nl.zeemeijer.tools.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Spring Boot application implementing the Admin Server
 *
 * @author Bjorn Zeemeijer
 */
@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
public class Application {

    /**
     * Main entrypoint of the application.
     * 
     * @param args arguments passed to the application
     */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
