package app;

import io.micronaut.context.BeanContext;
import io.micronaut.context.annotation.Factory;

@Factory
public class MinimalApp {

    public static void main(String[] args) {
        BeanContext context = BeanContext.run();
        context.getBean(MinimalApp.class);
    }
}
