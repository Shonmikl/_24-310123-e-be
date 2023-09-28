package org.example._2023_09_28.aop1.pointCut;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* do*())")
    private void doService() {
    }

    @Before("doService()")
    public void logging() {
        System.out.println("Before + Pointcut Logging......");
    }
}

@Component("service")
class PointCutService {
    public void doSmth() {
        System.out.println("DO SMTH");
    }

    public void doONE() {
        System.out.println("DO ONE");
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(PointcutConfig.class);
        PointCutService pointCutService = context.getBean("service", PointCutService.class);

        pointCutService.doONE();
        context.close();
    }
}