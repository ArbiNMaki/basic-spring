package com.basic.spring.boot.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.basic.spring.boot.core.service"
})
public class ComponentConfiguration {
}
