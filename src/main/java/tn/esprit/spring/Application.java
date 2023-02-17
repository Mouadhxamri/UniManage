package tn.esprit.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("tn.esprit.spring.Repositories")
@EnableSpringConfigured

/*
@ComponentScan({"com.delivery.request"})
@EntityScan("com.delivery.domain")
@EnableJpaRepositories("tn.spring.springboot.Repository")
*/

 public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
