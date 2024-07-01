package com.basic.spring.boot.core;

import com.basic.spring.boot.core.listener.LoginAgainSuccessListener;
import com.basic.spring.boot.core.listener.LoginSuccessListener;
import com.basic.spring.boot.core.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class EventListenerTest {

    @Configuration
    @Import({
            LoginSuccessListener.class,
            UserService.class,
            LoginAgainSuccessListener.class
    })
    public static class TestConfiguration {
    }

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext =
                new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testEvent() {
        UserService userService = applicationContext.getBean(UserService.class);

        userService.login("arbi", "secret");
        userService.login("arbi", "salah");
        userService.login("kalista", "secret");
    }
}
