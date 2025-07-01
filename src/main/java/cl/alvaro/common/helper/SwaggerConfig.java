package cl.alvaro.common.helper;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "API de uso de JWT",
        version = "1.0",
        description = "Gestión de autenticación y usuarios",
        contact = @Contact(name = "Alvaro Vergara", email = "alvaro.vergara.cl@gmail.com")
    )
)
public class SwaggerConfig {

}
