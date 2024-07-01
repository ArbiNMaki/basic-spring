package com.basic.spring.boot.core;

import com.basic.spring.boot.core.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
        "com.basic.spring.boot.core.configuration",
        "com.basic.spring.boot.core.service",
        "com.basic.spring.boot.core.repository",
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}
