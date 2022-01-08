package dockertest.dockerhello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class DockerHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerHelloApplication.class, args);
	}

}
