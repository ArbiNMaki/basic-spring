package com.basic.spring.boot.core.processor;

import com.basic.spring.boot.core.aware.IdAware;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class IdGeneratorBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("Id Generator Processor {}", beanName);
        if (bean instanceof IdAware idAware) {
            log.info("Set Id Generator for Bean {}", beanName);
            idAware.setId(UUID.randomUUID().toString());
        }

        return bean;
    }
}
