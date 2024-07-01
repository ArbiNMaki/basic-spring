package com.basic.spring.boot.core;

import com.basic.spring.boot.core.application.FooApplication;
import com.basic.spring.boot.core.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WithoutSpringBootTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext =
                new AnnotationConfigApplicationContext(FooApplication.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testNull() {
        Foo foo = applicationContext.getBean(Foo.class);
    }
}
