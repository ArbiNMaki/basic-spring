package com.basic.spring.boot.core;

import com.basic.spring.boot.core.data.Bar;
import com.basic.spring.boot.core.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext =
                new AnnotationConfigApplicationContext(MainConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testImport() {
        Foo foo = applicationContext.getBean(Foo.class);
        Bar bar = applicationContext.getBean(Bar.class);
    }
}
