package tn.esprit.spring.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityScheme;


import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(infoAPI());

    }

    public Info infoAPI() {
        return new Info().title("Kadddem")
                .description("school project")
                .contact(contactAPI());
    }

    public Contact contactAPI() {
        Contact contact = new Contact().name("Mouadh El Amri")
                .email("mouadh.elamri@esprit.tn")
        return contact;
    }


}

