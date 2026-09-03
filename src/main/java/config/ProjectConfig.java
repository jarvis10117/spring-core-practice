package config;

import com.example.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class ProjectConfig {
    @Bean
    public Parrot parrot1(){
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }
    @Bean
    public Parrot parrot2(){
        var p = new Parrot();
        p.setName("Miki");
        return p;
    }
    @Bean
    public Parrot parrot3(){
        var p = new Parrot();
        p.setName("Riki");
        return p;
    }

}

