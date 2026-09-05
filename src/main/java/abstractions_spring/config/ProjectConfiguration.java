package abstractions_spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        basePackages = {"abstractions_spring.proxies",
                        "abstractions_spring.service",
                        "abstractions_spring.repositories"}
)
public class ProjectConfiguration {
}
