package config;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringCloudApplication
@EnableEurekaServer
public class SpringEurekaApplication {

	public static void main(final String[] args) {
		SpringApplication.run(SpringEurekaApplication.class, args);
	}

}
