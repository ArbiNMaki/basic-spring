package com.basic.spring.boot.core;

import com.basic.spring.boot.core.configuration.BarConfiguration;
import com.basic.spring.boot.core.configuration.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {
        FooConfiguration.class,
        BarConfiguration.class
})
public class MainConfiguration {
}
