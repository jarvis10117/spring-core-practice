package beans.prototype_3_stereotype.example;

import beans.prototype_3_stereotype.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext(
                        ProjectConfig.class);
        Parrot x = context.getBean(Parrot.class);
        x.setName("Kiki");
        System.out.println(x.getName());

    }
}