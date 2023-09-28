package org.example._2023_09_28.aop1.pointCut;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "org.example._2023_09_28.aop1.pointCut")
@EnableAspectJAutoProxy
public class PointcutConfig {
}
