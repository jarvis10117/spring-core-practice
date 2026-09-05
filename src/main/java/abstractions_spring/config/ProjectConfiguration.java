package abstractions_spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        basePackages = {"abstractions.proxies","abstractions.service","abstractions.repositories"}
)
public class ProjectConfiguration {
}
