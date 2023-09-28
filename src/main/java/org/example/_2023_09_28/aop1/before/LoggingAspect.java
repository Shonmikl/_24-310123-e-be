package org.example._2023_09_28.aop1.before;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(public void show())")
    public void logging() {
        System.out.println("Logging......");
    }
}

@Configuration
@ComponentScan(basePackages = "org.example._2023_09_28.aop1")
@EnableAspectJAutoProxy
class AspectConfiguration {

}

@Component("service")
class ServiceA {
    public void show() {
        System.out.println("SHOW MUST GO ON!!!!");
    }
}

class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AspectConfiguration.class);
        ServiceA serviceA = context.getBean("service", ServiceA.class);

        serviceA.show();
        context.close();
    }
}