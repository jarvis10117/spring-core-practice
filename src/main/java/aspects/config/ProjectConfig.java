package aspects.config;

import aspects.aspect.LoggingAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "aspects")
@EnableAspectJAutoProxy
public class ProjectConfig {
    @Bean
    public LoggingAspect loggingAspect(){
        return new LoggingAspect();
    }
}
