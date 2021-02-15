package bj.springboot.ocproject.webappemp;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;


@Configuration
@ConfigurationProperties(prefix = "bj.springboot.ocproject.webappemp")
@Data
public class CustomProperties {

    private String apiUrl;

}