package beans.prototype_1.com.example;

import beans.prototype_1.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context =
                new AnnotationConfigApplicationContext
                        (ProjectConfig.class);

        Parrot p = context.getBean("parrot1",Parrot.class);
        System.out.println(p.getName());
        Parrot p1 = context.getBean("parrot2",Parrot.class);
        System.out.println(p1.getName());
        Parrot p2 = context.getBean("parrot3",Parrot.class);
        System.out.println(p2.getName());




    }
}

