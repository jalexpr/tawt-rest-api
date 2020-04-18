package ru.textanalysis.tawt.rest.server.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("rest api")
                .apiInfo(metadata())
                .select()
                .apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot")))
                .paths(PathSelectors.any())
                .build()
                .useDefaultResponseMessages(false)
                ;
    }

    private ApiInfo metadata() {
        return new ApiInfoBuilder()
                .title("TAWT REST API")
                .description("Данный сервис для использование API фреймворка TAWT")
                .version("66b3ffb881")
                .build();
    }

}
