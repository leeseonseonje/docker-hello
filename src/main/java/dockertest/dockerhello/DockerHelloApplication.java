package dockertest.dockerhello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class DockerHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerHelloApplication.class, args);
	}

}
