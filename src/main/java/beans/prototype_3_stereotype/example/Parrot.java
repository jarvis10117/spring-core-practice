package beans.prototype_3_stereotype.example;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Parrot {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}