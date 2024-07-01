package com.basic.spring.boot.core.event;

import com.basic.spring.boot.core.data.User;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

public class LoginSuccessEvent extends ApplicationEvent {

    @Getter
    private final User user;

    public LoginSuccessEvent(User user) {
        super(user);
        this.user = user;
    }
}
